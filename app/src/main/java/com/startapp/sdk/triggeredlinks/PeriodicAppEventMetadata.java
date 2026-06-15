package com.startapp.sdk.triggeredlinks;

import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class PeriodicAppEventMetadata implements Serializable {
    private static final long serialVersionUID = -3371103410620683752L;
    private int intervalInSeconds;
    private String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) obj;
        if (this.intervalInSeconds != periodicAppEventMetadata.intervalInSeconds) {
            return false;
        }
        String str = this.url;
        String str2 = periodicAppEventMetadata.url;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.url;
        return ((str != null ? str.hashCode() : 0) * 31) + this.intervalInSeconds;
    }

    public final String toString() {
        return super.toString();
    }
}
