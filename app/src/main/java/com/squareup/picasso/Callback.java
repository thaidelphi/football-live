package com.squareup.picasso;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface Callback {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class EmptyCallback implements Callback {
        @Override // com.squareup.picasso.Callback
        public void onError(Exception exc) {
        }

        @Override // com.squareup.picasso.Callback
        public void onSuccess() {
        }
    }

    void onError(Exception exc);

    void onSuccess();
}
