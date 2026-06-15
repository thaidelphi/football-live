package a1;

import a1.m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q extends m {
    int M;
    private ArrayList<m> K = new ArrayList<>();
    private boolean L = true;
    boolean N = false;
    private int O = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f175a;

        a(m mVar) {
            this.f175a = mVar;
        }

        @Override // a1.m.f
        public void d(m mVar) {
            this.f175a.V();
            mVar.R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f177a;

        b(q qVar) {
            this.f177a = qVar;
        }

        @Override // a1.n, a1.m.f
        public void c(m mVar) {
            q qVar = this.f177a;
            if (qVar.N) {
                return;
            }
            qVar.c0();
            this.f177a.N = true;
        }

        @Override // a1.m.f
        public void d(m mVar) {
            q qVar = this.f177a;
            int i10 = qVar.M - 1;
            qVar.M = i10;
            if (i10 == 0) {
                qVar.N = false;
                qVar.r();
            }
            mVar.R(this);
        }
    }

    private void h0(m mVar) {
        this.K.add(mVar);
        mVar.f151r = this;
    }

    private void q0() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().c(bVar);
        }
        this.M = this.K.size();
    }

    @Override // a1.m
    public void P(View view) {
        super.P(view);
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.get(i10).P(view);
        }
    }

    @Override // a1.m
    public void T(View view) {
        super.T(view);
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.get(i10).T(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a1.m
    public void V() {
        if (this.K.isEmpty()) {
            c0();
            r();
            return;
        }
        q0();
        if (!this.L) {
            for (int i10 = 1; i10 < this.K.size(); i10++) {
                this.K.get(i10 - 1).c(new a(this.K.get(i10)));
            }
            m mVar = this.K.get(0);
            if (mVar != null) {
                mVar.V();
                return;
            }
            return;
        }
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().V();
        }
    }

    @Override // a1.m
    public void X(m.e eVar) {
        super.X(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.get(i10).X(eVar);
        }
    }

    @Override // a1.m
    public void Z(g gVar) {
        super.Z(gVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                this.K.get(i10).Z(gVar);
            }
        }
    }

    @Override // a1.m
    public void a0(p pVar) {
        super.a0(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.get(i10).a0(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // a1.m
    public String d0(String str) {
        String d02 = super.d0(str);
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(d02);
            sb.append("\n");
            sb.append(this.K.get(i10).d0(str + "  "));
            d02 = sb.toString();
        }
        return d02;
    }

    @Override // a1.m
    /* renamed from: e0 */
    public q c(m.f fVar) {
        return (q) super.c(fVar);
    }

    @Override // a1.m
    /* renamed from: f0 */
    public q d(View view) {
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            this.K.get(i10).d(view);
        }
        return (q) super.d(view);
    }

    public q g0(m mVar) {
        h0(mVar);
        long j10 = this.f136c;
        if (j10 >= 0) {
            mVar.W(j10);
        }
        if ((this.O & 1) != 0) {
            mVar.Y(u());
        }
        if ((this.O & 2) != 0) {
            mVar.a0(y());
        }
        if ((this.O & 4) != 0) {
            mVar.Z(x());
        }
        if ((this.O & 8) != 0) {
            mVar.X(t());
        }
        return this;
    }

    @Override // a1.m
    public void i(s sVar) {
        if (I(sVar.f182b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.I(sVar.f182b)) {
                    next.i(sVar);
                    sVar.f183c.add(next);
                }
            }
        }
    }

    public m i0(int i10) {
        if (i10 < 0 || i10 >= this.K.size()) {
            return null;
        }
        return this.K.get(i10);
    }

    public int j0() {
        return this.K.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // a1.m
    public void k(s sVar) {
        super.k(sVar);
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.get(i10).k(sVar);
        }
    }

    @Override // a1.m
    /* renamed from: k0 */
    public q R(m.f fVar) {
        return (q) super.R(fVar);
    }

    @Override // a1.m
    public void l(s sVar) {
        if (I(sVar.f182b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.I(sVar.f182b)) {
                    next.l(sVar);
                    sVar.f183c.add(next);
                }
            }
        }
    }

    @Override // a1.m
    /* renamed from: l0 */
    public q S(View view) {
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            this.K.get(i10).S(view);
        }
        return (q) super.S(view);
    }

    @Override // a1.m
    /* renamed from: m0 */
    public q W(long j10) {
        ArrayList<m> arrayList;
        super.W(j10);
        if (this.f136c >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.K.get(i10).W(j10);
            }
        }
        return this;
    }

    @Override // a1.m
    /* renamed from: n0 */
    public q Y(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.K.get(i10).Y(timeInterpolator);
            }
        }
        return (q) super.Y(timeInterpolator);
    }

    @Override // a1.m
    /* renamed from: o */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            qVar.h0(this.K.get(i10).clone());
        }
        return qVar;
    }

    public q o0(int i10) {
        if (i10 == 0) {
            this.L = true;
        } else if (i10 == 1) {
            this.L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    @Override // a1.m
    /* renamed from: p0 */
    public q b0(long j10) {
        return (q) super.b0(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a1.m
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long A = A();
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.K.get(i10);
            if (A > 0 && (this.L || i10 == 0)) {
                long A2 = mVar.A();
                if (A2 > 0) {
                    mVar.b0(A2 + A);
                } else {
                    mVar.b0(A);
                }
            }
            mVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
