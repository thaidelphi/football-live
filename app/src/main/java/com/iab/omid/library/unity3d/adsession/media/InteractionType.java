package com.iab.omid.library.unity3d.adsession.media;

import com.ironsource.c9;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum InteractionType {
    CLICK(c9.f16851d),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
