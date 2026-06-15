package y2;
/* compiled from: MultiplePulse.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends x2.g {
    @Override // x2.g
    public void N(x2.f... fVarArr) {
        int i10 = 0;
        while (i10 < fVarArr.length) {
            x2.f fVar = fVarArr[i10];
            i10++;
            fVar.t(i10 * 200);
        }
    }

    @Override // x2.g
    public x2.f[] O() {
        return new x2.f[]{new i(), new i(), new i()};
    }
}
