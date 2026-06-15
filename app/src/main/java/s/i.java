package s;

import java.util.ArrayList;
import java.util.Arrays;
import t.o;
/* compiled from: HelperWidget.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends e implements h {
    public e[] D0 = new e[4];
    public int E0 = 0;

    @Override // s.h
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.E0 + 1;
        e[] eVarArr = this.D0;
        if (i10 > eVarArr.length) {
            this.D0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.D0;
        int i11 = this.E0;
        eVarArr2[i11] = eVar;
        this.E0 = i11 + 1;
    }

    public void a1(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.E0; i11++) {
            oVar.a(this.D0[i11]);
        }
        for (int i12 = 0; i12 < this.E0; i12++) {
            t.i.a(this.D0[i12], i10, arrayList, oVar);
        }
    }

    @Override // s.h
    public void b(f fVar) {
    }

    public int b1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.E0; i13++) {
            e eVar = this.D0[i13];
            if (i10 == 0 && (i12 = eVar.A0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.B0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // s.h
    public void c() {
        this.E0 = 0;
        Arrays.fill(this.D0, (Object) null);
    }
}
