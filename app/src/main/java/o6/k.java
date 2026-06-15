package o6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f29464a;

    public k(Context context, String str) {
        this.f29464a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j10 = this.f29464a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f29464a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f29464a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f29464a.edit().putStringSet(str2, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    private synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f29464a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e8 = e(str);
        if (e8 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f29464a.getStringSet(e8, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f29464a.edit().remove(e8).commit();
        } else {
            this.f29464a.edit().putStringSet(e8, hashSet).commit();
        }
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f29464a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f29464a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.f29464a.edit();
        for (Map.Entry<String, ?> entry : this.f29464a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<l> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f29464a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(l.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        String d10 = d(System.currentTimeMillis());
        this.f29464a.edit().putString("last-used-date", d10).commit();
        h(d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(long j10) {
        return j("fire-global", j10);
    }

    synchronized boolean j(String str, long j10) {
        if (this.f29464a.contains(str)) {
            if (f(this.f29464a.getLong(str, -1L), j10)) {
                return false;
            }
            this.f29464a.edit().putLong(str, j10).commit();
            return true;
        }
        this.f29464a.edit().putLong(str, j10).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void k(long j10, String str) {
        String d10 = d(j10);
        if (this.f29464a.getString("last-used-date", "").equals(d10)) {
            String e8 = e(d10);
            if (e8 == null) {
                return;
            }
            if (e8.equals(str)) {
                return;
            }
            m(str, d10);
            return;
        }
        long j11 = this.f29464a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f29464a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f29464a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f29464a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    synchronized void l(long j10) {
        this.f29464a.edit().putLong("fire-global", j10).commit();
    }
}
