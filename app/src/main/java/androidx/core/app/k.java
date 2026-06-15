package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: NotificationCompatBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2516a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f2517b;

    /* renamed from: c  reason: collision with root package name */
    private final j.e f2518c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f2519d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f2520e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f2521f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f2522g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f2523h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f2524i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j.e eVar) {
        int i10;
        Icon icon;
        List<String> list;
        List<String> e8;
        this.f2518c = eVar;
        this.f2516a = eVar.f2486a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f2517b = new Notification.Builder(eVar.f2486a, eVar.K);
        } else {
            this.f2517b = new Notification.Builder(eVar.f2486a);
        }
        Notification notification = eVar.S;
        this.f2517b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2494i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2490e).setContentText(eVar.f2491f).setContentInfo(eVar.f2496k).setContentIntent(eVar.f2492g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2493h, (notification.flags & 128) != 0).setLargeIcon(eVar.f2495j).setNumber(eVar.f2497l).setProgress(eVar.f2505t, eVar.f2506u, eVar.f2507v);
        if (i11 < 21) {
            this.f2517b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i11 >= 16) {
            this.f2517b.setSubText(eVar.f2502q).setUsesChronometer(eVar.f2500o).setPriority(eVar.f2498m);
            Iterator<j.a> it = eVar.f2487b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = eVar.D;
            if (bundle != null) {
                this.f2522g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f2511z) {
                    this.f2522g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f2508w;
                if (str != null) {
                    this.f2522g.putString("android.support.groupKey", str);
                    if (eVar.f2509x) {
                        this.f2522g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2522g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f2510y;
                if (str2 != null) {
                    this.f2522g.putString("android.support.sortKey", str2);
                }
            }
            this.f2519d = eVar.H;
            this.f2520e = eVar.I;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            this.f2517b.setShowWhen(eVar.f2499n);
        }
        if (i12 >= 19 && i12 < 21 && (e8 = e(g(eVar.f2488c), eVar.V)) != null && !e8.isEmpty()) {
            this.f2522g.putStringArray("android.people", (String[]) e8.toArray(new String[e8.size()]));
        }
        if (i12 >= 20) {
            this.f2517b.setLocalOnly(eVar.f2511z).setGroup(eVar.f2508w).setGroupSummary(eVar.f2509x).setSortKey(eVar.f2510y);
            this.f2523h = eVar.O;
        }
        if (i12 >= 21) {
            this.f2517b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
            if (i12 < 28) {
                list = e(g(eVar.f2488c), eVar.V);
            } else {
                list = eVar.V;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f2517b.addPerson(str3);
                }
            }
            this.f2524i = eVar.J;
            if (eVar.f2489d.size() > 0) {
                Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i13 = 0; i13 < eVar.f2489d.size(); i13++) {
                    bundle4.putBundle(Integer.toString(i13), l.b(eVar.f2489d.get(i13)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2522g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = eVar.U) != null) {
            this.f2517b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f2517b.setExtras(eVar.D).setRemoteInputHistory(eVar.f2504s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.f2517b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.f2517b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.f2517b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            this.f2517b.setBadgeIconType(eVar.L).setSettingsText(eVar.f2503r).setShortcutId(eVar.M).setTimeoutAfter(eVar.N).setGroupAlertBehavior(eVar.O);
            if (eVar.B) {
                this.f2517b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f2517b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<n> it2 = eVar.f2488c.iterator();
            while (it2.hasNext()) {
                this.f2517b.addPerson(it2.next().h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            this.f2517b.setAllowSystemGeneratedContextualActions(eVar.Q);
            this.f2517b.setBubbleMetadata(j.d.a(eVar.R));
        }
        if (i15 >= 31 && (i10 = eVar.P) != 0) {
            this.f2517b.setForegroundServiceBehavior(i10);
        }
        if (eVar.T) {
            if (this.f2518c.f2509x) {
                this.f2523h = 2;
            } else {
                this.f2523h = 1;
            }
            this.f2517b.setVibrate(null);
            this.f2517b.setSound(null);
            int i16 = notification.defaults & (-2);
            notification.defaults = i16;
            int i17 = i16 & (-3);
            notification.defaults = i17;
            this.f2517b.setDefaults(i17);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f2518c.f2508w)) {
                    this.f2517b.setGroup("silent");
                }
                this.f2517b.setGroupAlertBehavior(this.f2523h);
            }
        }
    }

    private void b(j.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 20) {
            if (i10 >= 16) {
                this.f2521f.add(l.f(this.f2517b, aVar));
                return;
            }
            return;
        }
        IconCompat e8 = aVar.e();
        if (i10 >= 23) {
            builder = new Notification.Action.Builder(e8 != null ? e8.q() : null, aVar.i(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(e8 != null ? e8.j() : 0, aVar.i(), aVar.a());
        }
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : p.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i11 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i11 >= 29) {
            builder.setContextual(aVar.k());
        }
        if (i11 >= 31) {
            builder.setAuthenticationRequired(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f2517b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<n> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n nVar : list) {
            arrayList.add(nVar.g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & (-2);
        notification.defaults = i10;
        notification.defaults = i10 & (-3);
    }

    @Override // androidx.core.app.i
    public Notification.Builder a() {
        return this.f2517b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        j.f fVar = this.f2518c.f2501p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e8 = fVar != null ? fVar.e(this) : null;
        Notification d11 = d();
        if (e8 != null) {
            d11.contentView = e8;
        } else {
            RemoteViews remoteViews = this.f2518c.H;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16 && fVar != null && (d10 = fVar.d(this)) != null) {
            d11.bigContentView = d10;
        }
        if (i10 >= 21 && fVar != null && (f10 = this.f2518c.f2501p.f(this)) != null) {
            d11.headsUpContentView = f10;
        }
        if (i10 >= 16 && fVar != null && (a10 = j.a(d11)) != null) {
            fVar.a(a10);
        }
        return d11;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f2517b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f2517b.build();
            if (this.f2523h != 0) {
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2523h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2523h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i10 >= 21) {
            this.f2517b.setExtras(this.f2522g);
            Notification build2 = this.f2517b.build();
            RemoteViews remoteViews = this.f2519d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2520e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2524i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2523h != 0) {
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2523h == 2) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2523h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i10 >= 20) {
            this.f2517b.setExtras(this.f2522g);
            Notification build3 = this.f2517b.build();
            RemoteViews remoteViews4 = this.f2519d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2520e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2523h != 0) {
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2523h == 2) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2523h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i10 >= 19) {
            SparseArray<Bundle> a10 = l.a(this.f2521f);
            if (a10 != null) {
                this.f2522g.putSparseParcelableArray("android.support.actionExtras", a10);
            }
            this.f2517b.setExtras(this.f2522g);
            Notification build4 = this.f2517b.build();
            RemoteViews remoteViews6 = this.f2519d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2520e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i10 >= 16) {
            Notification build5 = this.f2517b.build();
            Bundle a11 = j.a(build5);
            Bundle bundle = new Bundle(this.f2522g);
            for (String str : this.f2522g.keySet()) {
                if (a11.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a11.putAll(bundle);
            SparseArray<Bundle> a12 = l.a(this.f2521f);
            if (a12 != null) {
                j.a(build5).putSparseParcelableArray("android.support.actionExtras", a12);
            }
            RemoteViews remoteViews8 = this.f2519d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2520e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f2517b.getNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f2516a;
    }
}
