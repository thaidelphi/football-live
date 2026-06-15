package o6;
/* compiled from: HeartBeatInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface j {

    /* compiled from: HeartBeatInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29463a;

        a(int i10) {
            this.f29463a = i10;
        }

        public int a() {
            return this.f29463a;
        }
    }

    a b(String str);
}
