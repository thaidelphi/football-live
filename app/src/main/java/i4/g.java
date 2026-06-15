package i4;

import java.util.Collections;
import java.util.List;
/* compiled from: Period.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f26554a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26555b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f26556c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f26557d;

    /* renamed from: e  reason: collision with root package name */
    public final e f26558e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f26556c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f26556c.get(i11).f26510b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f26554a = str;
        this.f26555b = j10;
        this.f26556c = Collections.unmodifiableList(list);
        this.f26557d = Collections.unmodifiableList(list2);
        this.f26558e = eVar;
    }
}
