package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.o9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: m  reason: collision with root package name */
    private static final String f18492m = "segName";

    /* renamed from: a  reason: collision with root package name */
    private String f18493a;

    /* renamed from: g  reason: collision with root package name */
    private String f18499g;

    /* renamed from: b  reason: collision with root package name */
    private int f18494b = 999999;

    /* renamed from: c  reason: collision with root package name */
    private double f18495c = 999999.99d;

    /* renamed from: d  reason: collision with root package name */
    private final String f18496d = "custom";

    /* renamed from: e  reason: collision with root package name */
    private final int f18497e = 5;

    /* renamed from: f  reason: collision with root package name */
    private int f18498f = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f18500h = -1;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f18501i = null;

    /* renamed from: j  reason: collision with root package name */
    private double f18502j = -1.0d;

    /* renamed from: k  reason: collision with root package name */
    private long f18503k = 0;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<Pair<String, String>> f18504l = new ArrayList<>();

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    @Deprecated
    public int getAge() {
        return this.f18498f;
    }

    @Deprecated
    public String getGender() {
        return this.f18499g;
    }

    public double getIapt() {
        return this.f18502j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f18501i;
    }

    public int getLevel() {
        return this.f18500h;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f18498f != -1) {
            arrayList.add(new Pair<>(AGE, this.f18498f + ""));
        }
        if (!TextUtils.isEmpty(this.f18499g)) {
            arrayList.add(new Pair<>(GENDER, this.f18499g));
        }
        if (this.f18500h != -1) {
            arrayList.add(new Pair<>(LEVEL, this.f18500h + ""));
        }
        if (this.f18501i != null) {
            arrayList.add(new Pair<>(PAYING, this.f18501i + ""));
        }
        if (this.f18502j != -1.0d) {
            arrayList.add(new Pair<>(IAPT, this.f18502j + ""));
        }
        if (this.f18503k != 0) {
            arrayList.add(new Pair<>(USER_CREATION_DATE, this.f18503k + ""));
        }
        if (!TextUtils.isEmpty(this.f18493a)) {
            arrayList.add(new Pair<>(f18492m, this.f18493a));
        }
        arrayList.addAll(this.f18504l);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f18493a;
    }

    public long getUcd() {
        return this.f18503k;
    }

    @Deprecated
    public void setAge(int i10) {
        if (i10 > 0 && i10 <= 199) {
            this.f18498f = i10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setAge( " + i10 + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (a(str) && a(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f18504l.size() >= 5) {
                    this.f18504l.remove(0);
                }
                this.f18504l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    @Deprecated
    public void setGender(String str) {
        if (!TextUtils.isEmpty(str) && (StringUtils.toLowerCase(str).equals("male") || StringUtils.toLowerCase(str).equals("female"))) {
            this.f18499g = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d10) {
        if (d10 > 0.0d && d10 < this.f18495c) {
            this.f18502j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f18495c, 2);
    }

    public void setIsPaying(boolean z10) {
        if (this.f18501i == null) {
            this.f18501i = new AtomicBoolean();
        }
        this.f18501i.set(z10);
    }

    public void setLevel(int i10) {
        if (i10 > 0 && i10 < this.f18494b) {
            this.f18500h = i10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setLevel( " + i10 + " ) level must be between 1-" + this.f18494b, 2);
    }

    public void setSegmentName(String str) {
        if (a(str) && a(str, 1, 32)) {
            this.f18493a = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j10) {
        if (j10 > 0) {
            this.f18503k = j10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put((String) next.first, next.second);
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e8.getMessage());
            }
        }
        return jSONObject;
    }
}
