package com.appnext.core;

import java.io.Serializable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements Serializable {
    private static final long serialVersionUID = 8086013010302241826L;
    private int adID = -1;
    private String adJSON = "";
    private String placementID = "";
    private String sid = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public int getAdID() {
        return this.adID;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getAdJSON() {
        return this.adJSON;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getPlacementID() {
        return this.placementID;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getSession() {
        return this.sid;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdID(int i10) {
        this.adID = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdJSON(String str) {
        this.adJSON = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPlacementID(String str) {
        this.placementID = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSession(String str) {
        this.sid = str;
    }
}
