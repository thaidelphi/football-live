package com.appnext.ads.fullscreen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.appnext.R;
import com.appnext.core.Ad;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C0400r;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.h;
import com.appnext.core.p;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.ug;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FullscreenActivity extends AppnextActivity implements h, i, j, h.a {
    private ArrayList<AppnextAd> ads;

    /* renamed from: g  reason: collision with root package name */
    private SettingsManager f10016g;

    /* renamed from: i  reason: collision with root package name */
    private AppnextAd f10018i;

    /* renamed from: j  reason: collision with root package name */
    private AppnextAd f10019j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap<String, Integer> f10020k;

    /* renamed from: l  reason: collision with root package name */
    private Video f10021l;
    private Handler mHandler;
    private int type;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10017h = true;
    private boolean finished = false;

    /* renamed from: m  reason: collision with root package name */
    private int f10022m = 0;

    /* renamed from: n  reason: collision with root package name */
    Runnable f10023n = new Runnable() { // from class: com.appnext.ads.fullscreen.FullscreenActivity.3
        @Override // java.lang.Runnable
        public final void run() {
            if (((AppnextActivity) FullscreenActivity.this).userAction != null) {
                ((AppnextActivity) FullscreenActivity.this).userAction.d(FullscreenActivity.this.f10018i);
            }
            FullscreenActivity.this.report("impression_event", "S2");
        }
    };

    /* renamed from: o  reason: collision with root package name */
    Runnable f10024o = new Runnable() { // from class: com.appnext.ads.fullscreen.FullscreenActivity.4
        @Override // java.lang.Runnable
        public final void run() {
            FullscreenActivity fullscreenActivity = FullscreenActivity.this;
            fullscreenActivity.a(fullscreenActivity.f10018i, (h.a) null);
            FullscreenActivity.this.report("vta_event", "S2");
        }
    };

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.i, com.appnext.ads.fullscreen.j
    public void closeClicked() {
        try {
            if (this.f10022m == 1 && !isRewarded() && Integer.parseInt(getConfig().t("clickType_a")) > new Random(System.nanoTime()).nextInt(100)) {
                installClicked(getSelectedAd());
                return;
            }
            a();
            finish();
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$closeClicked", th);
        }
    }

    @Override // com.appnext.ads.fullscreen.j
    public long closeDelay() {
        try {
            if (b() instanceof FullScreenVideo) {
                return ((FullScreenVideo) b()).getCloseDelay();
            }
            return 0L;
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$closeDelay", th);
            return 0L;
        }
    }

    @Override // com.appnext.core.h.a
    public void error(String str) {
        S();
        report("error_resolve_timeout");
    }

    @Override // com.appnext.ads.fullscreen.j
    public int getCaptionTextTime() {
        try {
            return b().getRollCaptionTime();
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$getCaptionTextTime", th);
            return 0;
        }
    }

    @Override // com.appnext.core.AppnextActivity
    protected final SettingsManager getConfig() {
        if (this.f10016g == null) {
            if (this.type == 1) {
                this.f10016g = c.h();
            } else {
                this.f10016g = f.o();
            }
        }
        return this.f10016g;
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.i, com.appnext.ads.fullscreen.j
    public SettingsManager getConfigManager() {
        return getConfig();
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.j
    public String getCtaText() {
        try {
            String buttonText = new FullscreenAd(this.f10018i).getButtonText();
            String str = "existing";
            if (this.f10018i != null && buttonText.equals("")) {
                if (isInstalled()) {
                    return com.appnext.core.b.a.q(this).a(this.f10021l.getLanguage(), "existing", "Open");
                }
                return com.appnext.core.b.a.q(this).a(this.f10021l.getLanguage(), "new", "Install");
            }
            com.appnext.core.b.a q10 = com.appnext.core.b.a.q(this);
            String language = this.f10021l.getLanguage();
            if (!isInstalled()) {
                str = "new";
            }
            return q10.a(language, str, buttonText);
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$getCtaText", th);
            return "";
        }
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.j
    public String getLanguage() {
        return this.f10021l.getLanguage();
    }

    @Override // com.appnext.ads.fullscreen.j
    public boolean getMute() {
        return b().getMute();
    }

    @Override // com.appnext.ads.fullscreen.h
    public ArrayList<AppnextAd> getPostRollAds() {
        return this.ads;
    }

    @Override // com.appnext.ads.fullscreen.i
    public ArrayList<AppnextAd> getPreRollAds() {
        if (this.ads == null) {
            this.ads = b.f().e(b());
        }
        ArrayList<AppnextAd> arrayList = new ArrayList<>();
        AppnextAd a10 = a(this.ads, this.placementID, "");
        arrayList.add(a10);
        AppnextAd a11 = a(this.ads, this.placementID, a10.getBannerID());
        if (a11 != null && !a11.getBannerID().equals(arrayList.get(0).getBannerID())) {
            arrayList.add(a11);
        }
        return arrayList;
    }

    @Override // com.appnext.ads.fullscreen.j
    public AppnextAd getSelectedAd() {
        return this.f10018i;
    }

    @Override // com.appnext.ads.fullscreen.j
    public Uri getSelectedVideoUri() {
        String str;
        String videoUrl = b.getVideoUrl(this.f10018i, b().getVideoLength());
        String b10 = b.b(videoUrl);
        if (Video.getCacheVideo()) {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
        } else {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/tmp/vid" + b().rnd + "/";
        }
        File file = new File(str + b10);
        if (file.exists()) {
            Uri parse = Uri.parse(str + b10);
            parse.getPath();
            return parse;
        }
        Uri parse2 = Uri.parse(videoUrl);
        file.getAbsolutePath();
        return parse2;
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.i, com.appnext.ads.fullscreen.j
    public int getTemplate(String str) {
        if (this.f10020k == null) {
            this.f10020k = new HashMap<>();
        }
        if (!this.f10020k.containsKey(str)) {
            String a10 = com.appnext.ads.a.a(getConfig().t(str));
            Resources resources = getResources();
            int identifier = resources.getIdentifier("apnxt_" + a10, "layout", getPackageName());
            if (identifier == 0) {
                Resources resources2 = getResources();
                identifier = resources2.getIdentifier("apnxt_" + str.toLowerCase() + "t1", "layout", getPackageName());
            }
            this.f10020k.put(str, Integer.valueOf(identifier));
        }
        return this.f10020k.get(str).intValue();
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.j
    public void installClicked(AppnextAd appnextAd) {
        if (this.f10022m == 1 && !isRewarded()) {
            a(this.cx, getResources().getDrawable(R.drawable.apnxt_loader));
        }
        b(appnextAd, this);
    }

    @Override // com.appnext.ads.fullscreen.j
    public boolean isInstalled() {
        try {
            return com.appnext.core.i.b(this, this.f10018i.getAdPackage());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.appnext.ads.fullscreen.h
    public boolean isRewarded() {
        return b() instanceof RewardedVideo;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (b().isBackButtonCanClose()) {
            a();
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment gVar;
        if (bundle != null) {
            try {
                this.f10020k = (HashMap) bundle.getSerializable("templates");
                this.f10022m = bundle.getInt("state");
            } catch (Throwable th) {
                com.appnext.base.a.a("FullscreenActivity$onCreate", th);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = getResources().getConfiguration();
            configuration.setLayoutDirection(new Locale("en"));
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
        super.onCreate(bundle);
        Video video = Video.currentAd;
        if (video == null) {
            onError(AppnextError.NO_ADS);
            finish();
            return;
        }
        if (video instanceof RewardedVideo) {
            this.f10021l = new RewardedVideo(this, (RewardedVideo) Video.currentAd);
        } else {
            this.f10021l = new FullScreenVideo(this, (FullScreenVideo) Video.currentAd);
        }
        String orientation = b().getOrientation();
        char c10 = 65535;
        switch (orientation.hashCode()) {
            case 729267099:
                if (orientation.equals("portrait")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1430647483:
                if (orientation.equals("landscape")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1673671211:
                if (orientation.equals(Ad.ORIENTATION_AUTO)) {
                    c10 = 1;
                    break;
                }
                break;
            case 2129065206:
                if (orientation.equals(Ad.ORIENTATION_DEFAULT)) {
                    c10 = 0;
                    break;
                }
                break;
        }
        if (c10 == 0 || c10 == 1) {
            if (getResources().getConfiguration().orientation == 2) {
                setRequestedOrientation(6);
            } else {
                setRequestedOrientation(7);
            }
        } else if (c10 == 2) {
            setRequestedOrientation(6);
        } else if (c10 == 3) {
            setRequestedOrientation(7);
        }
        this.mHandler = new Handler();
        this.placementID = getIntent().getExtras().getString(ug.f21009x);
        int i10 = getIntent().getExtras().getInt("type");
        this.type = i10;
        if (i10 == 1) {
            this.f10016g = c.h();
        } else {
            this.f10016g = f.o();
        }
        this.f10017h = Boolean.parseBoolean(this.f10016g.t("can_close"));
        if (b() instanceof FullScreenVideo) {
            this.f10017h = ((FullScreenVideo) b()).isBackButtonCanClose();
        }
        if (bundle == null) {
            ArrayList<AppnextAd> e8 = b.f().e(b());
            this.ads = e8;
            if (e8 == null) {
                onError(AppnextError.NO_ADS);
                finish();
                return;
            }
            this.f10018i = a(e8, this.placementID, "");
        } else {
            this.ads = (ArrayList) bundle.getSerializable("ads");
            this.f10018i = (AppnextAd) bundle.getSerializable("currentAd");
        }
        if (this.f10018i == null) {
            onError(AppnextError.NO_ADS);
            finish();
            return;
        }
        setContentView(R.layout.apnxt_video_activity);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            String mode = b() instanceof RewardedVideo ? ((RewardedVideo) b()).getMode() : "";
            if (mode.equals(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                mode = getConfig().t("default_mode");
            }
            if (this.type == 2 && mode.equals(RewardedVideo.VIDEO_MODE_MULTI)) {
                gVar = new e();
                bundle2.putInt("time", ((RewardedVideo) b()).getMultiTimerLength());
                report(RewardedVideo.VIDEO_MODE_MULTI);
            } else {
                if (this.type == 2) {
                    report(RewardedVideo.VIDEO_MODE_NORMAL);
                }
                gVar = new g();
                bundle2.putBoolean("showCta", b().isShowCta());
                this.f10022m = 1;
            }
            gVar.setArguments(bundle2);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.add(R.id.ll, gVar, "fragment");
            try {
                beginTransaction.commit();
            } catch (Exception unused) {
                finish();
                return;
            }
        } else {
            this.finished = bundle.getBoolean("finished", true);
        }
        this.cx = (RelativeLayout) findViewById(R.id.ll);
        this.userAction = new C0400r(this, new C0400r.a() { // from class: com.appnext.ads.fullscreen.FullscreenActivity.1
            @Override // com.appnext.core.C0400r.a
            public final Ad c() {
                return Video.currentAd;
            }

            @Override // com.appnext.core.C0400r.a
            public final AppnextAd d() {
                return FullscreenActivity.this.f10019j;
            }

            @Override // com.appnext.core.C0400r.a
            public final SettingsManager e() {
                return FullscreenActivity.this.getConfig();
            }

            @Override // com.appnext.core.C0400r.a
            public final void report(String str) {
                try {
                    FullscreenActivity.this.report(str);
                } catch (Throwable unused2) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            com.appnext.core.i.a(new File(getFilesDir().getAbsolutePath() + "/data/appnext/videos/tmp/vid" + b().rnd + "/"));
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$onDestroy", th);
        }
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.mHandler = null;
            this.f10019j = null;
            this.f10018i = null;
        } catch (Throwable th2) {
            com.appnext.base.a.a("FullscreenActivity$onDestroy", th2);
        }
    }

    @Override // com.appnext.core.AppnextActivity
    protected final void onError(String str) {
        OnAdError onAdErrorCallback;
        try {
            if (b() == null || (onAdErrorCallback = b().getOnAdErrorCallback()) == null) {
                return;
            }
            onAdErrorCallback.adError(str);
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$onError", th);
        }
    }

    @Override // com.appnext.core.h.a
    public void onMarket(String str) {
        S();
        this.finished = true;
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f10018i);
        this.ads.add(0, this.f10018i);
        d dVar = new d();
        this.f10022m = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.ll, dVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$onMarket", th);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mHandler.removeCallbacks(this.f10023n);
        this.mHandler.removeCallbacks(this.f10024o);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.finished = bundle.getBoolean("finished", true);
        this.type = bundle.getInt("type");
        this.f10020k = (HashMap) bundle.getSerializable("templates");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 2;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                systemUiVisibility |= 4;
            }
            if (i10 >= 18) {
                systemUiVisibility |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("finished", this.finished);
        bundle.putInt("type", this.type);
        bundle.putSerializable("templates", this.f10020k);
        bundle.putSerializable("ads", this.ads);
        bundle.putInt("state", this.f10022m);
        bundle.putSerializable("currentAd", this.f10018i);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.i, com.appnext.ads.fullscreen.j
    public void privacyClicked() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(com.appnext.core.i.f(this.f10018i)));
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$privacyClicked", th);
        }
    }

    @Override // com.appnext.ads.fullscreen.h, com.appnext.ads.fullscreen.i, com.appnext.ads.fullscreen.j
    public void report(String str, String str2) {
        a(str, getResources().getResourceEntryName(getTemplate(str2)));
    }

    @Override // com.appnext.ads.fullscreen.j
    public boolean showClose() {
        return (b() instanceof FullScreenVideo) && ((FullScreenVideo) b()).isShowClose();
    }

    @Override // com.appnext.ads.fullscreen.j
    public void videoEnded() {
        this.f10022m = 2;
        this.finished = true;
        if (b() != null && b().getOnVideoEndedCallback() != null) {
            b().getOnVideoEndedCallback().videoEnded();
        }
        p.ac().a(new Runnable() { // from class: com.appnext.ads.fullscreen.FullscreenActivity.6
            @Override // java.lang.Runnable
            public final void run() {
                RewardedServerSidePostback rewardedServerSidePostback;
                if (!(FullscreenActivity.this.b() instanceof RewardedVideo) || (rewardedServerSidePostback = ((RewardedVideo) FullscreenActivity.this.b()).getRewardedServerSidePostback()) == null) {
                    return;
                }
                HashMap<String, String> n10 = rewardedServerSidePostback.n();
                n10.put("placementId", ((AppnextActivity) FullscreenActivity.this).placementID);
                try {
                    com.appnext.core.i.a(FullscreenActivity.this, "https://admin.appnext.com/adminService.asmx/SetRewards", n10);
                } catch (IOException unused) {
                }
            }
        });
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f10018i);
        this.ads.add(0, this.f10018i);
        d dVar = new d();
        this.f10022m = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.ll, dVar, "fragment");
        try {
            beginTransaction.commit();
            AppnextAd appnextAd = this.f10019j;
            if (appnextAd != null) {
                super.b(appnextAd, this);
                report("roll_store_opened");
                return;
            }
            report("roll_click_cta_none");
            if (Integer.parseInt(getConfig().t("clickType_b")) > new Random(System.nanoTime()).nextInt(100)) {
                installClicked(getSelectedAd());
            }
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // com.appnext.ads.fullscreen.i
    public void videoSelected(AppnextAd appnextAd) {
        this.f10018i = appnextAd;
        g gVar = new g();
        FragmentManager fragmentManager = getFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showCta", b().isShowCta());
        gVar.setArguments(bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(R.id.ll, gVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$videoSelected", th);
            finish();
        }
    }

    @Override // com.appnext.ads.fullscreen.j
    public void videoStarted() {
        OnAdOpened onAdOpenedCallback;
        p.ac().a(new Runnable() { // from class: com.appnext.ads.fullscreen.FullscreenActivity.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (FullscreenActivity.this.f10018i == null || FullscreenActivity.this.f10021l == null) {
                        return;
                    }
                    com.appnext.core.adswatched.a.m(FullscreenActivity.this).j(FullscreenActivity.this.f10018i.getBannerID(), FullscreenActivity.this.f10021l.getAUID());
                } catch (Throwable unused) {
                }
            }
        });
        this.mHandler.postDelayed(this.f10023n, Long.parseLong(this.f10016g.t("postpone_impression_sec")) * 1000);
        if (Boolean.parseBoolean(this.f10016g.t("pview"))) {
            this.mHandler.postDelayed(this.f10024o, Long.parseLong(this.f10016g.t("postpone_vta_sec")) * 1000);
        }
        if (b() == null || (onAdOpenedCallback = b().getOnAdOpenedCallback()) == null) {
            return;
        }
        onAdOpenedCallback.adOpened();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(String str) {
        try {
            Resources resources = getResources();
            a(str, resources.getResourceEntryName(getTemplate("S" + (this.f10022m + 1))));
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$report", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity
    public final void a(AppnextAd appnextAd, h.a aVar) {
        super.a(appnextAd, new h.a() { // from class: com.appnext.ads.fullscreen.FullscreenActivity.2
            @Override // com.appnext.core.h.a
            public final void error(String str) {
            }

            @Override // com.appnext.core.h.a
            public final void onMarket(String str) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity
    public final void b(AppnextAd appnextAd, h.a aVar) {
        OnAdClicked onAdClickedCallback;
        if (appnextAd == null) {
            return;
        }
        this.f10019j = appnextAd;
        Video b10 = b();
        if (b10 != null && (onAdClickedCallback = b10.getOnAdClickedCallback()) != null) {
            onAdClickedCallback.adClicked();
        }
        if (this.finished || !(b() instanceof RewardedVideo)) {
            super.b(appnextAd, aVar);
        }
    }

    private synchronized void a() {
        OnAdClosed onAdClosedCallback;
        try {
            b.f().a(this, this.f10018i.getBannerID(), b());
            if (b() != null && (onAdClosedCallback = b().getOnAdClosedCallback()) != null) {
                onAdClosedCallback.onAdClosed();
            }
            Video.currentAd = null;
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$onClose", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Video b() {
        Video video = Video.currentAd;
        return video != null ? video : this.f10021l;
    }

    protected final AppnextAd a(ArrayList<AppnextAd> arrayList, String str, String str2) {
        try {
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                AppnextAd next = it.next();
                if (a(next)) {
                    next.getBannerID();
                    if (!next.getBannerID().equals(str2)) {
                        return next;
                    }
                }
            }
            Iterator<AppnextAd> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AppnextAd next2 = it2.next();
                if (a(next2)) {
                    next2.getBannerID();
                    return next2;
                }
            }
            return null;
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$getFirst", th);
            return null;
        }
    }

    private static boolean a(AppnextAd appnextAd) {
        try {
            if (appnextAd.getVideoUrlHigh().equals("")) {
                return !appnextAd.getVideoUrlHigh30Sec().equals("");
            }
            return true;
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$hasHiResVideo", th);
            return false;
        }
    }

    private void a(String str, String str2) {
        try {
            String tid = b().getTID();
            String vid = b().getVID();
            String auid = b().getAUID();
            String str3 = this.placementID;
            String sessionId = b().getSessionId();
            AppnextAd appnextAd = this.f10018i;
            String bannerID = appnextAd != null ? appnextAd.getBannerID() : "";
            AppnextAd appnextAd2 = this.f10018i;
            com.appnext.core.i.a(this, tid, vid, auid, str3, sessionId, str, str2, bannerID, appnextAd2 != null ? appnextAd2.getCampaignID() : "");
        } catch (Throwable th) {
            com.appnext.base.a.a("FullscreenActivity$sendReport", th);
        }
    }
}
