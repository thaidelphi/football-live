package j4;

import a5.l0;
import a5.x;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.unity3d.services.core.device.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n3.m1;
import o3.q1;
import w3.z;
/* compiled from: DefaultHlsExtractorFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f26943d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f26944b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f26945c;

    public d() {
        this(0, true);
    }

    private static void b(int i10, List<Integer> list) {
        if (a6.b.g(f26943d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    @SuppressLint({"SwitchIntDef"})
    private s3.i d(int i10, m1 m1Var, List<m1> list, l0 l0Var) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 7) {
                        if (i10 != 8) {
                            if (i10 != 11) {
                                if (i10 != 13) {
                                    return null;
                                }
                                return new s(m1Var.f28176c, l0Var);
                            }
                            return f(this.f26944b, this.f26945c, m1Var, list, l0Var);
                        }
                        return e(l0Var, m1Var, list);
                    }
                    return new u3.e(0, 0L);
                }
                return new w3.e();
            }
            return new w3.c();
        }
        return new w3.a();
    }

    private static v3.f e(l0 l0Var, m1 m1Var, List<m1> list) {
        int i10 = g(m1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new v3.f(i10, l0Var, null, list);
    }

    private static z f(int i10, boolean z10, m1 m1Var, List<m1> list, l0 l0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else if (z10) {
            list = Collections.singletonList(new m1.b().e0("application/cea-608").E());
        } else {
            list = Collections.emptyList();
        }
        String str = m1Var.f28182i;
        if (!TextUtils.isEmpty(str)) {
            if (!x.b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!x.b(str, MimeTypes.VIDEO_H264)) {
                i11 |= 4;
            }
        }
        return new z(2, l0Var, new w3.g(i11, list));
    }

    private static boolean g(m1 m1Var) {
        Metadata.Entry d10;
        Metadata metadata = m1Var.f28183j;
        if (metadata == null) {
            return false;
        }
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            if (metadata.d(i10) instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) d10).f10806c.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(s3.i iVar, s3.j jVar) throws IOException {
        try {
            boolean c10 = iVar.c(jVar);
            jVar.e();
            return c10;
        } catch (EOFException unused) {
            jVar.e();
            return false;
        } catch (Throwable th) {
            jVar.e();
            throw th;
        }
    }

    @Override // j4.h
    /* renamed from: c */
    public b a(Uri uri, m1 m1Var, List<m1> list, l0 l0Var, Map<String, List<String>> map, s3.j jVar, q1 q1Var) throws IOException {
        int a10 = a5.l.a(m1Var.f28185l);
        int b10 = a5.l.b(map);
        int c10 = a5.l.c(uri);
        int[] iArr = f26943d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        s3.i iVar = null;
        jVar.e();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            s3.i iVar2 = (s3.i) a5.a.e(d(intValue, m1Var, list, l0Var));
            if (h(iVar2, jVar)) {
                return new b(iVar2, m1Var, l0Var);
            }
            if (iVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                iVar = iVar2;
            }
        }
        return new b((s3.i) a5.a.e(iVar), m1Var, l0Var);
    }

    public d(int i10, boolean z10) {
        this.f26944b = i10;
        this.f26945c = z10;
    }
}
