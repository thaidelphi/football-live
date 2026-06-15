package y1;

import a2.a;
import java.io.File;
/* compiled from: DataCacheWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class e<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final w1.d<DataType> f32850a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f32851b;

    /* renamed from: c  reason: collision with root package name */
    private final w1.h f32852c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(w1.d<DataType> dVar, DataType datatype, w1.h hVar) {
        this.f32850a = dVar;
        this.f32851b = datatype;
        this.f32852c = hVar;
    }

    @Override // a2.a.b
    public boolean a(File file) {
        return this.f32850a.b(this.f32851b, file, this.f32852c);
    }
}
