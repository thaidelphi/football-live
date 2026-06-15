package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.core.view.a0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a  reason: collision with root package name */
    private final Context f796a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.appcompat.app.g f797b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f798c;

    /* renamed from: d  reason: collision with root package name */
    private final int f799d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f800e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f801f;

    /* renamed from: g  reason: collision with root package name */
    ListView f802g;

    /* renamed from: h  reason: collision with root package name */
    private View f803h;

    /* renamed from: i  reason: collision with root package name */
    private int f804i;

    /* renamed from: j  reason: collision with root package name */
    private int f805j;

    /* renamed from: k  reason: collision with root package name */
    private int f806k;

    /* renamed from: l  reason: collision with root package name */
    private int f807l;

    /* renamed from: m  reason: collision with root package name */
    private int f808m;

    /* renamed from: o  reason: collision with root package name */
    Button f810o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f811p;

    /* renamed from: q  reason: collision with root package name */
    Message f812q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f813r;

    /* renamed from: s  reason: collision with root package name */
    Button f814s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f815t;

    /* renamed from: u  reason: collision with root package name */
    Message f816u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f817v;

    /* renamed from: w  reason: collision with root package name */
    Button f818w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f819x;

    /* renamed from: y  reason: collision with root package name */
    Message f820y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f821z;

    /* renamed from: n  reason: collision with root package name */
    private boolean f809n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f822a;

        /* renamed from: b  reason: collision with root package name */
        private final int f823b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f24691c2);
            this.f823b = obtainStyledAttributes.getDimensionPixelOffset(e.j.f24696d2, -1);
            this.f822a = obtainStyledAttributes.getDimensionPixelOffset(e.j.f24701e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f822a, getPaddingRight(), z11 ? getPaddingBottom() : this.f823b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f810o && (message3 = alertController.f812q) != null) {
                obtain = Message.obtain(message3);
            } else if (view == alertController.f814s && (message2 = alertController.f816u) != null) {
                obtain = Message.obtain(message2);
            } else {
                obtain = (view != alertController.f818w || (message = alertController.f820y) == null) ? null : Message.obtain(message);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f797b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f826b;

        b(View view, View view2) {
            this.f825a = view;
            this.f826b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f825a, this.f826b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f829b;

        c(View view, View view2) {
            this.f828a = view;
            this.f829b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f828a, this.f829b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f832b;

        d(View view, View view2) {
            this.f831a = view;
            this.f832b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f831a, this.f832b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f835b;

        e(View view, View view2) {
            this.f834a = view;
            this.f835b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f802g, this.f834a, this.f835b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f837a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f838b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f840d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f842f;

        /* renamed from: g  reason: collision with root package name */
        public View f843g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f844h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f845i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f846j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f847k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f848l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f849m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f850n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f851o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f852p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f853q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f855s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f856t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f857u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f858v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f859w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f860x;

        /* renamed from: y  reason: collision with root package name */
        public int f861y;

        /* renamed from: z  reason: collision with root package name */
        public View f862z;

        /* renamed from: c  reason: collision with root package name */
        public int f839c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f841e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f854r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f863a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f863a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f863a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f865a;

            /* renamed from: b  reason: collision with root package name */
            private final int f866b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f867c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f868d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f867c = recycleListView;
                this.f868d = alertController;
                Cursor cursor2 = getCursor();
                this.f865a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f866b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f865a));
                this.f867c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f866b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f838b.inflate(this.f868d.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f870a;

            c(AlertController alertController) {
                this.f870a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f860x.onClick(this.f870a.f797b, i10);
                if (f.this.H) {
                    return;
                }
                this.f870a.f797b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f872a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f873b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f872a = recycleListView;
                this.f873b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f872a.isItemChecked(i10);
                }
                f.this.J.onClick(this.f873b.f797b, i10, this.f872a.isItemChecked(i10));
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f837a = context;
            this.f838b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            int i10;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f838b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                if (this.K == null) {
                    listAdapter = new a(this.f837a, alertController.M, 16908308, this.f858v, recycleListView);
                } else {
                    listAdapter = new b(this.f837a, this.K, false, recycleListView, alertController);
                }
            } else {
                if (this.H) {
                    i10 = alertController.N;
                } else {
                    i10 = alertController.O;
                }
                int i11 = i10;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f837a, i11, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.f859w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f837a, i11, 16908308, this.f858v);
                    }
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f860x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f802g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f843g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f842f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f840d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f839c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f841e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f844h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f845i;
            if (charSequence3 != null || this.f846j != null) {
                alertController.k(-1, charSequence3, this.f847k, null, this.f846j);
            }
            CharSequence charSequence4 = this.f848l;
            if (charSequence4 != null || this.f849m != null) {
                alertController.k(-2, charSequence4, this.f850n, null, this.f849m);
            }
            CharSequence charSequence5 = this.f851o;
            if (charSequence5 != null || this.f852p != null) {
                alertController.k(-3, charSequence5, this.f853q, null, this.f852p);
            }
            if (this.f858v != null || this.K != null || this.f859w != null) {
                b(alertController);
            }
            View view2 = this.f862z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f861y;
            if (i12 != 0) {
                alertController.r(i12);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f875a;

        public g(DialogInterface dialogInterface) {
            this.f875a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f875a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.g gVar, Window window) {
        this.f796a = context;
        this.f797b = gVar;
        this.f798c = window;
        this.R = new g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e.j.F, e.a.f24553n, 0);
        this.J = obtainStyledAttributes.getResourceId(e.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(e.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(e.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(e.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(e.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(e.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(e.j.M, true);
        this.f799d = obtainStyledAttributes.getDimensionPixelSize(e.j.H, 0);
        obtainStyledAttributes.recycle();
        gVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f798c.findViewById(e.f.f24637v);
        View findViewById2 = this.f798c.findViewById(e.f.f24636u);
        if (Build.VERSION.SDK_INT >= 23) {
            a0.F0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f801f != null) {
            this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
            this.A.post(new c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f802g;
        if (listView != null) {
            listView.setOnScrollListener(new d(findViewById, findViewById2));
            this.f802g.post(new e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f810o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f811p) && this.f813r == null) {
            this.f810o.setVisibility(8);
            z10 = false;
        } else {
            this.f810o.setText(this.f811p);
            Drawable drawable = this.f813r;
            if (drawable != null) {
                int i10 = this.f799d;
                drawable.setBounds(0, 0, i10, i10);
                this.f810o.setCompoundDrawables(this.f813r, null, null, null);
            }
            this.f810o.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f814s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f815t) && this.f817v == null) {
            this.f814s.setVisibility(8);
        } else {
            this.f814s.setText(this.f815t);
            Drawable drawable2 = this.f817v;
            if (drawable2 != null) {
                int i11 = this.f799d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f814s.setCompoundDrawables(this.f817v, null, null, null);
            }
            this.f814s.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f818w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f819x) && this.f821z == null) {
            this.f818w.setVisibility(8);
        } else {
            this.f818w.setText(this.f819x);
            Drawable drawable3 = this.f821z;
            if (drawable3 != null) {
                int i12 = this.f799d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f818w.setCompoundDrawables(this.f821z, null, null, null);
            }
            this.f818w.setVisibility(0);
            z10 |= true;
        }
        if (z(this.f796a)) {
            if (z10) {
                b(this.f810o);
            } else if (z10) {
                b(this.f814s);
            } else if (z10) {
                b(this.f818w);
            }
        }
        if (z10) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f798c.findViewById(e.f.f24638w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f801f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f802g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f802g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f803h;
        if (view == null) {
            view = this.f804i != 0 ? LayoutInflater.from(this.f796a).inflate(this.f804i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f798c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f798c.findViewById(e.f.f24629n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f809n) {
                frameLayout.setPadding(this.f805j, this.f806k, this.f807l, this.f808m);
            }
            if (this.f802g != null) {
                ((LinearLayout.LayoutParams) ((l0.a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f798c.findViewById(e.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f798c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f800e)) && this.P) {
            TextView textView = (TextView) this.f798c.findViewById(e.f.f24625j);
            this.E = textView;
            textView.setText(this.f800e);
            int i10 = this.B;
            if (i10 != 0) {
                this.D.setImageResource(i10);
                return;
            }
            Drawable drawable = this.C;
            if (drawable != null) {
                this.D.setImageDrawable(drawable);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.f798c.findViewById(e.f.O).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f798c.findViewById(e.f.f24635t);
        int i10 = e.f.P;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = e.f.f24628m;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = e.f.f24626k;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(e.f.f24630o);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i13 == null || i13.getVisibility() == 8) ? false : 1;
        boolean z12 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!z12 && i14 != null && (findViewById2 = i14.findViewById(e.f.K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f801f != null || this.f802g != null) {
                view = i13.findViewById(e.f.N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i14 != null && (findViewById = i14.findViewById(e.f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f802g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f802g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                p(i14, view2, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f802g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i16 = this.I;
        if (i16 > -1) {
            listView2.setItemChecked(i16, true);
            listView2.setSelection(i16);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f24552m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f796a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f802g;
    }

    public void e() {
        this.f797b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f819x = charSequence;
            this.f820y = message;
            this.f821z = drawable;
        } else if (i10 == -2) {
            this.f815t = charSequence;
            this.f816u = message;
            this.f817v = drawable;
        } else if (i10 == -1) {
            this.f811p = charSequence;
            this.f812q = message;
            this.f813r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void o(CharSequence charSequence) {
        this.f801f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f800e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f803h = null;
        this.f804i = i10;
        this.f809n = false;
    }

    public void s(View view) {
        this.f803h = view;
        this.f804i = 0;
        this.f809n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f803h = view;
        this.f804i = 0;
        this.f809n = true;
        this.f805j = i10;
        this.f806k = i11;
        this.f807l = i12;
        this.f808m = i13;
    }
}
