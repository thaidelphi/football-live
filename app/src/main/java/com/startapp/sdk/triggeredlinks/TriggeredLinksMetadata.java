package com.startapp.sdk.triggeredlinks;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TriggeredLinksMetadata implements Serializable {
    private static final long serialVersionUID = 1082253451843108611L;
    @TypeInfo(complex = true, name = "AppEvents")
    private AppEventsMetadata appEvents;
    private int ief;
    @TypeInfo(name = "ThrottlingPublisherIDs", type = ArrayList.class, value = Integer.class)
    private List<Integer> throttlingPublisherIDs;
    private boolean enabled = true;
    private int smartRedirectTimeoutInSec = 10;
    private boolean triggeredLinkInfoEvent = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggeredLinksMetadata triggeredLinksMetadata = (TriggeredLinksMetadata) obj;
        return this.enabled == triggeredLinksMetadata.enabled && this.smartRedirectTimeoutInSec == triggeredLinksMetadata.smartRedirectTimeoutInSec && this.triggeredLinkInfoEvent == triggeredLinksMetadata.triggeredLinkInfoEvent && this.ief == triggeredLinksMetadata.ief && o9.a(this.appEvents, triggeredLinksMetadata.appEvents) && o9.a(this.throttlingPublisherIDs, triggeredLinksMetadata.throttlingPublisherIDs);
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.smartRedirectTimeoutInSec), Boolean.valueOf(this.triggeredLinkInfoEvent), this.appEvents, this.throttlingPublisherIDs, Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
