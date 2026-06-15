package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoClosingRoomOpenHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements v0.h, o {

    /* renamed from: a  reason: collision with root package name */
    private final v0.h f4190a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4191b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.room.a f4192c;

    /* compiled from: AutoClosingRoomOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a implements v0.g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.room.a f4193a;

        a(androidx.room.a aVar) {
            this.f4193a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object k(String str, v0.g gVar) {
            gVar.m(str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object t(String str, Object[] objArr, v0.g gVar) {
            gVar.x(str, objArr);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean w(v0.g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(gVar.A0());
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object z(v0.g gVar) {
            return null;
        }

        @Override // v0.g
        public boolean A0() {
            return ((Boolean) this.f4193a.c(new m.a() { // from class: androidx.room.d
                @Override // m.a
                public final Object apply(Object obj) {
                    Boolean w10;
                    w10 = i.a.w((v0.g) obj);
                    return w10;
                }
            })).booleanValue();
        }

        @Override // v0.g
        public void D() {
            if (this.f4193a.d() != null) {
                try {
                    this.f4193a.d().D();
                    return;
                } finally {
                    this.f4193a.b();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }

        void E() {
            this.f4193a.c(new m.a() { // from class: androidx.room.e
                @Override // m.a
                public final Object apply(Object obj) {
                    Object z10;
                    z10 = i.a.z((v0.g) obj);
                    return z10;
                }
            });
        }

        @Override // v0.g
        public String M() {
            return (String) this.f4193a.c(new m.a() { // from class: androidx.room.g
                @Override // m.a
                public final Object apply(Object obj) {
                    return ((v0.g) obj).M();
                }
            });
        }

        @Override // v0.g
        public Cursor W(v0.j jVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f4193a.e().W(jVar, cancellationSignal), this.f4193a);
            } catch (Throwable th) {
                this.f4193a.b();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f4193a.a();
        }

        @Override // v0.g
        public v0.k f0(String str) {
            return new b(str, this.f4193a);
        }

        @Override // v0.g
        public void g() {
            try {
                this.f4193a.e().g();
            } catch (Throwable th) {
                this.f4193a.b();
                throw th;
            }
        }

        @Override // v0.g
        public boolean isOpen() {
            v0.g d10 = this.f4193a.d();
            if (d10 == null) {
                return false;
            }
            return d10.isOpen();
        }

        @Override // v0.g
        public List<Pair<String, String>> l() {
            return (List) this.f4193a.c(new m.a() { // from class: androidx.room.f
                @Override // m.a
                public final Object apply(Object obj) {
                    return ((v0.g) obj).l();
                }
            });
        }

        @Override // v0.g
        public void m(final String str) throws SQLException {
            this.f4193a.c(new m.a() { // from class: androidx.room.b
                @Override // m.a
                public final Object apply(Object obj) {
                    Object k10;
                    k10 = i.a.k(str, (v0.g) obj);
                    return k10;
                }
            });
        }

        @Override // v0.g
        public Cursor q(v0.j jVar) {
            try {
                return new c(this.f4193a.e().q(jVar), this.f4193a);
            } catch (Throwable th) {
                this.f4193a.b();
                throw th;
            }
        }

        @Override // v0.g
        public Cursor r0(String str) {
            try {
                return new c(this.f4193a.e().r0(str), this.f4193a);
            } catch (Throwable th) {
                this.f4193a.b();
                throw th;
            }
        }

        @Override // v0.g
        public void v() {
            v0.g d10 = this.f4193a.d();
            if (d10 != null) {
                d10.v();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        @Override // v0.g
        public void x(final String str, final Object[] objArr) throws SQLException {
            this.f4193a.c(new m.a() { // from class: androidx.room.c
                @Override // m.a
                public final Object apply(Object obj) {
                    Object t10;
                    t10 = i.a.t(str, objArr, (v0.g) obj);
                    return t10;
                }
            });
        }

        @Override // v0.g
        public boolean x0() {
            if (this.f4193a.d() == null) {
                return false;
            }
            return ((Boolean) this.f4193a.c(new m.a() { // from class: androidx.room.h
                @Override // m.a
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((v0.g) obj).x0());
                }
            })).booleanValue();
        }

        @Override // v0.g
        public void y() {
            try {
                this.f4193a.e().y();
            } catch (Throwable th) {
                this.f4193a.b();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements v0.k {

        /* renamed from: a  reason: collision with root package name */
        private final String f4194a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<Object> f4195b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private final androidx.room.a f4196c;

        b(String str, androidx.room.a aVar) {
            this.f4194a = str;
            this.f4196c = aVar;
        }

        private void b(v0.k kVar) {
            int i10 = 0;
            while (i10 < this.f4195b.size()) {
                int i11 = i10 + 1;
                Object obj = this.f4195b.get(i10);
                if (obj == null) {
                    kVar.v0(i11);
                } else if (obj instanceof Long) {
                    kVar.m0(i11, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.p(i11, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.d0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.p0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private <T> T f(final m.a<v0.k, T> aVar) {
            return (T) this.f4196c.c(new m.a() { // from class: androidx.room.j
                @Override // m.a
                public final Object apply(Object obj) {
                    Object j10;
                    j10 = i.b.this.j(aVar, (v0.g) obj);
                    return j10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object j(m.a aVar, v0.g gVar) {
            v0.k f02 = gVar.f0(this.f4194a);
            b(f02);
            return aVar.apply(f02);
        }

        private void k(int i10, Object obj) {
            int i11 = i10 - 1;
            if (i11 >= this.f4195b.size()) {
                for (int size = this.f4195b.size(); size <= i11; size++) {
                    this.f4195b.add(null);
                }
            }
            this.f4195b.set(i11, obj);
        }

        @Override // v0.k
        public long a0() {
            return ((Long) f(new m.a() { // from class: androidx.room.l
                @Override // m.a
                public final Object apply(Object obj) {
                    return Long.valueOf(((v0.k) obj).a0());
                }
            })).longValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // v0.i
        public void d0(int i10, String str) {
            k(i10, str);
        }

        @Override // v0.i
        public void m0(int i10, long j10) {
            k(i10, Long.valueOf(j10));
        }

        @Override // v0.k
        public int n() {
            return ((Integer) f(new m.a() { // from class: androidx.room.k
                @Override // m.a
                public final Object apply(Object obj) {
                    return Integer.valueOf(((v0.k) obj).n());
                }
            })).intValue();
        }

        @Override // v0.i
        public void p(int i10, double d10) {
            k(i10, Double.valueOf(d10));
        }

        @Override // v0.i
        public void p0(int i10, byte[] bArr) {
            k(i10, bArr);
        }

        @Override // v0.i
        public void v0(int i10) {
            k(i10, null);
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class c implements Cursor {

        /* renamed from: a  reason: collision with root package name */
        private final Cursor f4197a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.room.a f4198b;

        c(Cursor cursor, androidx.room.a aVar) {
            this.f4197a = cursor;
            this.f4198b = aVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4197a.close();
            this.f4198b.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f4197a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f4197a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f4197a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f4197a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f4197a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f4197a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f4197a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f4197a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f4197a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f4197a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f4197a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f4197a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f4197a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f4197a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return v0.c.a(this.f4197a);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return v0.f.a(this.f4197a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f4197a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f4197a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f4197a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f4197a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f4197a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f4197a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f4197a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f4197a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f4197a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f4197a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f4197a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f4197a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f4197a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f4197a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f4197a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f4197a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f4197a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f4197a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f4197a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f4197a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f4197a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            v0.e.a(this.f4197a, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f4197a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            v0.f.b(this.f4197a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f4197a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f4197a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(v0.h hVar, androidx.room.a aVar) {
        this.f4190a = hVar;
        this.f4192c = aVar;
        aVar.f(hVar);
        this.f4191b = new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.room.a a() {
        return this.f4192c;
    }

    @Override // v0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f4191b.close();
        } catch (IOException e8) {
            t0.e.a(e8);
        }
    }

    @Override // v0.h
    public String getDatabaseName() {
        return this.f4190a.getDatabaseName();
    }

    @Override // androidx.room.o
    public v0.h getDelegate() {
        return this.f4190a;
    }

    @Override // v0.h
    public v0.g q0() {
        this.f4191b.E();
        return this.f4191b;
    }

    @Override // v0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4190a.setWriteAheadLoggingEnabled(z10);
    }
}
