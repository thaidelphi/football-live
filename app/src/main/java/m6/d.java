package m6;
/* compiled from: Protobuf.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public @interface d {

    /* compiled from: Protobuf.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
