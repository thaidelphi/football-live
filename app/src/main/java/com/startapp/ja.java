package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ja {

    /* renamed from: a  reason: collision with root package name */
    public final VideoTrackingLink[] f22153a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoTrackingParams f22154b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22155c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22156d;

    /* renamed from: e  reason: collision with root package name */
    public String f22157e = "";

    /* renamed from: f  reason: collision with root package name */
    public VASTErrorCodes f22158f;

    public ja(int i10, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        this.f22153a = videoTrackingLinkArr;
        this.f22154b = videoTrackingParams;
        this.f22155c = str;
        this.f22156d = i10;
    }

    public final ia a() {
        Object obj;
        String format;
        Object obj2 = null;
        if ((this.f22153a == null || this.f22154b == null) ? false : true) {
            ArrayList arrayList = new ArrayList();
            VideoTrackingLink[] videoTrackingLinkArr = this.f22153a;
            int length = videoTrackingLinkArr.length;
            int i10 = 0;
            while (i10 < length) {
                VideoTrackingLink videoTrackingLink = videoTrackingLinkArr[i10];
                if (videoTrackingLink.c() == null || (this.f22154b.b() > 0 && !videoTrackingLink.f())) {
                    obj = obj2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    VideoTrackingLink.TrackingSource b10 = videoTrackingLink.b();
                    if (b10 == null) {
                        if (o9.b(videoTrackingLink.c())) {
                            b10 = VideoTrackingLink.TrackingSource.STARTAPP;
                        } else {
                            b10 = VideoTrackingLink.TrackingSource.EXTERNAL;
                        }
                    }
                    VideoTrackingParams c10 = this.f22154b.b(b10 == VideoTrackingLink.TrackingSource.STARTAPP).c(videoTrackingLink.f()).c(videoTrackingLink.a());
                    String c11 = videoTrackingLink.c();
                    String str = this.f22155c;
                    String replace = c11.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                    int i11 = this.f22156d;
                    long convert = TimeUnit.SECONDS.convert(i11, TimeUnit.MILLISECONDS);
                    long j10 = i11 % 1000;
                    Locale locale = Locale.US;
                    String replace2 = replace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(convert / 3600), Long.valueOf((convert % 3600) / 60), Long.valueOf(convert % 60), Long.valueOf(j10)))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                    int length2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date()).length() - 2;
                    String replace3 = replace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(format.substring(0, length2) + ":" + format.substring(length2)));
                    VASTErrorCodes vASTErrorCodes = this.f22158f;
                    if (vASTErrorCodes != null) {
                        replace3 = replace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                    }
                    sb.append(replace3);
                    sb.append(c10.e());
                    if (c10.g()) {
                        obj = null;
                        sb.append(a.c(com.startapp.sdk.adsbase.a.a(c11, (String) null)));
                    } else {
                        obj = null;
                    }
                    arrayList.add(sb.toString());
                }
                i10++;
                obj2 = obj;
            }
            return new ia(this.f22157e, arrayList);
        }
        return null;
    }
}
