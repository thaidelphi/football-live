package i4;

import a5.p0;
import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: DashManifest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements d4.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final long f26519a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26520b;

    /* renamed from: c  reason: collision with root package name */
    public final long f26521c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26522d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26523e;

    /* renamed from: f  reason: collision with root package name */
    public final long f26524f;

    /* renamed from: g  reason: collision with root package name */
    public final long f26525g;

    /* renamed from: h  reason: collision with root package name */
    public final long f26526h;

    /* renamed from: i  reason: collision with root package name */
    public final o f26527i;

    /* renamed from: j  reason: collision with root package name */
    public final l f26528j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f26529k;

    /* renamed from: l  reason: collision with root package name */
    public final h f26530l;

    /* renamed from: m  reason: collision with root package name */
    private final List<g> f26531m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f26519a = j10;
        this.f26520b = j11;
        this.f26521c = j12;
        this.f26522d = z10;
        this.f26523e = j13;
        this.f26524f = j14;
        this.f26525g = j15;
        this.f26526h = j16;
        this.f26530l = hVar;
        this.f26527i = oVar;
        this.f26529k = uri;
        this.f26528j = lVar;
        this.f26531m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<StreamKey> linkedList) {
        StreamKey poll = linkedList.poll();
        int i10 = poll.f10650a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f10651b;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f26511c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f10652c));
                poll = linkedList.poll();
                if (poll.f10650a != i10) {
                    break;
                }
            } while (poll.f10651b == i11);
            arrayList.add(new a(aVar.f26509a, aVar.f26510b, arrayList2, aVar.f26512d, aVar.f26513e, aVar.f26514f));
        } while (poll.f10650a == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // d4.a
    /* renamed from: b */
    public final c a(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f10650a != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j10 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f26554a, d10.f26555b - j10, c(d10.f26556c, linkedList), d10.f26557d));
            }
            i10++;
        }
        long j11 = this.f26520b;
        return new c(this.f26519a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f26521c, this.f26522d, this.f26523e, this.f26524f, this.f26525g, this.f26526h, this.f26530l, this.f26527i, this.f26528j, this.f26529k, arrayList);
    }

    public final g d(int i10) {
        return this.f26531m.get(i10);
    }

    public final int e() {
        return this.f26531m.size();
    }

    public final long f(int i10) {
        if (i10 == this.f26531m.size() - 1) {
            long j10 = this.f26520b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - this.f26531m.get(i10).f26555b;
        }
        return this.f26531m.get(i10 + 1).f26555b - this.f26531m.get(i10).f26555b;
    }

    public final long g(int i10) {
        return p0.C0(f(i10));
    }
}
