package k4;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n3.m1;
/* compiled from: HlsMultivariantPlaylist.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends i {

    /* renamed from: n  reason: collision with root package name */
    public static final h f27208n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f27209d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f27210e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f27211f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f27212g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f27213h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f27214i;

    /* renamed from: j  reason: collision with root package name */
    public final m1 f27215j;

    /* renamed from: k  reason: collision with root package name */
    public final List<m1> f27216k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f27217l;

    /* renamed from: m  reason: collision with root package name */
    public final List<DrmInitData> f27218m;

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27219a;

        /* renamed from: b  reason: collision with root package name */
        public final m1 f27220b;

        /* renamed from: c  reason: collision with root package name */
        public final String f27221c;

        /* renamed from: d  reason: collision with root package name */
        public final String f27222d;

        public a(Uri uri, m1 m1Var, String str, String str2) {
            this.f27219a = uri;
            this.f27220b = m1Var;
            this.f27221c = str;
            this.f27222d = str2;
        }
    }

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27223a;

        /* renamed from: b  reason: collision with root package name */
        public final m1 f27224b;

        /* renamed from: c  reason: collision with root package name */
        public final String f27225c;

        /* renamed from: d  reason: collision with root package name */
        public final String f27226d;

        /* renamed from: e  reason: collision with root package name */
        public final String f27227e;

        /* renamed from: f  reason: collision with root package name */
        public final String f27228f;

        public b(Uri uri, m1 m1Var, String str, String str2, String str3, String str4) {
            this.f27223a = uri;
            this.f27224b = m1Var;
            this.f27225c = str;
            this.f27226d = str2;
            this.f27227e = str3;
            this.f27228f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new m1.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public b a(m1 m1Var) {
            return new b(this.f27223a, m1Var, this.f27225c, this.f27226d, this.f27227e, this.f27228f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, m1 m1Var, List<m1> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f27209d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f27210e = Collections.unmodifiableList(list2);
        this.f27211f = Collections.unmodifiableList(list3);
        this.f27212g = Collections.unmodifiableList(list4);
        this.f27213h = Collections.unmodifiableList(list5);
        this.f27214i = Collections.unmodifiableList(list6);
        this.f27215j = m1Var;
        this.f27216k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f27217l = Collections.unmodifiableMap(map);
        this.f27218m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f27219a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = list2.get(i12);
                    if (streamKey.f10651b == i10 && streamKey.f10652c == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f27223a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // d4.a
    /* renamed from: c */
    public h a(List<StreamKey> list) {
        return new h(this.f27229a, this.f27230b, d(this.f27210e, 0, list), Collections.emptyList(), d(this.f27212g, 1, list), d(this.f27213h, 2, list), Collections.emptyList(), this.f27215j, this.f27216k, this.f27231c, this.f27217l, this.f27218m);
    }
}
