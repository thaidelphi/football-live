package y1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y1.i;
/* compiled from: LoadPath.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<Data> f33015a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.core.util.f<List<Throwable>> f33016b;

    /* renamed from: c  reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f33017c;

    /* renamed from: d  reason: collision with root package name */
    private final String f33018d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, androidx.core.util.f<List<Throwable>> fVar) {
        this.f33015a = cls;
        this.f33016b = fVar;
        this.f33017c = (List) s2.j.c(list);
        this.f33018d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, w1.h hVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        int size = this.f33017c.size();
        v<Transcode> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = this.f33017c.get(i12).a(eVar, i10, i11, hVar, aVar);
            } catch (q e8) {
                list.add(e8);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f33018d, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, w1.h hVar, int i10, int i11, i.a<ResourceType> aVar) throws q {
        List<Throwable> list = (List) s2.j.d(this.f33016b.b());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f33016b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f33017c.toArray()) + '}';
    }
}
