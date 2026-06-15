package com.startapp.sdk.ads.video.tracking;

import com.startapp.common.parser.TypeInfo;
import com.startapp.q9;
import com.startapp.sdk.ads.video.vast.a;
import com.startapp.v9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;
    @TypeInfo(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;
    @TypeInfo(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;
    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public final AbsoluteTrackingLink[] a() {
        return this.absoluteTrackingUrls;
    }

    public final ActionTrackingLink[] b() {
        return this.creativeViewUrls;
    }

    public final FractionTrackingLink[] c() {
        return this.fractionTrackingUrls;
    }

    public final ActionTrackingLink[] d() {
        return this.impressionUrls;
    }

    public final ActionTrackingLink[] e() {
        return this.inlineErrorTrackingUrls;
    }

    public final ActionTrackingLink[] f() {
        return this.soundMuteUrls;
    }

    public final ActionTrackingLink[] g() {
        return this.soundUnmuteUrls;
    }

    public final ActionTrackingLink[] h() {
        return this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] i() {
        return this.videoClosedUrls;
    }

    public final ActionTrackingLink[] j() {
        return this.videoPausedUrls;
    }

    public final ActionTrackingLink[] k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] l() {
        return this.videoPostRollClosedUrls;
    }

    public final ActionTrackingLink[] m() {
        return this.videoPostRollImpressionUrls;
    }

    public final ActionTrackingLink[] n() {
        return this.videoResumedUrls;
    }

    public final ActionTrackingLink[] o() {
        return this.videoRewardedUrls;
    }

    public final ActionTrackingLink[] p() {
        return this.videoSkippedUrls;
    }

    public final String toString() {
        return super.toString();
    }

    public VideoTrackingDetails(q9 q9Var) {
        this.isVAST = true;
        this.impressionUrls = a((List<String>) q9Var.j());
        this.soundMuteUrls = a((List<String>) q9Var.l());
        this.soundUnmuteUrls = a((List<String>) q9Var.q());
        this.videoPausedUrls = a((List<String>) q9Var.m());
        this.videoResumedUrls = a((List<String>) q9Var.n());
        this.videoSkippedUrls = a((List<String>) q9Var.p());
        this.videoClosedUrls = a((List<String>) q9Var.e());
        this.inlineErrorTrackingUrls = a((List<String>) q9Var.h());
        this.videoClickTrackingUrls = a((List<String>) q9Var.d());
        this.absoluteTrackingUrls = a(q9Var.a());
        this.fractionTrackingUrls = a(q9Var.i(), q9Var.g());
        a f10 = q9Var.f();
        if (f10 != null) {
            this.videoPostRollImpressionUrls = a(f10.d());
            this.videoPostRollClickTrackingUrls = a(f10.b());
        }
    }

    public static ActionTrackingLink[] a(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
                actionTrackingLink.a(str);
                actionTrackingLink.d();
                actionTrackingLink.e();
                arrayList.add(actionTrackingLink);
            }
            return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
        }
        return new ActionTrackingLink[0];
    }

    public static AbsoluteTrackingLink[] a(ArrayList arrayList) {
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v9 v9Var = (v9) it.next();
                AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
                absoluteTrackingLink.a(v9Var.f23481a);
                if (((Integer) v9Var.f23482b).intValue() != -1) {
                    absoluteTrackingLink.a(((Integer) v9Var.f23482b).intValue());
                }
                absoluteTrackingLink.d();
                absoluteTrackingLink.e();
                arrayList2.add(absoluteTrackingLink);
            }
            return (AbsoluteTrackingLink[]) arrayList2.toArray(new AbsoluteTrackingLink[0]);
        }
        return new AbsoluteTrackingLink[0];
    }

    public static FractionTrackingLink[] a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v9 v9Var = (v9) it.next();
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.a(v9Var.f23481a);
            fractionTrackingLink.a((int) (((Float) v9Var.f23482b).floatValue() * 100.0f));
            fractionTrackingLink.d();
            fractionTrackingLink.e();
            arrayList3.add(fractionTrackingLink);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.a((String) it2.next());
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.d();
            fractionTrackingLink2.e();
            arrayList3.add(fractionTrackingLink2);
        }
        return arrayList3.size() > 0 ? (FractionTrackingLink[]) arrayList3.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
    }
}
