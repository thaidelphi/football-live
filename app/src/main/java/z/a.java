package z;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import z.b;
/* compiled from: CursorAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f33402a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f33403b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f33404c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f33405d;

    /* renamed from: e  reason: collision with root package name */
    protected int f33406e;

    /* renamed from: f  reason: collision with root package name */
    protected C0396a f33407f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f33408g;

    /* renamed from: h  reason: collision with root package name */
    protected z.b f33409h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: z.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0396a extends ContentObserver {
        C0396a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f33402a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f33402a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public abstract CharSequence b(Cursor cursor);

    @Override // z.b.a
    public Cursor d() {
        return this.f33404c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f33403b = true;
        } else {
            this.f33403b = false;
        }
        boolean z10 = cursor != null;
        this.f33404c = cursor;
        this.f33402a = z10;
        this.f33405d = context;
        this.f33406e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f33407f = new C0396a();
            this.f33408g = new b();
        } else {
            this.f33407f = null;
            this.f33408g = null;
        }
        if (z10) {
            C0396a c0396a = this.f33407f;
            if (c0396a != null) {
                cursor.registerContentObserver(c0396a);
            }
            DataSetObserver dataSetObserver = this.f33408g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f33402a || (cursor = this.f33404c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f33402a) {
            this.f33404c.moveToPosition(i10);
            if (view == null) {
                view = g(this.f33405d, this.f33404c, viewGroup);
            }
            e(view, this.f33405d, this.f33404c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f33409h == null) {
            this.f33409h = new z.b(this);
        }
        return this.f33409h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f33402a || (cursor = this.f33404c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f33404c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f33402a && (cursor = this.f33404c) != null && cursor.moveToPosition(i10)) {
            return this.f33404c.getLong(this.f33406e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f33402a) {
            if (this.f33404c.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f33405d, this.f33404c, viewGroup);
                }
                e(view, this.f33405d, this.f33404c);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f33403b || (cursor = this.f33404c) == null || cursor.isClosed()) {
            return;
        }
        this.f33402a = this.f33404c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f33404c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0396a c0396a = this.f33407f;
            if (c0396a != null) {
                cursor2.unregisterContentObserver(c0396a);
            }
            DataSetObserver dataSetObserver = this.f33408g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f33404c = cursor;
        if (cursor != null) {
            C0396a c0396a2 = this.f33407f;
            if (c0396a2 != null) {
                cursor.registerContentObserver(c0396a2);
            }
            DataSetObserver dataSetObserver2 = this.f33408g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f33406e = cursor.getColumnIndexOrThrow("_id");
            this.f33402a = true;
            notifyDataSetChanged();
        } else {
            this.f33406e = -1;
            this.f33402a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
