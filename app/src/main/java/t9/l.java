package t9;

import java.io.IOException;
import java.util.List;
/* compiled from: PushObserver.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f31247a = new a();

    /* compiled from: PushObserver.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements l {
        a() {
        }

        @Override // t9.l
        public boolean a(int i10, y9.e eVar, int i11, boolean z10) throws IOException {
            eVar.c(i11);
            return true;
        }

        @Override // t9.l
        public boolean b(int i10, List<c> list) {
            return true;
        }

        @Override // t9.l
        public boolean c(int i10, List<c> list, boolean z10) {
            return true;
        }

        @Override // t9.l
        public void d(int i10, b bVar) {
        }
    }

    boolean a(int i10, y9.e eVar, int i11, boolean z10) throws IOException;

    boolean b(int i10, List<c> list);

    boolean c(int i10, List<c> list, boolean z10);

    void d(int i10, b bVar);
}
