package com.startapp.sdk.adsbase.adrules;

import com.startapp.common.parser.TypeInfo;
import com.startapp.f;
import com.startapp.o9;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdRules implements Serializable {
    private static final long serialVersionUID = 9050956736420299872L;
    @TypeInfo(type = ArrayList.class, value = AdRule.class)
    private List<AdRule> session = new ArrayList();
    @TypeInfo(innerValue = AdRule.class, key = AdPreferences.Placement.class, type = HashMap.class, value = ArrayList.class)
    private Map<AdPreferences.Placement, List<AdRule>> placements = new HashMap();
    @TypeInfo(innerValue = AdRule.class, type = HashMap.class, value = ArrayList.class)
    private Map<String, List<AdRule>> tags = new HashMap();
    private boolean applyOnBannerRefresh = true;

    /* renamed from: a  reason: collision with root package name */
    public transient HashSet f23000a = new HashSet();

    public final boolean a() {
        return this.applyOnBannerRefresh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdRules adRules = (AdRules) obj;
        return this.applyOnBannerRefresh == adRules.applyOnBannerRefresh && o9.a(this.session, adRules.session) && o9.a(this.placements, adRules.placements) && o9.a(this.tags, adRules.tags);
    }

    public final int hashCode() {
        Object[] objArr = {this.session, this.placements, this.tags, Boolean.valueOf(this.applyOnBannerRefresh)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final synchronized AdRulesResult a(AdPreferences.Placement placement, String str) {
        AdRulesResult a10;
        this.f23000a.clear();
        f fVar = f.f21919d;
        a10 = a(this.tags.get(str), (List) fVar.f21922c.get(str), AdRuleLevel.TAG);
        if (a10.b()) {
            AdRuleLevel adRuleLevel = AdRuleLevel.PLACEMENT;
            placement.toString();
            a10 = a(this.placements.get(placement), (List) fVar.f21921b.get(placement), adRuleLevel);
            if (a10.b()) {
                a10 = a(this.session, fVar.f21920a, AdRuleLevel.SESSION);
            }
        }
        return a10;
    }

    public final AdRulesResult a(List list, List list2, AdRuleLevel adRuleLevel) {
        if (list == null) {
            return new AdRulesResult("", true);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdRule adRule = (AdRule) it.next();
            adRule.getClass();
            if (!this.f23000a.contains(adRule.getClass())) {
                if (!adRule.a(list2)) {
                    return new AdRulesResult(adRule.getClass().getSimpleName() + "_" + adRuleLevel + "", false);
                }
                this.f23000a.add(adRule.getClass());
            }
        }
        return new AdRulesResult("", true);
    }
}
