package y1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DecodePath.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<DataType> f32919a;

    /* renamed from: b  reason: collision with root package name */
    private final List<? extends w1.j<DataType, ResourceType>> f32920b;

    /* renamed from: c  reason: collision with root package name */
    private final k2.e<ResourceType, Transcode> f32921c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.core.util.f<List<Throwable>> f32922d;

    /* renamed from: e  reason: collision with root package name */
    private final String f32923e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodePath.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a<ResourceType> {
        v<ResourceType> a(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends w1.j<DataType, ResourceType>> list, k2.e<ResourceType, Transcode> eVar, androidx.core.util.f<List<Throwable>> fVar) {
        this.f32919a = cls;
        this.f32920b = list;
        this.f32921c = eVar;
        this.f32922d = fVar;
        this.f32923e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, w1.h hVar) throws q {
        List<Throwable> list = (List) s2.j.d(this.f32922d.b());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f32922d.a(list);
        }
    }

    private v<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, w1.h hVar, List<Throwable> list) throws q {
        int size = this.f32920b.size();
        v<ResourceType> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            w1.j<DataType, ResourceType> jVar = this.f32920b.get(i12);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    vVar = jVar.a(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e8) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e8);
                }
                list.add(e8);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f32923e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, w1.h hVar, a<ResourceType> aVar) throws q {
        return this.f32921c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f32919a + ", decoders=" + this.f32920b + ", transcoder=" + this.f32921c + '}';
    }
}
