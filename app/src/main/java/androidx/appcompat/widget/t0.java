package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: SuggestionsAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class t0 extends z.c implements View.OnClickListener {

    /* renamed from: l  reason: collision with root package name */
    private final SearchView f1753l;

    /* renamed from: m  reason: collision with root package name */
    private final SearchableInfo f1754m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f1755n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1756o;

    /* renamed from: p  reason: collision with root package name */
    private final int f1757p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1758q;

    /* renamed from: r  reason: collision with root package name */
    private int f1759r;

    /* renamed from: s  reason: collision with root package name */
    private ColorStateList f1760s;

    /* renamed from: t  reason: collision with root package name */
    private int f1761t;

    /* renamed from: u  reason: collision with root package name */
    private int f1762u;

    /* renamed from: v  reason: collision with root package name */
    private int f1763v;

    /* renamed from: w  reason: collision with root package name */
    private int f1764w;

    /* renamed from: x  reason: collision with root package name */
    private int f1765x;

    /* renamed from: y  reason: collision with root package name */
    private int f1766y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1767a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1768b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1769c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1770d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1771e;

        public a(View view) {
            this.f1767a = (TextView) view.findViewById(16908308);
            this.f1768b = (TextView) view.findViewById(16908309);
            this.f1769c = (ImageView) view.findViewById(16908295);
            this.f1770d = (ImageView) view.findViewById(16908296);
            this.f1771e = (ImageView) view.findViewById(e.f.f24632q);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1758q = false;
        this.f1759r = 1;
        this.f1761t = -1;
        this.f1762u = -1;
        this.f1763v = -1;
        this.f1764w = -1;
        this.f1765x = -1;
        this.f1766y = -1;
        this.f1753l = searchView;
        this.f1754m = searchableInfo;
        this.f1757p = searchView.getSuggestionCommitIconResId();
        this.f1755n = context;
        this.f1756o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1756o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1756o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1760s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1755n.getTheme().resolveAttribute(e.a.L, typedValue, true);
            this.f1760s = this.f1755n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1760s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f1755n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("SuggestionsAdapter", e8.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1756o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f1756o.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f1755n.getResources());
        }
        Drawable m7 = m(componentName);
        this.f1756o.put(flattenToShortString, m7 != null ? m7.getConstantState() : null);
        return m7;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n10 = n(this.f1754m.getSearchActivity());
        return n10 != null ? n10 : this.f1755n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1755n.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e8) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e8);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e10) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1755n.getPackageName() + "/" + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable f10 = androidx.core.content.a.f(this.f1755n, parseInt);
            A(str2, f10);
            return f10;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f1764w;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        return s10 != null ? s10 : p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f1765x;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e8);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // z.a, z.b.a
    public void a(Cursor cursor) {
        if (this.f1758q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1761t = cursor.getColumnIndex("suggest_text_1");
                this.f1762u = cursor.getColumnIndex("suggest_text_2");
                this.f1763v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1764w = cursor.getColumnIndex("suggest_icon_1");
                this.f1765x = cursor.getColumnIndex("suggest_icon_2");
                this.f1766y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e8);
        }
    }

    @Override // z.a, z.b.a
    public CharSequence b(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (!this.f1754m.shouldRewriteQueryFromData() || (o11 = o(cursor, "suggest_intent_data")) == null) {
            if (!this.f1754m.shouldRewriteQueryFromText() || (o10 = o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return o10;
        }
        return o11;
    }

    @Override // z.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1753l.getVisibility() == 0 && this.f1753l.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f1754m, charSequence2, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException e8) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e8);
            }
        }
        return null;
    }

    @Override // z.a
    public void e(View view, Context context, Cursor cursor) {
        CharSequence w10;
        a aVar = (a) view.getTag();
        int i10 = this.f1766y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1767a != null) {
            z(aVar.f1767a, w(cursor, this.f1761t));
        }
        if (aVar.f1768b != null) {
            String w11 = w(cursor, this.f1763v);
            if (w11 != null) {
                w10 = l(w11);
            } else {
                w10 = w(cursor, this.f1762u);
            }
            if (TextUtils.isEmpty(w10)) {
                TextView textView = aVar.f1767a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1767a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1767a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1767a.setMaxLines(1);
                }
            }
            z(aVar.f1768b, w10);
        }
        ImageView imageView = aVar.f1769c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1770d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f1759r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1771e.setVisibility(8);
            return;
        }
        aVar.f1771e.setVisibility(0);
        aVar.f1771e.setTag(aVar.f1767a.getText());
        aVar.f1771e.setOnClickListener(this);
    }

    @Override // z.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View g10 = g(this.f1755n, d(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f1767a.setText(e8.toString());
            }
            return g10;
        }
    }

    @Override // z.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View h10 = h(this.f1755n, d(), viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f1767a.setText(e8.toString());
            }
            return h10;
        }
    }

    @Override // z.c, z.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(e.f.f24632q)).setImageResource(this.f1757p);
        return h10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1753l.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1755n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1755n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i10) {
        this.f1759r = i10;
    }
}
