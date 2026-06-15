package com.startapp.sdk.adsbase.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.common.parser.TypeInfo;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdDetails implements Serializable, Parcelable {
    public static final Parcelable.Creator<AdDetails> CREATOR = new a();
    private static final long serialVersionUID = 3187184359567678542L;
    private String adId;
    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private boolean app;
    private String appPresencePackage;
    private boolean belowMinCPM;
    private String bidToken;
    private String callToAction;
    private String category;
    private String clickUrl;
    private String closeUrl;
    private Long delayImpressionInSeconds;
    private String description;
    @TypeInfo(type = ArrayList.class)
    private List<String> externalClickUrls;
    @TypeInfo(type = ArrayList.class)
    private List<String> externalImpressionUrls;
    private String imageUrl;
    private String installs;
    private String intentDetails;
    private String intentPackageName;
    private int minAppVersion;
    private String packageName;
    private float rating;
    private String secondaryImageUrl;
    private Boolean sendRedirectHops;
    private boolean smartRedirect;
    private boolean startappBrowserEnabled;
    private String template;
    private String title;
    private String trackingClickUrl;
    private String trackingUrl;
    private Long ttl;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Parcelable.Creator<AdDetails> {
        @Override // android.os.Parcelable.Creator
        public final AdDetails createFromParcel(Parcel parcel) {
            return new AdDetails(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdDetails[] newArray(int i10) {
            return new AdDetails[i10];
        }
    }

    public AdDetails() {
        this.rating = 5.0f;
        this.belowMinCPM = false;
    }

    public final boolean A() {
        return this.intentPackageName != null;
    }

    public final boolean B() {
        return this.smartRedirect;
    }

    public final boolean C() {
        return this.startappBrowserEnabled;
    }

    public final Boolean D() {
        return this.sendRedirectHops;
    }

    public final String a() {
        return this.adId;
    }

    public final List<VerificationDetails> b() {
        return this.adVerifications;
    }

    public final String[] c() {
        List<String> list = this.externalImpressionUrls;
        return list == null ? new String[0] : (String[]) list.toArray(new String[0]);
    }

    public final String d() {
        return this.appPresencePackage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.bidToken;
    }

    public final String f() {
        return this.callToAction;
    }

    public final String g() {
        return this.category;
    }

    public final String h() {
        return this.clickUrl;
    }

    public final Long i() {
        return this.delayImpressionInSeconds;
    }

    public final String j() {
        return this.description;
    }

    public final String k() {
        return this.imageUrl;
    }

    public final String l() {
        return this.installs;
    }

    public final String m() {
        return this.intentDetails;
    }

    public final String n() {
        return this.intentPackageName;
    }

    public final boolean o() {
        return this.belowMinCPM;
    }

    public final int p() {
        return this.minAppVersion;
    }

    public final String q() {
        return this.packageName;
    }

    public final String[] r() {
        String str = this.trackingUrl;
        return str == null ? new String[0] : new String[]{str};
    }

    public final float s() {
        return this.rating;
    }

    public final String t() {
        return this.secondaryImageUrl;
    }

    public final String toString() {
        return super.toString();
    }

    public final String u() {
        return this.template;
    }

    public final String v() {
        return this.title;
    }

    public final String[] w() {
        if (this.externalClickUrls != null) {
            ArrayList arrayList = new ArrayList(this.externalClickUrls);
            arrayList.add(this.trackingClickUrl);
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{this.trackingClickUrl};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.bidToken);
        parcel.writeString(this.adId);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.trackingClickUrl);
        parcel.writeString(this.closeUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.secondaryImageUrl);
        parcel.writeFloat(this.rating);
        boolean z10 = this.smartRedirect;
        boolean z11 = this.startappBrowserEnabled;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(z11 ? 1 : 0);
        parcel.writeString(this.template);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appPresencePackage);
        parcel.writeString(this.intentPackageName);
        parcel.writeString(this.intentDetails);
        parcel.writeInt(this.minAppVersion);
        parcel.writeString(this.installs);
        parcel.writeString(this.category);
        parcel.writeInt(this.app ? 1 : 0);
        parcel.writeInt(this.belowMinCPM ? 1 : 0);
        Long l10 = this.ttl;
        if (l10 != null) {
            parcel.writeLong(l10.longValue());
        } else {
            parcel.writeLong(-1L);
        }
        Long l11 = this.delayImpressionInSeconds;
        if (l11 != null) {
            parcel.writeLong(l11.longValue());
        } else {
            parcel.writeLong(-1L);
        }
        Boolean bool = this.sendRedirectHops;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bool.booleanValue() ? 1 : -1);
        }
        parcel.writeList(this.externalImpressionUrls);
        parcel.writeList(this.externalClickUrls);
        parcel.writeString(this.callToAction);
    }

    public final String x() {
        return this.closeUrl;
    }

    public final Long y() {
        return this.ttl;
    }

    public final boolean z() {
        return this.app;
    }

    public AdDetails(Parcel parcel) {
        this.rating = 5.0f;
        this.belowMinCPM = false;
        this.bidToken = parcel.readString();
        this.adId = parcel.readString();
        this.clickUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.trackingClickUrl = parcel.readString();
        this.closeUrl = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.imageUrl = parcel.readString();
        this.secondaryImageUrl = parcel.readString();
        this.rating = parcel.readFloat();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.smartRedirect = readInt == 1;
        this.startappBrowserEnabled = readInt2 != 0;
        this.template = parcel.readString();
        this.packageName = parcel.readString();
        this.appPresencePackage = parcel.readString();
        this.intentPackageName = parcel.readString();
        this.intentDetails = parcel.readString();
        this.minAppVersion = parcel.readInt();
        this.installs = parcel.readString();
        this.category = parcel.readString();
        this.app = parcel.readInt() == 1;
        this.belowMinCPM = parcel.readInt() == 1;
        Long valueOf = Long.valueOf(parcel.readLong());
        this.ttl = valueOf;
        if (valueOf.longValue() == -1) {
            this.ttl = null;
        }
        Long valueOf2 = Long.valueOf(parcel.readLong());
        this.delayImpressionInSeconds = valueOf2;
        if (valueOf2.longValue() == -1) {
            this.delayImpressionInSeconds = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 == 0) {
            this.sendRedirectHops = null;
        } else {
            this.sendRedirectHops = Boolean.valueOf(readInt3 == 1);
        }
        this.externalImpressionUrls = parcel.readArrayList(String.class.getClassLoader());
        this.externalClickUrls = parcel.readArrayList(String.class.getClassLoader());
        this.callToAction = parcel.readString();
    }
}
