package m1;

import androidx.work.WorkerParameters;
/* compiled from: StartWorkRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private e1.i f27640a;

    /* renamed from: b  reason: collision with root package name */
    private String f27641b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f27642c;

    public h(e1.i iVar, String str, WorkerParameters.a aVar) {
        this.f27640a = iVar;
        this.f27641b = str;
        this.f27642c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f27640a.u().k(this.f27641b, this.f27642c);
    }
}
