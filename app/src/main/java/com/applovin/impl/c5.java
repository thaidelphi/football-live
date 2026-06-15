package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.a0;
import com.applovin.impl.b0;
import com.applovin.impl.n3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c5 extends z4 implements n3.a {

    /* renamed from: g  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f6740g;

    /* renamed from: h  reason: collision with root package name */
    private AppLovinAdLoadListener f6741h;

    /* renamed from: i  reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6742i;

    /* renamed from: j  reason: collision with root package name */
    private final Collection f6743j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6744k;

    /* renamed from: l  reason: collision with root package name */
    protected ExecutorService f6745l;

    /* renamed from: m  reason: collision with root package name */
    protected ExecutorService f6746m;

    /* renamed from: n  reason: collision with root package name */
    protected List f6747n;

    /* renamed from: o  reason: collision with root package name */
    protected String f6748o;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b0.a {
        a() {
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            c5.this.f6740g.b(uri);
            com.applovin.impl.sdk.n nVar = c5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                c5 c5Var = c5.this;
                com.applovin.impl.sdk.n nVar2 = c5Var.f9829c;
                String str = c5Var.f9828b;
                nVar2.a(str, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements b0.a {
        b() {
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            c5.this.f6740g.c(uri);
            com.applovin.impl.sdk.n nVar = c5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                c5 c5Var = c5.this;
                com.applovin.impl.sdk.n nVar2 = c5Var.f9829c;
                String str = c5Var.f9828b;
                nVar2.a(str, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0.a f6751a;

        c(b0.a aVar) {
            this.f6751a = aVar;
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.n nVar = c5.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    c5 c5Var = c5.this;
                    com.applovin.impl.sdk.n nVar2 = c5Var.f9829c;
                    String str = c5Var.f9828b;
                    nVar2.a(str, "Finish caching video for ad #" + c5.this.f6740g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f6751a.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar3 = c5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                c5 c5Var2 = c5.this;
                c5Var2.f9829c.b(c5Var2.f9828b, "Failed to cache video");
            }
            c5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            Bundle bundle = new Bundle();
            bundle.putLong("ad_id", c5.this.f6740g.getAdIdNumber());
            c5.this.f9827a.q().a(bundle, "video_caching_failed");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements a0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f6753a;

        d(e eVar) {
            this.f6753a = eVar;
        }

        @Override // com.applovin.impl.a0.c
        public void a(String str, boolean z10) {
            if (z10) {
                c5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f6753a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, jVar);
        if (bVar != null) {
            this.f6740g = bVar;
            this.f6741h = appLovinAdLoadListener;
            this.f6742i = jVar.A();
            this.f6743j = h();
            if (((Boolean) jVar.a(o4.K0)).booleanValue()) {
                this.f6748o = StringUtils.isValidString(bVar.I()) ? bVar.I() : UUID.randomUUID().toString();
                u5 i02 = jVar.i0();
                this.f6745l = i02.a("com.applovin.sdk.caching." + this.f6748o, ((Integer) jVar.a(o4.L0)).intValue());
                u5 i03 = jVar.i0();
                this.f6746m = i03.a("com.applovin.sdk.caching.html." + this.f6748o, ((Integer) jVar.a(o4.M0)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f9827a.a(o4.F0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6741h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f6740g);
            this.f6741h = null;
        }
    }

    @Override // com.applovin.impl.n3.a
    public void a(u2 u2Var) {
        if (u2Var.S().equalsIgnoreCase(this.f6740g.I())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.b(this.f9828b, "Updating flag for timeout...");
            }
            g();
        }
        this.f9827a.R().b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b0 b(String str, b0.a aVar) {
        return a(str, this.f6740g.Y(), true, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri c(String str) {
        return b(str, this.f6740g.Y(), true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List e() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f6740g.M() != null) {
            arrayList.add(a(this.f6740g.M().toString(), new a()));
        }
        if (this.f6740g.d0() != null) {
            arrayList.add(a(this.f6740g.d0().toString(), new b()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Rendered new ad:" + this.f6740g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t9
            @Override // java.lang.Runnable
            public final void run() {
                c5.this.i();
            }
        });
    }

    protected void g() {
        this.f6744k = true;
        List list = this.f6747n;
        if (list != null && !list.isEmpty()) {
            for (z zVar : this.f6747n) {
                zVar.a(true);
            }
        }
        ExecutorService executorService = this.f6745l;
        if (executorService != null) {
            executorService.shutdown();
            this.f6745l = null;
        }
        ExecutorService executorService2 = this.f6746m;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6746m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        if (l0.f()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Caching mute images...");
        }
        Uri a10 = a(this.f6740g.M(), "mute");
        if (a10 != null) {
            this.f6740g.b(a10);
        }
        Uri a11 = a(this.f6740g.d0(), "unmute");
        if (a11 != null) {
            this.f6740g.c(a11);
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Ad updated with muteImageFilename = " + this.f6740g.M() + ", unmuteImageFilename = " + this.f6740g.d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        this.f9827a.R().b(this);
        ExecutorService executorService = this.f6745l;
        if (executorService != null) {
            executorService.shutdown();
            this.f6745l = null;
        }
        ExecutorService executorService2 = this.f6746m;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6746m = null;
        }
        MaxAdFormat d10 = this.f6740g.getAdZone().d();
        if (((Boolean) this.f9827a.a(o4.X0)).booleanValue() && d10 != null && d10.isFullscreenAd()) {
            this.f9827a.g().b(this.f6740g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l() {
        return this.f6744k;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6740g.a1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Subscribing to timeout events...");
            }
            this.f9827a.R().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri b(String str, List list, boolean z10) {
        if (StringUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str2 = this.f9828b;
                nVar.a(str2, "Caching video " + str + "...");
            }
            String a10 = this.f6742i.a(a(), str, this.f6740g.getCachePrefix(), list, z10, this.f9827a.A().a(str, this.f6740g));
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f6742i.a(a10, a());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n nVar2 = this.f9829c;
                            String str3 = this.f9828b;
                            nVar2.a(str3, "Finish caching video for ad #" + this.f6740g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a10);
                        }
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar3 = this.f9829c;
                        String str4 = this.f9828b;
                        nVar3.b(str4, "Unable to create URI from cached video file = " + a11);
                    }
                    this.f9827a.D().a(y1.f9667g0, "extractUriFromVideoFile", CollectionUtils.hashMap("url", a10));
                    return null;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar4 = this.f9829c;
                    String str5 = this.f9828b;
                    nVar4.b(str5, "Unable to retrieve File from cached video filename = " + a10);
                }
                this.f9827a.D().a(y1.f9667g0, "retrieveVideoFile", CollectionUtils.hashMap("url", a10));
                return null;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar5 = this.f9829c;
                String str6 = this.f9828b;
                nVar5.b(str6, "Failed to cache video: " + str);
            }
            this.f9827a.D().a(y1.f9667g0, "cacheVideo", CollectionUtils.hashMap("url", str));
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c(String str, List list, boolean z10) {
        if (((Boolean) this.f9827a.a(o4.f8258y)).booleanValue()) {
            try {
                InputStream a10 = this.f6742i.a(str, list, z10);
                if (a10 == null) {
                    if (a10 != null) {
                        a10.close();
                    }
                    return null;
                }
                String a11 = this.f6742i.a(a10);
                a10.close();
                return a11;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.a(this.f9828b, "Unknown failure to read input stream.", th);
                }
                this.f9829c.a(this.f9828b, th);
                this.f9827a.D().a(this.f9828b, "readInputStreamAsString", th);
                return null;
            }
        }
        InputStream a12 = this.f6742i.a(str, list, z10);
        if (a12 == null) {
            return null;
        }
        try {
            return this.f6742i.a(a12);
        } catch (Throwable th2) {
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.a(this.f9828b, "Unknown failure to read input stream.", th2);
                }
                this.f9827a.D().a(this.f9828b, "readInputStreamAsString", th2);
                return null;
            } finally {
                d7.a(a12, this.f9827a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List a(List list) {
        this.f6747n = list;
        return this.f9827a.i0().a(list, this.f6745l);
    }

    protected b0 a(String str, b0.a aVar) {
        return new b0(str, this.f6740g, this.f9827a, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b0 a(String str, List list, boolean z10, b0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "No video to cache, skipping...");
                return null;
            }
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str2 = this.f9828b;
            nVar.a(str2, "Caching video " + str + "...");
        }
        return new b0(str, this.f6740g, list, z10, this.f9827a, new c(aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a0 a(String str, List list, e eVar) {
        return new a0(str, this.f6740g, list, this.f6746m, this.f9827a, new d(eVar));
    }

    protected Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str2 = this.f9828b;
                nVar.a(str2, "No " + str + " image to cache");
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str3 = this.f9828b;
                nVar2.a(str3, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar3 = this.f9829c;
            String str4 = this.f9828b;
            nVar3.a(str4, "Caching " + str + " image...");
        }
        return b(uri2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri a(String str, List list, boolean z10) {
        try {
            String a10 = this.f6742i.a(a(), str, this.f6740g.getCachePrefix(), list, z10, this.f9827a.A().a(str, this.f6740g));
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f6742i.a(a10, a());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f9829c.b(this.f9828b, "Unable to extract Uri from image file");
                    }
                    this.f9827a.D().a(y1.f9667g0, "extractUriFromImageFile", CollectionUtils.hashMap("url", a10));
                    return null;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9829c;
                    String str2 = this.f9828b;
                    nVar.b(str2, "Unable to retrieve File from cached image filename = " + a10);
                }
                this.f9827a.D().a(y1.f9667g0, "retrieveImageFile", CollectionUtils.hashMap("url", a10));
                return null;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str3 = this.f9828b;
                nVar2.b(str3, "Failed to cache image: " + str);
            }
            this.f9827a.D().a(y1.f9667g0, "cacheImageResource", CollectionUtils.hashMap("url", str));
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar3 = this.f9829c;
                String str4 = this.f9828b;
                nVar3.a(str4, "Failed to cache image at url = " + str, th);
            }
            this.f9827a.D().a(this.f9828b, "cacheImageResource", th, CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    protected Uri b(String str) {
        return a(str, this.f6740g.Y(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String f02 = bVar.f0();
        if (bVar.M0() && StringUtils.isValidString(f02)) {
            String a10 = a(f02, bVar.Y(), bVar);
            bVar.a(a10);
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.f(str, "Ad updated with video button HTML assets cached = " + a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r11, java.util.List r12, com.applovin.impl.sdk.ad.b r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File a10 = this.f6742i.a(d7.a(Uri.parse(str2), this.f6740g.getCachePrefix(), this.f9827a), com.applovin.impl.sdk.j.m());
        if (a10 == null) {
            return null;
        }
        if (this.f6742i.a(a10)) {
            return Uri.parse("file://" + a10.getAbsolutePath());
        }
        String str3 = str + str2;
        if (this.f6742i.a(a10, str3, Arrays.asList(str), this.f9827a.A().a(str3, this.f6740g))) {
            return Uri.parse("file://" + a10.getAbsolutePath());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        if (this.f6741h != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Calling back ad load failed with error code: " + i10);
            }
            this.f6741h.failedToReceiveAd(i10);
            this.f6741h = null;
        }
        g();
    }
}
