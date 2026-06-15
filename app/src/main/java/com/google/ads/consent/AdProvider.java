package com.google.ads.consent;

import c7.c;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdProvider {
    @c("company_id")
    private String id;
    @c("company_name")
    private String name;
    @c("policy_url")
    private String privacyPolicyUrlString;

    public String a() {
        return this.id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdProvider adProvider = (AdProvider) obj;
        return this.id.equals(adProvider.id) && this.name.equals(adProvider.name) && this.privacyPolicyUrlString.equals(adProvider.privacyPolicyUrlString);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.privacyPolicyUrlString.hashCode();
    }
}
