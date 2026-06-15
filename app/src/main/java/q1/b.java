package q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ariabolds.dateobjectz.d;
import com.google.android.gms.ads.RequestConfiguration;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: AdapterSub.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends RecyclerView.h<c> {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<p1.b> f30043a;

    /* renamed from: b  reason: collision with root package name */
    Context f30044b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0344b f30045c;

    /* renamed from: d  reason: collision with root package name */
    private int f30046d = -1;

    /* renamed from: e  reason: collision with root package name */
    SharedPreferences f30047e;

    /* renamed from: f  reason: collision with root package name */
    String f30048f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterSub.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p1.b f30049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30050b;

        a(p1.b bVar, int i10) {
            this.f30049a = bVar;
            this.f30050b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f30045c != null) {
                b.this.f30045c.a(view, this.f30049a, this.f30050b);
            }
        }
    }

    /* compiled from: AdapterSub.java */
    /* renamed from: q1.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0344b {
        void a(View view, p1.b bVar, int i10);
    }

    /* compiled from: AdapterSub.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: a  reason: collision with root package name */
        ImageView f30052a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f30053b;

        /* renamed from: c  reason: collision with root package name */
        TextView f30054c;

        /* renamed from: d  reason: collision with root package name */
        TextView f30055d;

        /* renamed from: e  reason: collision with root package name */
        TextView f30056e;

        /* renamed from: f  reason: collision with root package name */
        TextView f30057f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f30058g;

        /* renamed from: h  reason: collision with root package name */
        TextView f30059h;

        /* renamed from: i  reason: collision with root package name */
        TextView f30060i;

        /* renamed from: j  reason: collision with root package name */
        LinearLayout f30061j;

        public c(View view) {
            super(view);
            this.f30059h = (TextView) view.findViewById(2131362282);
            TextView textView = (TextView) view.findViewById(2131362189);
            this.f30057f = textView;
            textView.setVisibility(8);
            this.f30060i = (TextView) view.findViewById(2131362537);
            this.f30055d = (TextView) view.findViewById(2131362381);
            this.f30056e = (TextView) view.findViewById(2131362379);
            this.f30052a = (ImageView) view.findViewById(2131361898);
            this.f30053b = (ImageView) view.findViewById(2131362169);
            this.f30054c = (TextView) view.findViewById(2131362496);
            this.f30058g = (LinearLayout) view.findViewById(2131362378);
            this.f30061j = (LinearLayout) view.findViewById(2131362168);
        }
    }

    public b(ArrayList<p1.b> arrayList, Context context) {
        this.f30043a = new ArrayList<>();
        this.f30043a = arrayList;
        this.f30044b = context;
        this.f30047e = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(c cVar, int i10) {
        Date date;
        p1.b bVar = this.f30043a.get(i10);
        if (!bVar.l().equals("")) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    cVar.f30056e.setVisibility(0);
                    cVar.f30055d.setVisibility(0);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    cVar.f30056e.setVisibility(0);
                    cVar.f30055d.setVisibility(0);
                } catch (Exception unused2) {
                }
            }
            int parseInt = Integer.parseInt(new SimpleDateFormat("dd", Locale.getDefault()).format(new Date()));
            TimeZone timeZone = TimeZone.getDefault();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+06:00"));
            try {
                date = simpleDateFormat.parse(bVar.l().replace(RequestConfiguration.MAX_AD_CONTENT_RATING_T, " "));
            } catch (ParseException e8) {
                e8.printStackTrace();
                date = null;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd");
            simpleDateFormat2.setTimeZone(timeZone);
            int parseInt2 = Integer.parseInt(simpleDateFormat2.format(date));
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm");
            simpleDateFormat3.setTimeZone(timeZone);
            String format = simpleDateFormat3.format(date);
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
            simpleDateFormat4.setTimeZone(timeZone);
            String format2 = simpleDateFormat4.format(date);
            if (parseInt2 == parseInt) {
                cVar.f30056e.setText("Today");
            } else {
                cVar.f30056e.setText(String.valueOf(format2));
            }
            cVar.f30055d.setText(String.valueOf(format));
        } else {
            cVar.f30056e.setText("");
            cVar.f30055d.setText("");
            cVar.f30055d.setVisibility(8);
        }
        String o10 = bVar.o();
        Locale locale = Locale.ROOT;
        if (o10.toLowerCase(locale).contains("live")) {
            cVar.f30056e.setText("");
            cVar.f30055d.setText("");
            cVar.f30056e.setVisibility(8);
            cVar.f30055d.setVisibility(8);
            cVar.f30053b.setVisibility(0);
            com.bumptech.glide.b.t(this.f30044b).l().u0(2131231135).s0(cVar.f30053b);
        } else if (bVar.o().toLowerCase(locale).contains("soon")) {
            cVar.f30056e.setText("");
            cVar.f30055d.setText("");
            cVar.f30056e.setVisibility(8);
            cVar.f30055d.setVisibility(8);
            cVar.f30053b.setVisibility(0);
            com.bumptech.glide.b.t(this.f30044b).l().u0(2131231186).s0(cVar.f30053b);
        } else {
            cVar.f30053b.setVisibility(8);
        }
        if (!bVar.d().isEmpty()) {
            if (this.f30047e.getInt("vp", 0) == 1 && d.a()) {
                com.bumptech.glide.b.u(cVar.f30052a).q(2131231133).i(2131231168).T(2131231184).s0(cVar.f30052a);
            } else {
                com.bumptech.glide.b.u(cVar.f30052a).r(bVar.d()).i(2131231168).T(2131231184).s0(cVar.f30052a);
            }
        } else {
            cVar.f30061j.setVisibility(8);
        }
        try {
            if (!bVar.e().split("\n")[0].split(" vs ")[1].isEmpty() && !TextUtils.isEmpty(bVar.e().split("\n")[0].split(" vs ")[1].trim())) {
                cVar.f30059h.setVisibility(0);
                cVar.f30060i.setVisibility(0);
                cVar.f30054c.setVisibility(8);
                cVar.f30059h.setText(bVar.e().split("\n")[0].split(" vs ")[0] + " VS " + bVar.e().split("\n")[0].split(" vs ")[1].split("\\(")[0]);
                if (bVar.e().split("\n")[0].split(" vs ")[1].toString().contains("(") && bVar.e().split("\n")[0].split(" vs ")[1].toString().contains(")")) {
                    Matcher matcher = Pattern.compile("\\((.*?)\\)").matcher(bVar.e().split("\n")[0].split(" vs ")[1]);
                    String str = "";
                    while (matcher.find()) {
                        str = matcher.group(1);
                        System.out.println(matcher.group(1));
                    }
                    cVar.f30057f.setVisibility(0);
                    cVar.f30057f.setText("(" + str + ")");
                } else {
                    cVar.f30057f.setVisibility(8);
                }
            } else {
                cVar.f30059h.setVisibility(8);
                cVar.f30054c.setText(bVar.e().replace(" vs ", ""));
                cVar.f30054c.setVisibility(0);
            }
        } catch (Exception unused3) {
            cVar.f30059h.setVisibility(8);
            cVar.f30054c.setText(bVar.e());
            cVar.f30054c.setVisibility(0);
        }
        try {
            this.f30048f = "";
            Matcher matcher2 = Pattern.compile("(\\d+)").matcher(bVar.e());
            if (matcher2.find()) {
                this.f30048f = matcher2.group();
            }
        } catch (Exception unused4) {
        }
        if (bVar.e().contains(" - ")) {
            String str2 = this.f30048f + "\n" + bVar.e().split(" - ")[1].split(" ")[0];
            try {
                int indexOf = str2.indexOf("\n");
                int length = str2.length();
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new TextAppearanceSpan(null, 1, 0, new ColorStateList(new int[][]{new int[0]}, new int[]{-65536}), null), indexOf, length, 33);
                cVar.f30060i.setText(spannableString);
            } catch (Exception unused5) {
                cVar.f30060i.setText(str2);
            }
        }
        cVar.f30058g.setOnClickListener(new a(bVar, i10));
        cVar.f30058g.startAnimation(AnimationUtils.loadAnimation(this.f30044b, i10 > this.f30046d ? 2130772010 : 2130771999));
        this.f30046d = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(this.f30044b).inflate(2131558579, viewGroup, false));
    }

    public void d() {
        this.f30043a = new ArrayList<>();
        notifyDataSetChanged();
    }

    public void e(InterfaceC0344b interfaceC0344b) {
        this.f30045c = interfaceC0344b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f30043a.size();
    }
}
