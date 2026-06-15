package i4;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
/* compiled from: EventStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final EventMessage[] f26549a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f26550b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26551c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26552d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26553e;

    public f(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        this.f26551c = str;
        this.f26552d = str2;
        this.f26553e = j10;
        this.f26550b = jArr;
        this.f26549a = eventMessageArr;
    }

    public String a() {
        return this.f26551c + "/" + this.f26552d;
    }
}
