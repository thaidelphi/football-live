package com.startapp.sdk.adsbase;

import android.content.SharedPreferences;
import android.os.Build;
import com.startapp.c8;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.y;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f23099a;

    /* renamed from: b  reason: collision with root package name */
    public final b f23100b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
    }

    public e(SharedPreferences sharedPreferences) {
        this(sharedPreferences, null);
    }

    @Override // android.content.SharedPreferences
    /* renamed from: a */
    public final a edit() {
        return new a(this.f23099a.edit(), this.f23099a.getAll(), this.f23100b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f23099a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        try {
            return this.f23099a.getAll();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        try {
            return this.f23099a.getBoolean(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        try {
            return this.f23099a.getFloat(str, f10);
        } catch (Throwable unused) {
            return f10;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        try {
            return this.f23099a.getInt(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        try {
            return this.f23099a.getLong(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f23099a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        try {
            return this.f23099a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f23099a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f23099a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public e(SharedPreferences sharedPreferences, y yVar) {
        this.f23099a = sharedPreferences;
        this.f23100b = yVar;
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        public final SharedPreferences.Editor f23101a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, ?> f23102b;

        /* renamed from: c  reason: collision with root package name */
        public final b f23103c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23104d;

        public a(SharedPreferences.Editor editor, Map<String, ?> map, b bVar) {
            this.f23101a = editor;
            this.f23102b = map;
            this.f23103c = bVar;
        }

        public final void a(Object obj, String str) {
            if (this.f23103c == null || o9.a(this.f23102b.get(str), obj)) {
                return;
            }
            this.f23104d = true;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            if (Build.VERSION.SDK_INT < 9) {
                this.f23101a.commit();
            } else {
                this.f23101a.apply();
            }
            b bVar = this.f23103c;
            if (bVar == null || !this.f23104d) {
                return;
            }
            this.f23104d = false;
            c8.f21846d.a(((y) bVar).f23312a.f23259a, MetaDataRequest.RequestReason.EXTRAS);
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            if (!this.f23102b.isEmpty()) {
                this.f23104d = true;
            }
            this.f23101a.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            return this.f23101a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f10) {
            a(Float.valueOf(f10), str);
            this.f23101a.putFloat(str, f10);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set set) {
            a(set, str);
            this.f23101a.putStringSet(str, set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            if (this.f23102b.containsKey(str)) {
                this.f23104d = true;
            }
            this.f23101a.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: a */
        public final a putString(String str, String str2) {
            a((Object) str2, str);
            this.f23101a.putString(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: a */
        public final a putInt(String str, int i10) {
            a(Integer.valueOf(i10), str);
            this.f23101a.putInt(str, i10);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: a */
        public final a putLong(String str, long j10) {
            a(Long.valueOf(j10), str);
            this.f23101a.putLong(str, j10);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: a */
        public final a putBoolean(String str, boolean z10) {
            a(Boolean.valueOf(z10), str);
            this.f23101a.putBoolean(str, z10);
            return this;
        }
    }
}
