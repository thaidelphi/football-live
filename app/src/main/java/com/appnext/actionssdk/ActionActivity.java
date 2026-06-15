package com.appnext.actionssdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.actionssdk.b;
import com.appnext.core.AppnextError;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionActivity extends Activity {
    private static final String TAG = "ActionActivity";
    private com.appnext.core.e click;

    /* renamed from: e  reason: collision with root package name */
    private e f9987e;

    /* renamed from: s  reason: collision with root package name */
    private b f9988s;

    /* renamed from: t  reason: collision with root package name */
    private AbsListView f9989t;

    /* renamed from: u  reason: collision with root package name */
    private int f9990u = -1;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<AdData> f9991v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    protected com.appnext.actionssdk.b f9992w;

    /* renamed from: x  reason: collision with root package name */
    private AlertDialog f9993x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass1 implements b.InterfaceC0149b {
        AnonymousClass1() {
        }

        @Override // com.appnext.actionssdk.b.InterfaceC0149b
        public final void f() {
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setFillAfter(true);
            ActionActivity.this.f9992w.startAnimation(translateAnimation);
            new Handler().postDelayed(new Runnable() { // from class: com.appnext.actionssdk.ActionActivity.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ActionActivity.this.finish();
                }
            }, 150L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionActivity.this.f9992w.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            ActionActivity.this.f9992w.startAnimation(translateAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass3 implements View.OnClickListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ActionActivity.this.f9993x.dismiss();
            ActionActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass4 implements View.OnClickListener {
        final /* synthetic */ Context val$context;

        AnonymousClass4(Context context) {
            this.val$context = context;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ResourceType"})
        public final void onClick(View view) {
            LinearLayout linearLayout = new LinearLayout(this.val$context);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(com.appnext.core.f.a(this.val$context, 6.0f), com.appnext.core.f.a(this.val$context, 6.0f), com.appnext.core.f.a(this.val$context, 6.0f), com.appnext.core.f.a(this.val$context, 6.0f));
            TextView textView = new TextView(this.val$context);
            linearLayout.addView(textView);
            textView.setText("Privacy Policy");
            textView.setTextColor(-16777216);
            textView.setTextSize(2, 12.0f);
            textView.setPadding(com.appnext.core.f.a(this.val$context, 8.0f), com.appnext.core.f.a(this.val$context, 6.0f), com.appnext.core.f.a(this.val$context, 6.0f), com.appnext.core.f.a(this.val$context, 6.0f));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.actionssdk.ActionActivity.4.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ActionActivity.this.openLink("https://www.appnext.com/privacy_policy/index.html");
                }
            });
            RelativeLayout relativeLayout = new RelativeLayout(this.val$context);
            linearLayout.addView(relativeLayout);
            relativeLayout.getLayoutParams().height = com.appnext.core.f.a(this.val$context, 30.0f);
            relativeLayout.getLayoutParams().width = -2;
            TextView textView2 = new TextView(this.val$context);
            relativeLayout.addView(textView2);
            textView2.getLayoutParams().height = com.appnext.core.f.a(this.val$context, 30.0f);
            textView2.setText("Powered by  ");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 17) {
                textView2.setId(View.generateViewId());
            } else {
                textView2.setId(23421);
            }
            textView2.setTextColor(-16777216);
            textView2.setTextSize(2, 12.0f);
            ((RelativeLayout.LayoutParams) textView2.getLayoutParams()).addRule(9);
            textView2.setPadding(com.appnext.core.f.a(this.val$context, 8.0f), com.appnext.core.f.a(this.val$context, 6.0f), com.appnext.core.f.a(this.val$context, 0.0f), com.appnext.core.f.a(this.val$context, 6.0f));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.actionssdk.ActionActivity.4.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ActionActivity.this.openLink("http://www.appnext.com/");
                }
            });
            ImageView imageView = new ImageView(this.val$context);
            relativeLayout.addView(imageView);
            imageView.setImageResource(R.drawable.appnext_actions_logo);
            imageView.setPadding(0, com.appnext.core.f.a(this.val$context, 1.0f), com.appnext.core.f.a(this.val$context, 8.0f), 0);
            imageView.getLayoutParams().height = com.appnext.core.f.a(this.val$context, 30.0f);
            imageView.getLayoutParams().width = com.appnext.core.f.a(this.val$context, 60.0f);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            if (i10 >= 17) {
                imageView.setId(View.generateViewId());
            } else {
                imageView.setId(23422);
            }
            ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).addRule(1, textView2.getId());
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.actionssdk.ActionActivity.4.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ActionActivity.this.openLink("http://www.appnext.com/");
                }
            });
            PopupWindow popupWindow = new PopupWindow(linearLayout, com.appnext.core.f.a(this.val$context, 180.0f), -2);
            popupWindow.setBackgroundDrawable(this.val$context.getResources().getDrawable(17301683));
            popupWindow.setOutsideTouchable(true);
            popupWindow.showAsDropDown(view, 0, view.getHeight() * (-1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass5 implements AdapterView.OnItemClickListener {
        AnonymousClass5() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (ActionActivity.this.f9991v.size() > i10) {
                ActionActivity.b(ActionActivity.this, i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass6 implements DialogInterface.OnClickListener {
        AnonymousClass6() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (ActionActivity.this.f9991v.size() > i10) {
                ActionActivity.b(ActionActivity.this, i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass7 implements DialogInterface.OnDismissListener {
        AnonymousClass7() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            ActionActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            ListView listView = adapterView instanceof ListView ? (ListView) adapterView : null;
            if (listView != null) {
                i10 -= listView.getHeaderViewsCount();
            }
            if (i10 < 0 || i10 >= ActionActivity.this.f9991v.size()) {
                return;
            }
            int checkedItemPosition = ActionActivity.this.f9989t.getCheckedItemPosition();
            boolean z10 = checkedItemPosition != -1;
            if (z10 && ActionActivity.this.f9990u == checkedItemPosition) {
                return;
            }
            if (z10) {
                ActionActivity.this.f9989t.smoothScrollToPosition(checkedItemPosition);
            }
            ActionActivity.this.f9990u = checkedItemPosition;
            ActionActivity.b(ActionActivity.this, i10);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {
        public TextView E;
        public ImageView F;

        c(View view) {
            this.E = (TextView) view.findViewById(R.id.text1);
            this.F = (ImageView) view.findViewById(R.id.icon);
        }
    }

    private void showDialog() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.apnxtActionsWindow);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.apnxt_action_top, (ViewGroup) null, false);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, com.appnext.core.f.a(contextThemeWrapper, 40.0f)));
        relativeLayout.findViewById(R.id.back).setOnClickListener(new AnonymousClass3());
        relativeLayout.findViewById(R.id.options).setOnClickListener(new AnonymousClass4(contextThemeWrapper));
        d dVar = new d(contextThemeWrapper, this.f9991v);
        AlertDialog.Builder builder = new AlertDialog.Builder(contextThemeWrapper);
        builder.setCustomTitle(relativeLayout);
        if (Boolean.valueOf(f.y().get("template_back")).booleanValue()) {
            builder.setAdapter(dVar, null);
            AlertDialog create = builder.create();
            this.f9993x = create;
            create.getListView().setOnItemClickListener(new AnonymousClass5());
        } else {
            builder.setAdapter(dVar, new AnonymousClass6());
            this.f9993x = builder.create();
        }
        this.f9993x.setCustomTitle(relativeLayout);
        ListView listView = this.f9993x.getListView();
        listView.setDivider(new ColorDrawable(Color.parseColor("#e7e7e7")));
        listView.setDividerHeight(com.appnext.core.f.a(contextThemeWrapper, 1.0f));
        listView.setBackgroundResource(R.drawable.apnxt_bottom_round);
        this.f9993x.show();
        this.f9993x.setOnDismissListener(new AnonymousClass7());
        Window window = this.f9993x.getWindow();
        window.setWindowAnimations(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.flags |= 524288;
        window.setDimAmount(0.7f);
        window.setAttributes(attributes);
        try {
            View findViewById = this.f9993x.findViewById(this.f9993x.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
            if (findViewById != null) {
                findViewById.setBackgroundColor(Color.parseColor("#e7e7e8"));
            }
        } catch (Throwable unused) {
        }
        try {
            View findViewById2 = this.f9993x.findViewById(this.f9993x.getContext().getResources().getIdentifier("android:id/topPanel", null, null));
            if (findViewById2 != null) {
                ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).leftMargin = findViewById2.getPaddingLeft();
                ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).rightMargin = findViewById2.getPaddingRight();
                findViewById2.setPadding(0, findViewById2.getPaddingTop(), 0, findViewById2.getPaddingBottom());
                findViewById2.setBackgroundColor(0);
            }
        } catch (Throwable unused2) {
        }
        try {
            View findViewById3 = this.f9993x.findViewById(this.f9993x.getContext().getResources().getIdentifier("android:id/contentPanel", null, null));
            if (findViewById3 != null) {
                ((LinearLayout.LayoutParams) findViewById3.getLayoutParams()).leftMargin = findViewById3.getPaddingLeft();
                ((LinearLayout.LayoutParams) findViewById3.getLayoutParams()).rightMargin = findViewById3.getPaddingRight();
                findViewById3.setPadding(0, findViewById3.getPaddingTop(), 0, findViewById3.getPaddingBottom());
                findViewById3.setBackgroundResource(R.drawable.apnxt_bottom_round);
            }
        } catch (Throwable unused3) {
        }
        if (ActionSDK.aT.getOnAdOpenedCallback() != null) {
            ActionSDK.aT.getOnAdOpenedCallback().adOpened();
        }
    }

    public boolean configureContentView(ArrayList<AdData> arrayList) {
        this.f9988s = createAdapter(this, arrayList);
        int layoutResource = getLayoutResource();
        if (this.f9988s.getCount() > 0) {
            setContentView(layoutResource);
            AbsListView absListView = (AbsListView) findViewById(R.id.resolver_list);
            this.f9989t = absListView;
            onPrepareAdapterView(absListView, this.f9988s, false);
        } else {
            setContentView(R.layout.appnext_actions_resolver_list);
            ((TextView) findViewById(R.id.empty)).setVisibility(0);
            AbsListView absListView2 = (AbsListView) findViewById(R.id.resolver_list);
            this.f9989t = absListView2;
            absListView2.setVisibility(8);
        }
        return false;
    }

    public b createAdapter(Context context, ArrayList<AdData> arrayList) {
        return new b(context, arrayList);
    }

    public int getLayoutResource() {
        return R.layout.appnext_actions_resolver_list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.AppnextActionsResolver);
        super.onCreate(bundle);
        if (ActionSDK.aT == null) {
            finish();
            return;
        }
        this.click = com.appnext.core.e.r(this);
        ArrayList<AdData> arrayList = (ArrayList) getIntent().getExtras().get("ads");
        this.f9991v = arrayList;
        if (arrayList == null) {
            return;
        }
        int i10 = getIntent().getExtras().getInt("type", ActionSDK.ACTION_DIALOG);
        if (i10 == 871) {
            if (!configureContentView(this.f9991v)) {
                com.appnext.actionssdk.b bVar = (com.appnext.actionssdk.b) findViewById(R.id.contentPanel);
                if (bVar != null) {
                    bVar.a(new AnonymousClass1());
                    this.f9992w = bVar;
                }
                this.f9992w.setVisibility(4);
                TextView textView = (TextView) findViewById(R.id.title);
                if (textView != null) {
                    textView.setText("Complete your action with");
                }
                setTitle("Complete your action with");
                new Handler().postDelayed(new AnonymousClass2(), 250L);
            }
        } else if (i10 == 431) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.apnxtActionsWindow);
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.apnxt_action_top, (ViewGroup) null, false);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, com.appnext.core.f.a(contextThemeWrapper, 40.0f)));
            relativeLayout.findViewById(R.id.back).setOnClickListener(new AnonymousClass3());
            relativeLayout.findViewById(R.id.options).setOnClickListener(new AnonymousClass4(contextThemeWrapper));
            d dVar = new d(contextThemeWrapper, this.f9991v);
            AlertDialog.Builder builder = new AlertDialog.Builder(contextThemeWrapper);
            builder.setCustomTitle(relativeLayout);
            if (Boolean.valueOf(f.y().get("template_back")).booleanValue()) {
                builder.setAdapter(dVar, null);
                AlertDialog create = builder.create();
                this.f9993x = create;
                create.getListView().setOnItemClickListener(new AnonymousClass5());
            } else {
                builder.setAdapter(dVar, new AnonymousClass6());
                this.f9993x = builder.create();
            }
            this.f9993x.setCustomTitle(relativeLayout);
            ListView listView = this.f9993x.getListView();
            listView.setDivider(new ColorDrawable(Color.parseColor("#e7e7e7")));
            listView.setDividerHeight(com.appnext.core.f.a(contextThemeWrapper, 1.0f));
            listView.setBackgroundResource(R.drawable.apnxt_bottom_round);
            this.f9993x.show();
            this.f9993x.setOnDismissListener(new AnonymousClass7());
            Window window = this.f9993x.getWindow();
            window.setWindowAnimations(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.flags |= 524288;
            window.setDimAmount(0.7f);
            window.setAttributes(attributes);
            try {
                View findViewById = this.f9993x.findViewById(this.f9993x.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
                if (findViewById != null) {
                    findViewById.setBackgroundColor(Color.parseColor("#e7e7e8"));
                }
            } catch (Throwable unused) {
            }
            try {
                View findViewById2 = this.f9993x.findViewById(this.f9993x.getContext().getResources().getIdentifier("android:id/topPanel", null, null));
                if (findViewById2 != null) {
                    ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).leftMargin = findViewById2.getPaddingLeft();
                    ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).rightMargin = findViewById2.getPaddingRight();
                    findViewById2.setPadding(0, findViewById2.getPaddingTop(), 0, findViewById2.getPaddingBottom());
                    findViewById2.setBackgroundColor(0);
                }
            } catch (Throwable unused2) {
            }
            try {
                View findViewById3 = this.f9993x.findViewById(this.f9993x.getContext().getResources().getIdentifier("android:id/contentPanel", null, null));
                if (findViewById3 != null) {
                    ((LinearLayout.LayoutParams) findViewById3.getLayoutParams()).leftMargin = findViewById3.getPaddingLeft();
                    ((LinearLayout.LayoutParams) findViewById3.getLayoutParams()).rightMargin = findViewById3.getPaddingRight();
                    findViewById3.setPadding(0, findViewById3.getPaddingTop(), 0, findViewById3.getPaddingBottom());
                    findViewById3.setBackgroundResource(R.drawable.apnxt_bottom_round);
                }
            } catch (Throwable unused3) {
            }
            if (ActionSDK.aT.getOnAdOpenedCallback() != null) {
                ActionSDK.aT.getOnAdOpenedCallback().adOpened();
            }
        } else {
            finish();
            return;
        }
        for (int i11 = 0; i11 < Math.min(5, this.f9991v.size()); i11++) {
            if (this.f9991v.get(i11).getType().equals(AdData.SPONSORED)) {
                a(this.f9991v.get(i11));
                b(this.f9991v.get(i11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            AlertDialog alertDialog = this.f9993x;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Throwable unused) {
        }
        ActionAd actionAd = ActionSDK.aT;
        if (actionAd != null && actionAd.getOnAdClosedCallback() != null) {
            ActionSDK.aT.getOnAdClosedCallback().onAdClosed();
        }
        try {
            e eVar = this.f9987e;
            if (eVar != null) {
                eVar.d(this);
            }
            this.f9987e = null;
        } catch (Throwable unused2) {
        }
        overridePendingTransition(0, 0);
    }

    public void onPrepareAdapterView(AbsListView absListView, b bVar, boolean z10) {
        ListView listView = absListView instanceof ListView ? (ListView) absListView : null;
        absListView.setAdapter((ListAdapter) bVar);
        absListView.setOnItemClickListener(new a());
        if (!z10 || listView == null) {
            return;
        }
        listView.setChoiceMode(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (Throwable unused) {
            if (ActionSDK.aT.getOnAdErrorCallback() != null) {
                ActionSDK.aT.getOnAdErrorCallback().adError(AppnextError.NO_MARKET);
            }
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        if (intent == null) {
            intent = new Intent();
        }
        super.startActivityForResult(intent, i10);
    }

    private void e() {
        if (configureContentView(this.f9991v)) {
            return;
        }
        com.appnext.actionssdk.b bVar = (com.appnext.actionssdk.b) findViewById(R.id.contentPanel);
        if (bVar != null) {
            bVar.a(new AnonymousClass1());
            this.f9992w = bVar;
        }
        this.f9992w.setVisibility(4);
        TextView textView = (TextView) findViewById(R.id.title);
        if (textView != null) {
            textView.setText("Complete your action with");
        }
        setTitle("Complete your action with");
        new Handler().postDelayed(new AnonymousClass2(), 250L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(final AdData adData) {
        runOnUiThread(new Runnable() { // from class: com.appnext.actionssdk.ActionActivity.9
            @Override // java.lang.Runnable
            public final void run() {
                if (adData.L() == null || adData.L().equals("")) {
                    return;
                }
                ActionActivity.this.click.a(adData.L(), adData.J(), null);
            }
        });
    }

    protected final void c(String str) {
        try {
            startActivity(getPackageManager().getLaunchIntentForPackage(str));
        } catch (Throwable unused) {
            ActionAd actionAd = ActionSDK.aT;
            if (actionAd == null || actionAd.getOnAdErrorCallback() == null) {
                return;
            }
            ActionSDK.aT.getOnAdErrorCallback().adError(AppnextError.NO_MARKET);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends BaseAdapter {
        final LayoutInflater C;
        ArrayList<AdData> D;

        b(Context context, ArrayList<AdData> arrayList) {
            this.C = LayoutInflater.from(context);
            this.D = arrayList;
        }

        final View a(ViewGroup viewGroup) {
            View onCreateView = onCreateView(viewGroup);
            onCreateView.setTag(new c(onCreateView));
            return onCreateView;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public final AdData getItem(int i10) {
            if (this.D.size() > i10) {
                return this.D.get(i10);
            }
            return null;
        }

        final int g() {
            return getCount();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            ArrayList<AdData> arrayList = this.D;
            if (arrayList == null) {
                return 0;
            }
            if (arrayList.size() >= 5) {
                return 5;
            }
            if (this.D.size() < 3) {
                return 3;
            }
            return this.D.size();
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.C.inflate(R.layout.appnext_actions_resolve_list_item, viewGroup, false);
                view.setTag(new c(view));
            }
            AdData item = getItem(i10);
            c cVar = (c) view.getTag();
            if (item != null) {
                cVar.E.setText(item.getName());
                ImageView imageView = cVar.F;
                Resources resources = ActionActivity.this.getResources();
                imageView.setImageDrawable(new BitmapDrawable(resources, BitmapFactory.decodeFile(ActionActivity.this.getFilesDir().getAbsolutePath() + "/data/appnext/images/apps/" + item.C() + ".png")));
                cVar.E.setVisibility(0);
                cVar.F.setVisibility(0);
            } else {
                cVar.E.setVisibility(4);
                cVar.F.setVisibility(4);
            }
            return view;
        }

        final View onCreateView(ViewGroup viewGroup) {
            return this.C.inflate(R.layout.appnext_actions_resolve_list_item, viewGroup, false);
        }

        private void a(View view, AdData adData) {
            c cVar = (c) view.getTag();
            if (adData != null) {
                cVar.E.setText(adData.getName());
                ImageView imageView = cVar.F;
                Resources resources = ActionActivity.this.getResources();
                imageView.setImageDrawable(new BitmapDrawable(resources, BitmapFactory.decodeFile(ActionActivity.this.getFilesDir().getAbsolutePath() + "/data/appnext/images/apps/" + adData.C() + ".png")));
                cVar.E.setVisibility(0);
                cVar.F.setVisibility(0);
                return;
            }
            cVar.E.setVisibility(4);
            cVar.F.setVisibility(4);
        }
    }

    static /* synthetic */ void b(ActionActivity actionActivity, int i10) {
        actionActivity.a(actionActivity.f9991v.get(i10), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(final AdData adData) {
        new Thread(new Runnable() { // from class: com.appnext.actionssdk.ActionActivity.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String K = adData.K();
                    if (K != null && !K.equals("")) {
                        com.appnext.core.f.a(K, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    private void a(int i10) {
        a(this.f9991v.get(i10), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AdData adData, int i10) {
        if (this.f9987e == null) {
            this.f9987e = new e();
        }
        i.a(this, adData, i10, this.f9987e);
    }
}
