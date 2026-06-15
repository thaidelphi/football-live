package com.startapp.sdk.adsbase.consent;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ConsentConfig implements Serializable {
    private static final long serialVersionUID = -8539908407395078756L;
    private boolean allowCT;
    private String clickUrl;
    private Integer consentType;
    @TypeInfo(complex = true)
    private ConsentTypeInfoConfig consentTypeInfo;
    private String dParam;
    private boolean detectConsentCovering;
    private String impressionUrl;
    private String template;
    private Integer templateId;
    private Integer templateName;
    private long timeStamp = 0;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final String a() {
        return this.clickUrl;
    }

    public final Integer b() {
        return this.consentType;
    }

    public final ConsentTypeInfoConfig c() {
        return this.consentTypeInfo;
    }

    public final String d() {
        return this.dParam;
    }

    public final String e() {
        return this.impressionUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentConfig.class != obj.getClass()) {
            return false;
        }
        ConsentConfig consentConfig = (ConsentConfig) obj;
        return this.allowCT == consentConfig.allowCT && this.detectConsentCovering == consentConfig.detectConsentCovering && this.timeStamp == consentConfig.timeStamp && o9.a(this.consentType, consentConfig.consentType) && o9.a(this.template, consentConfig.template) && o9.a(this.impressionUrl, consentConfig.impressionUrl) && o9.a(this.clickUrl, consentConfig.clickUrl) && o9.a(this.templateName, consentConfig.templateName) && o9.a(this.templateId, consentConfig.templateId) && o9.a(this.dParam, consentConfig.dParam) && o9.a(this.consentTypeInfo, consentConfig.consentTypeInfo) && o9.a(this.infoEvents, consentConfig.infoEvents);
    }

    public final ComponentInfoEventConfig f() {
        return this.infoEvents;
    }

    public final String g() {
        return this.template;
    }

    public final Integer h() {
        return this.templateId;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.allowCT), Boolean.valueOf(this.detectConsentCovering), this.consentType, this.template, Long.valueOf(this.timeStamp), this.impressionUrl, this.clickUrl, this.templateName, this.templateId, this.dParam, this.consentTypeInfo, this.infoEvents};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final Integer i() {
        return this.templateName;
    }

    public final long j() {
        return this.timeStamp;
    }

    public final boolean k() {
        return this.detectConsentCovering;
    }

    public final boolean l() {
        return this.allowCT;
    }
}
