package com.startapp.sdk.ads.video;

import com.startapp.common.parser.TypeInfo;
import com.startapp.q9;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.w9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;
    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @TypeInfo(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    private Long unskipLess;
    @TypeInfo(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    public final void a(String str) {
        this.localVideoPath = str;
    }

    public final String b() {
        return this.clickUrl;
    }

    public final String c() {
        return this.localVideoPath;
    }

    public final String d() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    public final String e() {
        return this.postRollHtml;
    }

    public final PostRollType f() {
        return this.postRoll;
    }

    public final long g() {
        return this.skippableAfter;
    }

    public final Long h() {
        return this.unskipLess;
    }

    public final VideoTrackingDetails i() {
        return this.videoTrackingDetails;
    }

    public final String j() {
        return this.videoUrl;
    }

    public final boolean k() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    public final boolean l() {
        return this.clickable;
    }

    public final boolean m() {
        return this.closeable;
    }

    public final boolean n() {
        return this.skippable;
    }

    public final boolean o() {
        return this.isVideoMuted;
    }

    public final void p() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    public final String toString() {
        return super.toString();
    }

    public VideoAdDetails(q9 q9Var, VideoConfig videoConfig, w9 w9Var) {
        long n10;
        this.videoTrackingDetails = new VideoTrackingDetails(q9Var);
        this.videoUrl = q9Var.k();
        if (w9Var != null) {
            Long a10 = w9Var.a();
            Integer o10 = q9Var.o();
            if (a10 != null) {
                n10 = a10.longValue();
            } else if (o10 != null) {
                n10 = o10.intValue();
            } else {
                n10 = videoConfig.n();
            }
            this.skippableAfter = n10;
            this.skippable = true;
            this.unskipLess = w9Var.b();
        } else {
            this.skippable = false;
        }
        String c10 = q9Var.c();
        this.clickUrl = c10;
        this.clickable = c10 != null;
        this.postRoll = PostRollType.NONE;
        com.startapp.sdk.ads.video.vast.a f10 = q9Var.f();
        if (f10 != null) {
            this.postRollHtml = f10.c().a();
            this.postRollClickThroughUrl = f10.a();
        }
        a(Collections.unmodifiableList(q9Var.b()));
    }

    public final void a(boolean z10) {
        this.isVideoMuted = z10;
    }

    public final List<VerificationDetails> a() {
        return this.adVerifications;
    }

    public final void a(List<VerificationDetails> list) {
        this.adVerifications = list;
    }
}
