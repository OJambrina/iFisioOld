package com.ojambrina.ifisio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class FirebaseController {
    FirebaseFirestore db;
    FirebaseResponse handler;

    public FirebaseController(FirebaseResponse handler) {
        db = FirebaseFirestore.getInstance();
        this.handler = handler;
    }

    public void getUserList() {
        CollectionReference docRef = db.collection("usuarios");
        docRef.get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                List<Usuario> users = queryDocumentSnapshots.toObjects(Usuario.class);
                if (users != null) {
                    Log.d("FIREBASE CONTROLLER", users.size()+"");
                    handler.onSuccess(users);
                }
            }
        }).addOnCanceledListener(new OnCanceledListener() {
            @Override
            public void onCanceled() {
                handler.onCanceled();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                handler.onFailure(e);
            }
        });
    }

    interface FirebaseResponse {
        void onSuccess(List<Usuario> users);
        void onCanceled();
        void onFailure(Exception e);
    }

}
