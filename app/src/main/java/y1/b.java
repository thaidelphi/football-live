package y1;
/* compiled from: CallbackException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b extends RuntimeException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
