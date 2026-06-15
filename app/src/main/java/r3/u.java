package r3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: MediaDrmCallbackException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final z4.p f30376a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f30377b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<String>> f30378c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30379d;

    public u(z4.p pVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f30376a = pVar;
        this.f30377b = uri;
        this.f30378c = map;
        this.f30379d = j10;
    }
}
