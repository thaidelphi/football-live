package com.startapp.sdk.adsbase.commontracking;

import com.startapp.c8;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TrackingParams implements Serializable {
    private static final long serialVersionUID = 8119468204117511007L;
    private String adTag;
    private String clientSessionId;
    private boolean mraid;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public TrackingParams() {
        this(null);
    }

    public final String a() {
        return this.adTag;
    }

    public final int b() {
        return this.offset;
    }

    public String c() {
        if (this.offset > 0) {
            return "&offset=" + this.offset;
        }
        return "";
    }

    public final String d() {
        return this.profileId;
    }

    public String e() {
        String str;
        String str2;
        String str3;
        String encode;
        String encode2;
        String encode3;
        StringBuilder sb = new StringBuilder();
        String str4 = this.adTag;
        String str5 = "";
        if (str4 == null || str4.equals("")) {
            str = "";
        } else {
            int min = Math.min(this.adTag.length(), 200);
            StringBuilder sb2 = new StringBuilder("&adTag=");
            String substring = this.adTag.substring(0, min);
            WeakHashMap weakHashMap = o9.f22359a;
            if (substring != null) {
                try {
                    encode3 = URLEncoder.encode(substring, "UTF-8");
                } catch (UnsupportedEncodingException e8) {
                    throw new RuntimeException(e8);
                }
            } else {
                encode3 = "";
            }
            sb2.append(encode3);
            str = sb2.toString();
        }
        sb.append(str);
        if (this.clientSessionId != null) {
            StringBuilder sb3 = new StringBuilder("&clientSessionId=");
            String str6 = this.clientSessionId;
            WeakHashMap weakHashMap2 = o9.f22359a;
            if (str6 != null) {
                try {
                    encode2 = URLEncoder.encode(str6, "UTF-8");
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                encode2 = "";
            }
            sb3.append(encode2);
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.profileId != null) {
            StringBuilder sb4 = new StringBuilder("&profileId=");
            String str7 = this.profileId;
            WeakHashMap weakHashMap3 = o9.f22359a;
            if (str7 != null) {
                try {
                    encode = URLEncoder.encode(str7, "UTF-8");
                } catch (UnsupportedEncodingException e11) {
                    throw new RuntimeException(e11);
                }
            } else {
                encode = "";
            }
            sb4.append(encode);
            str3 = sb4.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(c());
        sb.append(this.mraid ? "&mraid=true" : "");
        String str8 = this.nonImpressionReason;
        if (str8 != null && !str8.equals("")) {
            StringBuilder sb5 = new StringBuilder("&isShown=false&reason=");
            String str9 = this.nonImpressionReason;
            WeakHashMap weakHashMap4 = o9.f22359a;
            if (str9 != null) {
                try {
                    str5 = URLEncoder.encode(str9, "UTF-8");
                } catch (UnsupportedEncodingException e12) {
                    throw new RuntimeException(e12);
                }
            }
            sb5.append(str5);
            str5 = sb5.toString();
        }
        sb.append(str5);
        return sb.toString();
    }

    public TrackingParams(String str) {
        this.adTag = str;
        this.clientSessionId = c8.f21846d.a();
        this.profileId = MetaData.w().G();
        this.offset = 0;
    }

    public final TrackingParams a(int i10) {
        this.offset = i10;
        return this;
    }

    public final void a(boolean z10) {
        this.mraid = z10;
    }

    public final TrackingParams a(String str) {
        this.nonImpressionReason = str;
        return this;
    }
}
