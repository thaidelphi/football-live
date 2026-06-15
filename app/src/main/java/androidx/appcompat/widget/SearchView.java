package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.applovin.sdk.AppLovinEventParameters;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SearchView extends l0 implements i.c {

    /* renamed from: z0  reason: collision with root package name */
    static final n f1342z0;
    private Rect A;
    private int[] B;
    private int[] C;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence J;
    private l K;
    private k L;
    View.OnFocusChangeListener M;
    private m N;
    private View.OnClickListener O;
    private boolean P;
    private boolean Q;
    z.a R;
    private boolean S;
    private CharSequence T;
    private boolean U;
    private boolean V;
    private int W;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f1343a0;

    /* renamed from: b0  reason: collision with root package name */
    private CharSequence f1344b0;

    /* renamed from: c0  reason: collision with root package name */
    private CharSequence f1345c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f1346d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f1347e0;

    /* renamed from: f0  reason: collision with root package name */
    SearchableInfo f1348f0;

    /* renamed from: g0  reason: collision with root package name */
    private Bundle f1349g0;

    /* renamed from: h0  reason: collision with root package name */
    private final Runnable f1350h0;

    /* renamed from: i0  reason: collision with root package name */
    private Runnable f1351i0;

    /* renamed from: j0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1352j0;

    /* renamed from: k0  reason: collision with root package name */
    private final View.OnClickListener f1353k0;

    /* renamed from: l0  reason: collision with root package name */
    View.OnKeyListener f1354l0;

    /* renamed from: m0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1355m0;

    /* renamed from: n0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1356n0;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f1357p;

    /* renamed from: q  reason: collision with root package name */
    private final View f1358q;

    /* renamed from: r  reason: collision with root package name */
    private final View f1359r;

    /* renamed from: s  reason: collision with root package name */
    private final View f1360s;

    /* renamed from: t  reason: collision with root package name */
    final ImageView f1361t;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f1362u;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f1363v;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f1364w;

    /* renamed from: x  reason: collision with root package name */
    private final View f1365x;

    /* renamed from: x0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1366x0;

    /* renamed from: y  reason: collision with root package name */
    private o f1367y;

    /* renamed from: y0  reason: collision with root package name */
    private TextWatcher f1368y0;

    /* renamed from: z  reason: collision with root package name */
    private Rect f1369z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f1370c;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1370c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1370c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1370c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: e  reason: collision with root package name */
        private int f1371e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f1372f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1373g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f1374h;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.f24555p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    return (i10 < 640 || i11 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1342z0.c(this);
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f1373g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1373g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1371e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1373g) {
                removeCallbacks(this.f1374h);
                post(this.f1374h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1372f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1372f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1372f.hasFocus() && getVisibility() == 0) {
                this.f1373g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1373g = false;
                removeCallbacks(this.f1374h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1373g = false;
                removeCallbacks(this.f1374h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1373g = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1372f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1371e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1374h = new a();
            this.f1371e = getThreshold();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.a aVar = SearchView.this.R;
            if (aVar instanceof t0) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1361t) {
                searchView.V();
            } else if (view == searchView.f1363v) {
                searchView.R();
            } else if (view == searchView.f1362u) {
                searchView.W();
            } else if (view == searchView.f1364w) {
                searchView.a0();
            } else if (view == searchView.f1357p) {
                searchView.H();
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1348f0 == null) {
                return false;
            }
            if (searchView.f1357p.isPopupShowing() && SearchView.this.f1357p.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (!SearchView.this.f1357p.c() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i10 == 66) {
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.P(0, null, searchView2.f1357p.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface k {
        boolean onClose();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f1386a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1387b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1388c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f1386a = null;
            this.f1387b = null;
            this.f1388c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1386a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1387b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1388c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1387b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1386a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1388c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class o extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1389a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1390b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1391c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1392d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1393e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1394f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1393e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1390b = new Rect();
            this.f1392d = new Rect();
            this.f1391c = new Rect();
            a(rect, rect2);
            this.f1389a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1390b.set(rect);
            this.f1392d.set(rect);
            Rect rect3 = this.f1392d;
            int i10 = this.f1393e;
            rect3.inset(-i10, -i10);
            this.f1391c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1394f;
                    if (z11 && !this.f1392d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1394f;
                        this.f1394f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1390b.contains(x10, y10)) {
                    this.f1394f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (z10 && !this.f1391c.contains(x10, y10)) {
                    motionEvent.setLocation(this.f1389a.getWidth() / 2, this.f1389a.getHeight() / 2);
                } else {
                    Rect rect = this.f1391c;
                    motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
                }
                return this.f1389a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1342z0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1345c0);
        if (str3 != null) {
            intent.putExtra(AppLovinEventParameters.SEARCH_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1349g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1348f0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = t0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f1348f0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = t0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f1348f0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = t0.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), t0.o(cursor, "suggest_intent_extra_data"), t0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e8) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e8);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1349g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f1357p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.P || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1357p.getTextSize() * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f1348f0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1348f0.getVoiceSearchLaunchWebSearch()) {
            intent = this.H;
        } else if (this.f1348f0.getVoiceSearchLaunchRecognizer()) {
            intent = this.I;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.S || this.f1343a0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e8) {
            Log.e("SearchView", "Failed launch activity: " + intent, e8);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor d10 = this.R.d();
        if (d10 == null || !d10.moveToPosition(i10)) {
            return false;
        }
        O(D(d10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f1350h0);
    }

    private void c0(int i10) {
        Editable text = this.f1357p.getText();
        Cursor d10 = this.R.d();
        if (d10 == null) {
            return;
        }
        if (d10.moveToPosition(i10)) {
            CharSequence b10 = this.R.b(d10);
            if (b10 != null) {
                setQuery(b10);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1357p.getText());
        if (!z11 && (!this.P || this.f1346d0)) {
            z10 = false;
        }
        this.f1363v.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f1363v.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1357p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(e.d.f24581g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(e.d.f24582h);
    }

    private void h0() {
        this.f1357p.setThreshold(this.f1348f0.getSuggestThreshold());
        this.f1357p.setImeOptions(this.f1348f0.getImeOptions());
        int inputType = this.f1348f0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1348f0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1357p.setInputType(inputType);
        z.a aVar = this.R;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1348f0.getSuggestAuthority() != null) {
            t0 t0Var = new t0(getContext(), this, this.f1348f0, this.f1352j0);
            this.R = t0Var;
            this.f1357p.setAdapter(t0Var);
            ((t0) this.R).x(this.U ? 2 : 1);
        }
    }

    private void i0() {
        this.f1360s.setVisibility((N() && (this.f1362u.getVisibility() == 0 || this.f1364w.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z10) {
        this.f1362u.setVisibility((this.S && N() && hasFocus() && (z10 || !this.f1343a0)) ? 0 : 8);
    }

    private void k0(boolean z10) {
        this.Q = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1357p.getText());
        this.f1361t.setVisibility(i11);
        j0(z11);
        this.f1358q.setVisibility(z10 ? 8 : 0);
        if (this.D.getDrawable() == null || this.P) {
            i10 = 8;
        }
        this.D.setVisibility(i10);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f1343a0 && !L() && z10) {
            this.f1362u.setVisibility(8);
            i10 = 0;
        }
        this.f1364w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1357p.setText(charSequence);
        this.f1357p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        int i10;
        if (this.f1365x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1359r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = g1.b(this);
            int dimensionPixelSize = this.P ? resources.getDimensionPixelSize(e.d.f24579e) + resources.getDimensionPixelSize(e.d.f24580f) : 0;
            this.f1357p.getDropDownBackground().getPadding(rect);
            if (b10) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1357p.setDropDownHorizontalOffset(i10);
            this.f1357p.setDropDownWidth((((this.f1365x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1357p.refreshAutoCompleteResults();
            return;
        }
        n nVar = f1342z0;
        nVar.b(this.f1357p);
        nVar.a(this.f1357p);
    }

    public boolean L() {
        return this.Q;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (TextUtils.isEmpty(this.f1357p.getText())) {
            if (this.P) {
                k kVar = this.L;
                if (kVar == null || !kVar.onClose()) {
                    clearFocus();
                    k0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f1357p.setText("");
        this.f1357p.requestFocus();
        this.f1357p.setImeVisibility(true);
    }

    boolean S(int i10, int i11, String str) {
        m mVar = this.N;
        if (mVar == null || !mVar.b(i10)) {
            Q(i10, 0, null);
            this.f1357p.setImeVisibility(false);
            G();
            return true;
        }
        return false;
    }

    boolean T(int i10) {
        m mVar = this.N;
        if (mVar == null || !mVar.a(i10)) {
            c0(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f1357p.requestFocus();
        this.f1357p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f1357p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.K;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f1348f0 != null) {
                P(0, null, text.toString());
            }
            this.f1357p.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.f1348f0 != null && this.R != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f1357p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1357p.setSelection(i10 == 21 ? 0 : this.f1357p.length());
                this.f1357p.setListSelection(0);
                this.f1357p.clearListSelection();
                this.f1357p.b();
                return true;
            } else if (i10 == 19) {
                this.f1357p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f1357p.getText();
        this.f1345c0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        if (this.K != null && !TextUtils.equals(charSequence, this.f1344b0)) {
            this.K.a(charSequence.toString());
        }
        this.f1344b0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f1357p.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f1348f0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // i.c
    public void b() {
        if (this.f1346d0) {
            return;
        }
        this.f1346d0 = true;
        int imeOptions = this.f1357p.getImeOptions();
        this.f1347e0 = imeOptions;
        this.f1357p.setImeOptions(imeOptions | 33554432);
        this.f1357p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.V = true;
        super.clearFocus();
        this.f1357p.clearFocus();
        this.f1357p.setImeVisibility(false);
        this.V = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f1357p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1357p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1345c0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // i.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f1357p.setImeOptions(this.f1347e0);
        this.f1346d0 = false;
    }

    void f0() {
        int[] iArr = this.f1357p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1359r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1360s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1357p.getImeOptions();
    }

    public int getInputType() {
        return this.f1357p.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.f1357p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1348f0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.f1348f0.getHintId());
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.F;
    }

    public z.a getSuggestionsAdapter() {
        return this.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1350h0);
        post(this.f1351i0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f1357p, this.f1369z);
            Rect rect = this.A;
            Rect rect2 = this.f1369z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            o oVar = this.f1367y;
            if (oVar == null) {
                o oVar2 = new o(this.A, this.f1369z, this.f1357p);
                this.f1367y = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.A, this.f1369z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.W;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.W) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        k0(savedState.f1370c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1370c = L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.V && isFocusable()) {
            if (!L()) {
                boolean requestFocus = this.f1357p.requestFocus(i10, rect);
                if (requestFocus) {
                    k0(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i10, rect);
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1349g0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.f1357p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1357p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.W = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.L = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.K = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.N = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.T = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.U = z10;
        z.a aVar = this.R;
        if (aVar instanceof t0) {
            ((t0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1348f0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.f1343a0 = K;
        if (K) {
            this.f1357p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.S = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(z.a aVar) {
        this.R = aVar;
        this.f1357p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1369z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1350h0 = new b();
        this.f1351i0 = new c();
        this.f1352j0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1353k0 = fVar;
        this.f1354l0 = new g();
        h hVar = new h();
        this.f1355m0 = hVar;
        i iVar = new i();
        this.f1356n0 = iVar;
        j jVar = new j();
        this.f1366x0 = jVar;
        this.f1368y0 = new a();
        int[] iArr = e.j.f24706f2;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.a0.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(e.j.f24756p2, e.g.f24659r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.f.D);
        this.f1357p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1358q = findViewById(e.f.f24641z);
        View findViewById = findViewById(e.f.C);
        this.f1359r = findViewById;
        View findViewById2 = findViewById(e.f.J);
        this.f1360s = findViewById2;
        ImageView imageView = (ImageView) findViewById(e.f.f24639x);
        this.f1361t = imageView;
        ImageView imageView2 = (ImageView) findViewById(e.f.A);
        this.f1362u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(e.f.f24640y);
        this.f1363v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(e.f.E);
        this.f1364w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(e.f.B);
        this.D = imageView5;
        androidx.core.view.a0.u0(findViewById, v10.g(e.j.f24761q2));
        androidx.core.view.a0.u0(findViewById2, v10.g(e.j.f24781u2));
        int i11 = e.j.f24776t2;
        imageView.setImageDrawable(v10.g(i11));
        imageView2.setImageDrawable(v10.g(e.j.f24746n2));
        imageView3.setImageDrawable(v10.g(e.j.f24731k2));
        imageView4.setImageDrawable(v10.g(e.j.f24791w2));
        imageView5.setImageDrawable(v10.g(i11));
        this.E = v10.g(e.j.f24771s2);
        c1.a(imageView, getResources().getString(e.h.f24673l));
        this.F = v10.n(e.j.f24786v2, e.g.f24658q);
        this.G = v10.n(e.j.f24736l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1368y0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1354l0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(e.j.f24751o2, true));
        int f10 = v10.f(e.j.f24716h2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.J = v10.p(e.j.f24741m2);
        this.T = v10.p(e.j.f24766r2);
        int k10 = v10.k(e.j.f24726j2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(e.j.f24721i2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(e.j.f24711g2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1365x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.P);
        g0();
    }
}
