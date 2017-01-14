package trikita.anvil;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import android.app.LocalActivityManager;
import android.app.MediaRouteButton;
import android.app.SearchableInfo;
import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.ExtractEditText;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.MediaPlayer;
import android.media.tv.TvView;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;
import android.view.inputmethod.ExtractedText;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AbsoluteLayout;
import android.widget.ActionMenuView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.AdapterViewFlipper;
import android.widget.AnalogClock;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.CursorAdapter;
import android.widget.DatePicker;
import android.widget.DialerFilter;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.MultiAutoCompleteTextView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.SlidingDrawer;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.StackView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextClock;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.Toolbar;
import android.widget.TwoLineListItem;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import android.widget.ZoomButton;
import android.widget.ZoomControls;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.Locale;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateSDK21DSL}.
 * It contains views and their setters from API level 21.
 * Please, don't edit it manually unless for debugging.
 */
public final class DSL extends BaseDSL {
  public static FragmentBreadCrumbs fragmentBreadCrumbs() {
    return BaseDSL.v(FragmentBreadCrumbsFactoryFunc.getInstance());
  }

  public static FragmentBreadCrumbs fragmentBreadCrumbs(Anvil.Renderable r) {
    return BaseDSL.v(FragmentBreadCrumbsFactoryFunc.getInstance(), r);
  }

  public static MediaRouteButton mediaRouteButton() {
    return BaseDSL.v(MediaRouteButtonFactoryFunc.getInstance());
  }

  public static MediaRouteButton mediaRouteButton(Anvil.Renderable r) {
    return BaseDSL.v(MediaRouteButtonFactoryFunc.getInstance(), r);
  }

  public static AppWidgetHostView appWidgetHostView() {
    return BaseDSL.v(AppWidgetHostViewFactoryFunc.getInstance());
  }

  public static AppWidgetHostView appWidgetHostView(Anvil.Renderable r) {
    return BaseDSL.v(AppWidgetHostViewFactoryFunc.getInstance(), r);
  }

  public static GestureOverlayView gestureOverlayView() {
    return BaseDSL.v(GestureOverlayViewFactoryFunc.getInstance());
  }

  public static GestureOverlayView gestureOverlayView(Anvil.Renderable r) {
    return BaseDSL.v(GestureOverlayViewFactoryFunc.getInstance(), r);
  }

  public static ExtractEditText extractEditText() {
    return BaseDSL.v(ExtractEditTextFactoryFunc.getInstance());
  }

  public static ExtractEditText extractEditText(Anvil.Renderable r) {
    return BaseDSL.v(ExtractEditTextFactoryFunc.getInstance(), r);
  }

  public static TvView tvView() {
    return BaseDSL.v(TvViewFactoryFunc.getInstance());
  }

  public static TvView tvView(Anvil.Renderable r) {
    return BaseDSL.v(TvViewFactoryFunc.getInstance(), r);
  }

  public static GLSurfaceView gLSurfaceView() {
    return BaseDSL.v(GLSurfaceViewFactoryFunc.getInstance());
  }

  public static GLSurfaceView gLSurfaceView(Anvil.Renderable r) {
    return BaseDSL.v(GLSurfaceViewFactoryFunc.getInstance(), r);
  }

  public static SurfaceView surfaceView() {
    return BaseDSL.v(SurfaceViewFactoryFunc.getInstance());
  }

  public static SurfaceView surfaceView(Anvil.Renderable r) {
    return BaseDSL.v(SurfaceViewFactoryFunc.getInstance(), r);
  }

  public static TextureView textureView() {
    return BaseDSL.v(TextureViewFactoryFunc.getInstance());
  }

  public static TextureView textureView(Anvil.Renderable r) {
    return BaseDSL.v(TextureViewFactoryFunc.getInstance(), r);
  }

  public static View view() {
    return BaseDSL.v(ViewFactoryFunc.getInstance());
  }

  public static View view(Anvil.Renderable r) {
    return BaseDSL.v(ViewFactoryFunc.getInstance(), r);
  }

  public static ViewStub viewStub() {
    return BaseDSL.v(ViewStubFactoryFunc.getInstance());
  }

  public static ViewStub viewStub(Anvil.Renderable r) {
    return BaseDSL.v(ViewStubFactoryFunc.getInstance(), r);
  }

  public static WebView webView() {
    return BaseDSL.v(WebViewFactoryFunc.getInstance());
  }

  public static WebView webView(Anvil.Renderable r) {
    return BaseDSL.v(WebViewFactoryFunc.getInstance(), r);
  }

  public static AbsoluteLayout absoluteLayout() {
    return BaseDSL.v(AbsoluteLayoutFactoryFunc.getInstance());
  }

  public static AbsoluteLayout absoluteLayout(Anvil.Renderable r) {
    return BaseDSL.v(AbsoluteLayoutFactoryFunc.getInstance(), r);
  }

  public static ActionMenuView actionMenuView() {
    return BaseDSL.v(ActionMenuViewFactoryFunc.getInstance());
  }

  public static ActionMenuView actionMenuView(Anvil.Renderable r) {
    return BaseDSL.v(ActionMenuViewFactoryFunc.getInstance(), r);
  }

  public static AdapterViewFlipper adapterViewFlipper() {
    return BaseDSL.v(AdapterViewFlipperFactoryFunc.getInstance());
  }

  public static AdapterViewFlipper adapterViewFlipper(Anvil.Renderable r) {
    return BaseDSL.v(AdapterViewFlipperFactoryFunc.getInstance(), r);
  }

  public static AnalogClock analogClock() {
    return BaseDSL.v(AnalogClockFactoryFunc.getInstance());
  }

  public static AnalogClock analogClock(Anvil.Renderable r) {
    return BaseDSL.v(AnalogClockFactoryFunc.getInstance(), r);
  }

  public static AutoCompleteTextView autoCompleteTextView() {
    return BaseDSL.v(AutoCompleteTextViewFactoryFunc.getInstance());
  }

  public static AutoCompleteTextView autoCompleteTextView(Anvil.Renderable r) {
    return BaseDSL.v(AutoCompleteTextViewFactoryFunc.getInstance(), r);
  }

  public static Button button() {
    return BaseDSL.v(ButtonFactoryFunc.getInstance());
  }

  public static Button button(Anvil.Renderable r) {
    return BaseDSL.v(ButtonFactoryFunc.getInstance(), r);
  }

  public static CalendarView calendarView() {
    return BaseDSL.v(CalendarViewFactoryFunc.getInstance());
  }

  public static CalendarView calendarView(Anvil.Renderable r) {
    return BaseDSL.v(CalendarViewFactoryFunc.getInstance(), r);
  }

  public static CheckBox checkBox() {
    return BaseDSL.v(CheckBoxFactoryFunc.getInstance());
  }

  public static CheckBox checkBox(Anvil.Renderable r) {
    return BaseDSL.v(CheckBoxFactoryFunc.getInstance(), r);
  }

  public static CheckedTextView checkedTextView() {
    return BaseDSL.v(CheckedTextViewFactoryFunc.getInstance());
  }

  public static CheckedTextView checkedTextView(Anvil.Renderable r) {
    return BaseDSL.v(CheckedTextViewFactoryFunc.getInstance(), r);
  }

  public static Chronometer chronometer() {
    return BaseDSL.v(ChronometerFactoryFunc.getInstance());
  }

  public static Chronometer chronometer(Anvil.Renderable r) {
    return BaseDSL.v(ChronometerFactoryFunc.getInstance(), r);
  }

  public static DatePicker datePicker() {
    return BaseDSL.v(DatePickerFactoryFunc.getInstance());
  }

  public static DatePicker datePicker(Anvil.Renderable r) {
    return BaseDSL.v(DatePickerFactoryFunc.getInstance(), r);
  }

  public static DialerFilter dialerFilter() {
    return BaseDSL.v(DialerFilterFactoryFunc.getInstance());
  }

  public static DialerFilter dialerFilter(Anvil.Renderable r) {
    return BaseDSL.v(DialerFilterFactoryFunc.getInstance(), r);
  }

  public static DigitalClock digitalClock() {
    return BaseDSL.v(DigitalClockFactoryFunc.getInstance());
  }

  public static DigitalClock digitalClock(Anvil.Renderable r) {
    return BaseDSL.v(DigitalClockFactoryFunc.getInstance(), r);
  }

  public static EditText editText() {
    return BaseDSL.v(EditTextFactoryFunc.getInstance());
  }

  public static EditText editText(Anvil.Renderable r) {
    return BaseDSL.v(EditTextFactoryFunc.getInstance(), r);
  }

  public static ExpandableListView expandableListView() {
    return BaseDSL.v(ExpandableListViewFactoryFunc.getInstance());
  }

  public static ExpandableListView expandableListView(Anvil.Renderable r) {
    return BaseDSL.v(ExpandableListViewFactoryFunc.getInstance(), r);
  }

  public static FrameLayout frameLayout() {
    return BaseDSL.v(FrameLayoutFactoryFunc.getInstance());
  }

  public static FrameLayout frameLayout(Anvil.Renderable r) {
    return BaseDSL.v(FrameLayoutFactoryFunc.getInstance(), r);
  }

  public static Gallery gallery() {
    return BaseDSL.v(GalleryFactoryFunc.getInstance());
  }

  public static Gallery gallery(Anvil.Renderable r) {
    return BaseDSL.v(GalleryFactoryFunc.getInstance(), r);
  }

  public static GridLayout gridLayout() {
    return BaseDSL.v(GridLayoutFactoryFunc.getInstance());
  }

  public static GridLayout gridLayout(Anvil.Renderable r) {
    return BaseDSL.v(GridLayoutFactoryFunc.getInstance(), r);
  }

  public static GridView gridView() {
    return BaseDSL.v(GridViewFactoryFunc.getInstance());
  }

  public static GridView gridView(Anvil.Renderable r) {
    return BaseDSL.v(GridViewFactoryFunc.getInstance(), r);
  }

  public static HorizontalScrollView horizontalScrollView() {
    return BaseDSL.v(HorizontalScrollViewFactoryFunc.getInstance());
  }

  public static HorizontalScrollView horizontalScrollView(Anvil.Renderable r) {
    return BaseDSL.v(HorizontalScrollViewFactoryFunc.getInstance(), r);
  }

  public static ImageButton imageButton() {
    return BaseDSL.v(ImageButtonFactoryFunc.getInstance());
  }

  public static ImageButton imageButton(Anvil.Renderable r) {
    return BaseDSL.v(ImageButtonFactoryFunc.getInstance(), r);
  }

  public static ImageSwitcher imageSwitcher() {
    return BaseDSL.v(ImageSwitcherFactoryFunc.getInstance());
  }

  public static ImageSwitcher imageSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(ImageSwitcherFactoryFunc.getInstance(), r);
  }

  public static ImageView imageView() {
    return BaseDSL.v(ImageViewFactoryFunc.getInstance());
  }

  public static ImageView imageView(Anvil.Renderable r) {
    return BaseDSL.v(ImageViewFactoryFunc.getInstance(), r);
  }

  public static LinearLayout linearLayout() {
    return BaseDSL.v(LinearLayoutFactoryFunc.getInstance());
  }

  public static LinearLayout linearLayout(Anvil.Renderable r) {
    return BaseDSL.v(LinearLayoutFactoryFunc.getInstance(), r);
  }

  public static ListView listView() {
    return BaseDSL.v(ListViewFactoryFunc.getInstance());
  }

  public static ListView listView(Anvil.Renderable r) {
    return BaseDSL.v(ListViewFactoryFunc.getInstance(), r);
  }

  public static MediaController mediaController() {
    return BaseDSL.v(MediaControllerFactoryFunc.getInstance());
  }

  public static MediaController mediaController(Anvil.Renderable r) {
    return BaseDSL.v(MediaControllerFactoryFunc.getInstance(), r);
  }

  public static MultiAutoCompleteTextView multiAutoCompleteTextView() {
    return BaseDSL.v(MultiAutoCompleteTextViewFactoryFunc.getInstance());
  }

  public static MultiAutoCompleteTextView multiAutoCompleteTextView(Anvil.Renderable r) {
    return BaseDSL.v(MultiAutoCompleteTextViewFactoryFunc.getInstance(), r);
  }

  public static NumberPicker numberPicker() {
    return BaseDSL.v(NumberPickerFactoryFunc.getInstance());
  }

  public static NumberPicker numberPicker(Anvil.Renderable r) {
    return BaseDSL.v(NumberPickerFactoryFunc.getInstance(), r);
  }

  public static ProgressBar progressBar() {
    return BaseDSL.v(ProgressBarFactoryFunc.getInstance());
  }

  public static ProgressBar progressBar(Anvil.Renderable r) {
    return BaseDSL.v(ProgressBarFactoryFunc.getInstance(), r);
  }

  public static QuickContactBadge quickContactBadge() {
    return BaseDSL.v(QuickContactBadgeFactoryFunc.getInstance());
  }

  public static QuickContactBadge quickContactBadge(Anvil.Renderable r) {
    return BaseDSL.v(QuickContactBadgeFactoryFunc.getInstance(), r);
  }

  public static RadioButton radioButton() {
    return BaseDSL.v(RadioButtonFactoryFunc.getInstance());
  }

  public static RadioButton radioButton(Anvil.Renderable r) {
    return BaseDSL.v(RadioButtonFactoryFunc.getInstance(), r);
  }

  public static RadioGroup radioGroup() {
    return BaseDSL.v(RadioGroupFactoryFunc.getInstance());
  }

  public static RadioGroup radioGroup(Anvil.Renderable r) {
    return BaseDSL.v(RadioGroupFactoryFunc.getInstance(), r);
  }

  public static RatingBar ratingBar() {
    return BaseDSL.v(RatingBarFactoryFunc.getInstance());
  }

  public static RatingBar ratingBar(Anvil.Renderable r) {
    return BaseDSL.v(RatingBarFactoryFunc.getInstance(), r);
  }

  public static RelativeLayout relativeLayout() {
    return BaseDSL.v(RelativeLayoutFactoryFunc.getInstance());
  }

  public static RelativeLayout relativeLayout(Anvil.Renderable r) {
    return BaseDSL.v(RelativeLayoutFactoryFunc.getInstance(), r);
  }

  public static ScrollView scrollView() {
    return BaseDSL.v(ScrollViewFactoryFunc.getInstance());
  }

  public static ScrollView scrollView(Anvil.Renderable r) {
    return BaseDSL.v(ScrollViewFactoryFunc.getInstance(), r);
  }

  public static SearchView searchView() {
    return BaseDSL.v(SearchViewFactoryFunc.getInstance());
  }

  public static SearchView searchView(Anvil.Renderable r) {
    return BaseDSL.v(SearchViewFactoryFunc.getInstance(), r);
  }

  public static SeekBar seekBar() {
    return BaseDSL.v(SeekBarFactoryFunc.getInstance());
  }

  public static SeekBar seekBar(Anvil.Renderable r) {
    return BaseDSL.v(SeekBarFactoryFunc.getInstance(), r);
  }

  public static Space space() {
    return BaseDSL.v(SpaceFactoryFunc.getInstance());
  }

  public static Space space(Anvil.Renderable r) {
    return BaseDSL.v(SpaceFactoryFunc.getInstance(), r);
  }

  public static Spinner spinner() {
    return BaseDSL.v(SpinnerFactoryFunc.getInstance());
  }

  public static Spinner spinner(Anvil.Renderable r) {
    return BaseDSL.v(SpinnerFactoryFunc.getInstance(), r);
  }

  public static StackView stackView() {
    return BaseDSL.v(StackViewFactoryFunc.getInstance());
  }

  public static StackView stackView(Anvil.Renderable r) {
    return BaseDSL.v(StackViewFactoryFunc.getInstance(), r);
  }

  public static Switch switchView() {
    return BaseDSL.v(SwitchFactoryFunc.getInstance());
  }

  public static Switch switchView(Anvil.Renderable r) {
    return BaseDSL.v(SwitchFactoryFunc.getInstance(), r);
  }

  public static TabHost tabHost() {
    return BaseDSL.v(TabHostFactoryFunc.getInstance());
  }

  public static TabHost tabHost(Anvil.Renderable r) {
    return BaseDSL.v(TabHostFactoryFunc.getInstance(), r);
  }

  public static TabWidget tabWidget() {
    return BaseDSL.v(TabWidgetFactoryFunc.getInstance());
  }

  public static TabWidget tabWidget(Anvil.Renderable r) {
    return BaseDSL.v(TabWidgetFactoryFunc.getInstance(), r);
  }

  public static TableLayout tableLayout() {
    return BaseDSL.v(TableLayoutFactoryFunc.getInstance());
  }

  public static TableLayout tableLayout(Anvil.Renderable r) {
    return BaseDSL.v(TableLayoutFactoryFunc.getInstance(), r);
  }

  public static TableRow tableRow() {
    return BaseDSL.v(TableRowFactoryFunc.getInstance());
  }

  public static TableRow tableRow(Anvil.Renderable r) {
    return BaseDSL.v(TableRowFactoryFunc.getInstance(), r);
  }

  public static TextClock textClock() {
    return BaseDSL.v(TextClockFactoryFunc.getInstance());
  }

  public static TextClock textClock(Anvil.Renderable r) {
    return BaseDSL.v(TextClockFactoryFunc.getInstance(), r);
  }

  public static TextSwitcher textSwitcher() {
    return BaseDSL.v(TextSwitcherFactoryFunc.getInstance());
  }

  public static TextSwitcher textSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(TextSwitcherFactoryFunc.getInstance(), r);
  }

  public static TextView textView() {
    return BaseDSL.v(TextViewFactoryFunc.getInstance());
  }

  public static TextView textView(Anvil.Renderable r) {
    return BaseDSL.v(TextViewFactoryFunc.getInstance(), r);
  }

  public static TimePicker timePicker() {
    return BaseDSL.v(TimePickerFactoryFunc.getInstance());
  }

  public static TimePicker timePicker(Anvil.Renderable r) {
    return BaseDSL.v(TimePickerFactoryFunc.getInstance(), r);
  }

  public static ToggleButton toggleButton() {
    return BaseDSL.v(ToggleButtonFactoryFunc.getInstance());
  }

  public static ToggleButton toggleButton(Anvil.Renderable r) {
    return BaseDSL.v(ToggleButtonFactoryFunc.getInstance(), r);
  }

  public static Toolbar toolbar() {
    return BaseDSL.v(ToolbarFactoryFunc.getInstance());
  }

  public static Toolbar toolbar(Anvil.Renderable r) {
    return BaseDSL.v(ToolbarFactoryFunc.getInstance(), r);
  }

  public static TwoLineListItem twoLineListItem() {
    return BaseDSL.v(TwoLineListItemFactoryFunc.getInstance());
  }

  public static TwoLineListItem twoLineListItem(Anvil.Renderable r) {
    return BaseDSL.v(TwoLineListItemFactoryFunc.getInstance(), r);
  }

  public static VideoView videoView() {
    return BaseDSL.v(VideoViewFactoryFunc.getInstance());
  }

  public static VideoView videoView(Anvil.Renderable r) {
    return BaseDSL.v(VideoViewFactoryFunc.getInstance(), r);
  }

  public static ViewAnimator viewAnimator() {
    return BaseDSL.v(ViewAnimatorFactoryFunc.getInstance());
  }

  public static ViewAnimator viewAnimator(Anvil.Renderable r) {
    return BaseDSL.v(ViewAnimatorFactoryFunc.getInstance(), r);
  }

  public static ViewFlipper viewFlipper() {
    return BaseDSL.v(ViewFlipperFactoryFunc.getInstance());
  }

  public static ViewFlipper viewFlipper(Anvil.Renderable r) {
    return BaseDSL.v(ViewFlipperFactoryFunc.getInstance(), r);
  }

  public static ViewSwitcher viewSwitcher() {
    return BaseDSL.v(ViewSwitcherFactoryFunc.getInstance());
  }

  public static ViewSwitcher viewSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(ViewSwitcherFactoryFunc.getInstance(), r);
  }

  public static ZoomButton zoomButton() {
    return BaseDSL.v(ZoomButtonFactoryFunc.getInstance());
  }

  public static ZoomButton zoomButton(Anvil.Renderable r) {
    return BaseDSL.v(ZoomButtonFactoryFunc.getInstance(), r);
  }

  public static ZoomControls zoomControls() {
    return BaseDSL.v(ZoomControlsFactoryFunc.getInstance());
  }

  public static ZoomControls zoomControls(Anvil.Renderable r) {
    return BaseDSL.v(ZoomControlsFactoryFunc.getInstance(), r);
  }

  public static Void accessibilityDelegate(View.AccessibilityDelegate arg) {
    return BaseDSL.attr(AccessibilityDelegateFuncf6d047d4.getInstance(), arg);
  }

  public static Void accessibilityLiveRegion(int arg) {
    return BaseDSL.attr(AccessibilityLiveRegionFunc8567756a.getInstance(), arg);
  }

  public static Void activated(boolean arg) {
    return BaseDSL.attr(ActivatedFunc148d6054.getInstance(), arg);
  }

  public static Void activity(Activity arg) {
    return BaseDSL.attr(ActivityFunccb86c57b.getInstance(), arg);
  }

  public static Void adapter(Adapter arg) {
    return BaseDSL.attr(AdapterFunc1b2776e4.getInstance(), arg);
  }

  public static Void adapter(ExpandableListAdapter arg) {
    return BaseDSL.attr(AdapterFunc9c589812.getInstance(), arg);
  }

  public static Void addStatesFromChildren(boolean arg) {
    return BaseDSL.attr(AddStatesFromChildrenFunc148d6054.getInstance(), arg);
  }

  public static Void adjustViewBounds(boolean arg) {
    return BaseDSL.attr(AdjustViewBoundsFunc148d6054.getInstance(), arg);
  }

  public static Void alignmentMode(int arg) {
    return BaseDSL.attr(AlignmentModeFunc8567756a.getInstance(), arg);
  }

  public static Void allCaps(boolean arg) {
    return BaseDSL.attr(AllCapsFunc148d6054.getInstance(), arg);
  }

  public static Void alpha(float arg) {
    return BaseDSL.attr(AlphaFunce0893188.getInstance(), arg);
  }

  public static Void alwaysDrawnWithCacheEnabled(boolean arg) {
    return BaseDSL.attr(AlwaysDrawnWithCacheEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void anchorView(View arg) {
    return BaseDSL.attr(AnchorViewFunc6c3617af.getInstance(), arg);
  }

  public static Void animateFirstView(boolean arg) {
    return BaseDSL.attr(AnimateFirstViewFunc148d6054.getInstance(), arg);
  }

  public static Void animation(Animation arg) {
    return BaseDSL.attr(AnimationFunc76cb7b50.getInstance(), arg);
  }

  public static Void animationCacheEnabled(boolean arg) {
    return BaseDSL.attr(AnimationCacheEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void animationDuration(int arg) {
    return BaseDSL.attr(AnimationDurationFunc8567756a.getInstance(), arg);
  }

  public static Void autoLinkMask(int arg) {
    return BaseDSL.attr(AutoLinkMaskFunc8567756a.getInstance(), arg);
  }

  public static Void autoStart(boolean arg) {
    return BaseDSL.attr(AutoStartFunc148d6054.getInstance(), arg);
  }

  public static Void background(Drawable arg) {
    return BaseDSL.attr(BackgroundFuncfb47464a.getInstance(), arg);
  }

  public static Void backgroundColor(int arg) {
    return BaseDSL.attr(BackgroundColorFunc8567756a.getInstance(), arg);
  }

  public static Void backgroundResource(int arg) {
    return BaseDSL.attr(BackgroundResourceFunc8567756a.getInstance(), arg);
  }

  public static Void backgroundTintList(ColorStateList arg) {
    return BaseDSL.attr(BackgroundTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void backgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(BackgroundTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void base(long arg) {
    return BaseDSL.attr(BaseFunc17c521d0.getInstance(), arg);
  }

  public static Void baseline(int arg) {
    return BaseDSL.attr(BaselineFunc8567756a.getInstance(), arg);
  }

  public static Void baselineAlignBottom(boolean arg) {
    return BaseDSL.attr(BaselineAlignBottomFunc148d6054.getInstance(), arg);
  }

  public static Void baselineAligned(boolean arg) {
    return BaseDSL.attr(BaselineAlignedFunc148d6054.getInstance(), arg);
  }

  public static Void baselineAlignedChildIndex(int arg) {
    return BaseDSL.attr(BaselineAlignedChildIndexFunc8567756a.getInstance(), arg);
  }

  public static Void bottom(int arg) {
    return BaseDSL.attr(BottomFunc8567756a.getInstance(), arg);
  }

  public static Void buttonDrawable(Drawable arg) {
    return BaseDSL.attr(ButtonDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void buttonDrawable(int arg) {
    return BaseDSL.attr(ButtonDrawableFunc8567756a.getInstance(), arg);
  }

  public static Void buttonTintList(ColorStateList arg) {
    return BaseDSL.attr(ButtonTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void buttonTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ButtonTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void cacheColorHint(int arg) {
    return BaseDSL.attr(CacheColorHintFunc8567756a.getInstance(), arg);
  }

  public static Void calendarViewShown(boolean arg) {
    return BaseDSL.attr(CalendarViewShownFunc148d6054.getInstance(), arg);
  }

  public static Void callback(TvView.TvInputCallback arg) {
    return BaseDSL.attr(CallbackFuncca7d3f09.getInstance(), arg);
  }

  public static Void callbackDuringFling(boolean arg) {
    return BaseDSL.attr(CallbackDuringFlingFunc148d6054.getInstance(), arg);
  }

  public static Void cameraDistance(float arg) {
    return BaseDSL.attr(CameraDistanceFunce0893188.getInstance(), arg);
  }

  public static Void captionEnabled(boolean arg) {
    return BaseDSL.attr(CaptionEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void checkMarkDrawable(Drawable arg) {
    return BaseDSL.attr(CheckMarkDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void checkMarkDrawable(int arg) {
    return BaseDSL.attr(CheckMarkDrawableFunc8567756a.getInstance(), arg);
  }

  public static Void checkMarkTintList(ColorStateList arg) {
    return BaseDSL.attr(CheckMarkTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void checkMarkTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(CheckMarkTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void checked(boolean arg) {
    return BaseDSL.attr(CheckedFunc148d6054.getInstance(), arg);
  }

  public static Void childDivider(Drawable arg) {
    return BaseDSL.attr(ChildDividerFuncfb47464a.getInstance(), arg);
  }

  public static Void childIndicator(Drawable arg) {
    return BaseDSL.attr(ChildIndicatorFuncfb47464a.getInstance(), arg);
  }

  public static Void choiceMode(int arg) {
    return BaseDSL.attr(ChoiceModeFunc8567756a.getInstance(), arg);
  }

  public static Void clickable(boolean arg) {
    return BaseDSL.attr(ClickableFunc148d6054.getInstance(), arg);
  }

  public static Void clipBounds(Rect arg) {
    return BaseDSL.attr(ClipBoundsFunc1cc93e48.getInstance(), arg);
  }

  public static Void clipChildren(boolean arg) {
    return BaseDSL.attr(ClipChildrenFunc148d6054.getInstance(), arg);
  }

  public static Void clipToOutline(boolean arg) {
    return BaseDSL.attr(ClipToOutlineFunc148d6054.getInstance(), arg);
  }

  public static Void clipToPadding(boolean arg) {
    return BaseDSL.attr(ClipToPaddingFunc148d6054.getInstance(), arg);
  }

  public static Void colorFilter(ColorFilter arg) {
    return BaseDSL.attr(ColorFilterFunc6bb7b3d7.getInstance(), arg);
  }

  public static Void colorFilter(int arg) {
    return BaseDSL.attr(ColorFilterFunc8567756a.getInstance(), arg);
  }

  public static Void columnCount(int arg) {
    return BaseDSL.attr(ColumnCountFunc8567756a.getInstance(), arg);
  }

  public static Void columnOrderPreserved(boolean arg) {
    return BaseDSL.attr(ColumnOrderPreservedFunc148d6054.getInstance(), arg);
  }

  public static Void columnWidth(int arg) {
    return BaseDSL.attr(ColumnWidthFunc8567756a.getInstance(), arg);
  }

  public static Void completionHint(CharSequence arg) {
    return BaseDSL.attr(CompletionHintFuncc0af808b.getInstance(), arg);
  }

  public static Void compoundDrawablePadding(int arg) {
    return BaseDSL.attr(CompoundDrawablePaddingFunc8567756a.getInstance(), arg);
  }

  public static Void contentDescription(CharSequence arg) {
    return BaseDSL.attr(ContentDescriptionFuncc0af808b.getInstance(), arg);
  }

  public static Void cropToPadding(boolean arg) {
    return BaseDSL.attr(CropToPaddingFunc148d6054.getInstance(), arg);
  }

  public static Void currentHour(Integer arg) {
    return BaseDSL.attr(CurrentHourFunc8567756a.getInstance(), arg);
  }

  public static Void currentMinute(Integer arg) {
    return BaseDSL.attr(CurrentMinuteFunc8567756a.getInstance(), arg);
  }

  public static Void currentTab(int arg) {
    return BaseDSL.attr(CurrentTabFunc8567756a.getInstance(), arg);
  }

  public static Void currentTabByTag(String arg) {
    return BaseDSL.attr(CurrentTabByTagFunc473e3665.getInstance(), arg);
  }

  public static Void currentText(CharSequence arg) {
    return BaseDSL.attr(CurrentTextFuncc0af808b.getInstance(), arg);
  }

  public static Void cursorVisible(boolean arg) {
    return BaseDSL.attr(CursorVisibleFunc148d6054.getInstance(), arg);
  }

  public static Void customSelectionActionModeCallback(ActionMode.Callback arg) {
    return BaseDSL.attr(CustomSelectionActionModeCallbackFunc57558b70.getInstance(), arg);
  }

  public static Void date(long arg) {
    return BaseDSL.attr(DateFunc17c521d0.getInstance(), arg);
  }

  public static Void dateTextAppearance(int arg) {
    return BaseDSL.attr(DateTextAppearanceFunc8567756a.getInstance(), arg);
  }

  public static Void debugFlags(int arg) {
    return BaseDSL.attr(DebugFlagsFunc8567756a.getInstance(), arg);
  }

  public static Void descendantFocusability(int arg) {
    return BaseDSL.attr(DescendantFocusabilityFunc8567756a.getInstance(), arg);
  }

  public static Void digitsWatcher(TextWatcher arg) {
    return BaseDSL.attr(DigitsWatcherFuncb32320d.getInstance(), arg);
  }

  public static Void displayedChild(int arg) {
    return BaseDSL.attr(DisplayedChildFunc8567756a.getInstance(), arg);
  }

  public static Void displayedValues(String[] arg) {
    return BaseDSL.attr(DisplayedValuesFunc708a3c87.getInstance(), arg);
  }

  public static Void divider(Drawable arg) {
    return BaseDSL.attr(DividerFuncfb47464a.getInstance(), arg);
  }

  public static Void dividerDrawable(Drawable arg) {
    return BaseDSL.attr(DividerDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void dividerDrawable(int arg) {
    return BaseDSL.attr(DividerDrawableFunc8567756a.getInstance(), arg);
  }

  public static Void dividerHeight(int arg) {
    return BaseDSL.attr(DividerHeightFunc8567756a.getInstance(), arg);
  }

  public static Void dividerPadding(int arg) {
    return BaseDSL.attr(DividerPaddingFunc8567756a.getInstance(), arg);
  }

  public static Void downloadListener(DownloadListener arg) {
    return BaseDSL.attr(DownloadListenerFunc34ae5869.getInstance(), arg);
  }

  public static Void drawSelectorOnTop(boolean arg) {
    return BaseDSL.attr(DrawSelectorOnTopFunc148d6054.getInstance(), arg);
  }

  public static Void drawingCacheBackgroundColor(int arg) {
    return BaseDSL.attr(DrawingCacheBackgroundColorFunc8567756a.getInstance(), arg);
  }

  public static Void drawingCacheEnabled(boolean arg) {
    return BaseDSL.attr(DrawingCacheEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void drawingCacheQuality(int arg) {
    return BaseDSL.attr(DrawingCacheQualityFunc8567756a.getInstance(), arg);
  }

  public static Void dropDownAnchor(int arg) {
    return BaseDSL.attr(DropDownAnchorFunc8567756a.getInstance(), arg);
  }

  public static Void dropDownBackgroundDrawable(Drawable arg) {
    return BaseDSL.attr(DropDownBackgroundDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void dropDownBackgroundResource(int arg) {
    return BaseDSL.attr(DropDownBackgroundResourceFunc8567756a.getInstance(), arg);
  }

  public static Void dropDownHeight(int arg) {
    return BaseDSL.attr(DropDownHeightFunc8567756a.getInstance(), arg);
  }

  public static Void dropDownHorizontalOffset(int arg) {
    return BaseDSL.attr(DropDownHorizontalOffsetFunc8567756a.getInstance(), arg);
  }

  public static Void dropDownVerticalOffset(int arg) {
    return BaseDSL.attr(DropDownVerticalOffsetFunc8567756a.getInstance(), arg);
  }

  public static Void dropDownWidth(int arg) {
    return BaseDSL.attr(DropDownWidthFunc8567756a.getInstance(), arg);
  }

  public static Void duplicateParentStateEnabled(boolean arg) {
    return BaseDSL.attr(DuplicateParentStateEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void eGLConfigChooser(GLSurfaceView.EGLConfigChooser arg) {
    return BaseDSL.attr(EGLConfigChooserFuncb283fdb0.getInstance(), arg);
  }

  public static Void eGLConfigChooser(boolean arg) {
    return BaseDSL.attr(EGLConfigChooserFunc148d6054.getInstance(), arg);
  }

  public static Void eGLContextClientVersion(int arg) {
    return BaseDSL.attr(EGLContextClientVersionFunc8567756a.getInstance(), arg);
  }

  public static Void eGLContextFactory(GLSurfaceView.EGLContextFactory arg) {
    return BaseDSL.attr(EGLContextFactoryFunc8cdc7924.getInstance(), arg);
  }

  public static Void eGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory arg) {
    return BaseDSL.attr(EGLWindowSurfaceFactoryFunc204911b6.getInstance(), arg);
  }

  public static Void editableFactory(Editable.Factory arg) {
    return BaseDSL.attr(EditableFactoryFunc1efa17e2.getInstance(), arg);
  }

  public static Void elegantTextHeight(boolean arg) {
    return BaseDSL.attr(ElegantTextHeightFunc148d6054.getInstance(), arg);
  }

  public static Void elevation(float arg) {
    return BaseDSL.attr(ElevationFunce0893188.getInstance(), arg);
  }

  public static Void ellipsize(TextUtils.TruncateAt arg) {
    return BaseDSL.attr(EllipsizeFunc63cb4885.getInstance(), arg);
  }

  public static Void emptyView(View arg) {
    return BaseDSL.attr(EmptyViewFunc6c3617af.getInstance(), arg);
  }

  public static Void ems(int arg) {
    return BaseDSL.attr(EmsFunc8567756a.getInstance(), arg);
  }

  public static Void enabled(boolean arg) {
    return BaseDSL.attr(EnabledFunc148d6054.getInstance(), arg);
  }

  public static Void error(CharSequence arg) {
    return BaseDSL.attr(ErrorFuncc0af808b.getInstance(), arg);
  }

  public static Void eventsInterceptionEnabled(boolean arg) {
    return BaseDSL.attr(EventsInterceptionEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void excludeMimes(String[] arg) {
    return BaseDSL.attr(ExcludeMimesFunc708a3c87.getInstance(), arg);
  }

  public static Void extendedSettingsClickListener(View.OnClickListener arg) {
    return BaseDSL.attr(ExtendedSettingsClickListenerFunc79a13a5e.getInstance(), arg);
  }

  public static Void extractedText(ExtractedText arg) {
    return BaseDSL.attr(ExtractedTextFunc410b6fe0.getInstance(), arg);
  }

  public static Void factory(ViewSwitcher.ViewFactory arg) {
    return BaseDSL.attr(FactoryFunc6a48ea48.getInstance(), arg);
  }

  public static Void fadeEnabled(boolean arg) {
    return BaseDSL.attr(FadeEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void fadeOffset(long arg) {
    return BaseDSL.attr(FadeOffsetFunc17c521d0.getInstance(), arg);
  }

  public static Void fadingEdgeLength(int arg) {
    return BaseDSL.attr(FadingEdgeLengthFunc8567756a.getInstance(), arg);
  }

  public static Void fastScrollAlwaysVisible(boolean arg) {
    return BaseDSL.attr(FastScrollAlwaysVisibleFunc148d6054.getInstance(), arg);
  }

  public static Void fastScrollEnabled(boolean arg) {
    return BaseDSL.attr(FastScrollEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void fastScrollStyle(int arg) {
    return BaseDSL.attr(FastScrollStyleFunc8567756a.getInstance(), arg);
  }

  public static Void fillViewport(boolean arg) {
    return BaseDSL.attr(FillViewportFunc148d6054.getInstance(), arg);
  }

  public static Void filterText(String arg) {
    return BaseDSL.attr(FilterTextFunc473e3665.getInstance(), arg);
  }

  public static Void filterTouchesWhenObscured(boolean arg) {
    return BaseDSL.attr(FilterTouchesWhenObscuredFunc148d6054.getInstance(), arg);
  }

  public static Void filterWatcher(TextWatcher arg) {
    return BaseDSL.attr(FilterWatcherFuncb32320d.getInstance(), arg);
  }

  public static Void filters(InputFilter[] arg) {
    return BaseDSL.attr(FiltersFuncfb505582.getInstance(), arg);
  }

  public static Void findListener(WebView.FindListener arg) {
    return BaseDSL.attr(FindListenerFunc28f7f5ef.getInstance(), arg);
  }

  public static Void firstDayOfWeek(int arg) {
    return BaseDSL.attr(FirstDayOfWeekFunc8567756a.getInstance(), arg);
  }

  public static Void fitsSystemWindows(boolean arg) {
    return BaseDSL.attr(FitsSystemWindowsFunc148d6054.getInstance(), arg);
  }

  public static Void flipInterval(int arg) {
    return BaseDSL.attr(FlipIntervalFunc8567756a.getInstance(), arg);
  }

  public static Void focusable(boolean arg) {
    return BaseDSL.attr(FocusableFunc148d6054.getInstance(), arg);
  }

  public static Void focusableInTouchMode(boolean arg) {
    return BaseDSL.attr(FocusableInTouchModeFunc148d6054.getInstance(), arg);
  }

  public static Void focusedMonthDateColor(int arg) {
    return BaseDSL.attr(FocusedMonthDateColorFunc8567756a.getInstance(), arg);
  }

  public static Void fontFeatureSettings(String arg) {
    return BaseDSL.attr(FontFeatureSettingsFunc473e3665.getInstance(), arg);
  }

  public static Void footerDividersEnabled(boolean arg) {
    return BaseDSL.attr(FooterDividersEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void foreground(Drawable arg) {
    return BaseDSL.attr(ForegroundFuncfb47464a.getInstance(), arg);
  }

  public static Void foregroundGravity(int arg) {
    return BaseDSL.attr(ForegroundGravityFunc8567756a.getInstance(), arg);
  }

  public static Void foregroundTintList(ColorStateList arg) {
    return BaseDSL.attr(ForegroundTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void foregroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ForegroundTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void format(String arg) {
    return BaseDSL.attr(FormatFunc473e3665.getInstance(), arg);
  }

  public static Void format12Hour(CharSequence arg) {
    return BaseDSL.attr(Format12HourFuncc0af808b.getInstance(), arg);
  }

  public static Void format24Hour(CharSequence arg) {
    return BaseDSL.attr(Format24HourFuncc0af808b.getInstance(), arg);
  }

  public static Void formatter(NumberPicker.Formatter arg) {
    return BaseDSL.attr(FormatterFunc5e27b07e.getInstance(), arg);
  }

  public static Void freezesText(boolean arg) {
    return BaseDSL.attr(FreezesTextFunc148d6054.getInstance(), arg);
  }

  public static Void friction(float arg) {
    return BaseDSL.attr(FrictionFunce0893188.getInstance(), arg);
  }

  public static Void gLWrapper(GLSurfaceView.GLWrapper arg) {
    return BaseDSL.attr(GLWrapperFunc9520092d.getInstance(), arg);
  }

  public static Void gesture(Gesture arg) {
    return BaseDSL.attr(GestureFunc15eb6005.getInstance(), arg);
  }

  public static Void gestureColor(int arg) {
    return BaseDSL.attr(GestureColorFunc8567756a.getInstance(), arg);
  }

  public static Void gestureStrokeAngleThreshold(float arg) {
    return BaseDSL.attr(GestureStrokeAngleThresholdFunce0893188.getInstance(), arg);
  }

  public static Void gestureStrokeLengthThreshold(float arg) {
    return BaseDSL.attr(GestureStrokeLengthThresholdFunce0893188.getInstance(), arg);
  }

  public static Void gestureStrokeSquarenessTreshold(float arg) {
    return BaseDSL.attr(GestureStrokeSquarenessTresholdFunce0893188.getInstance(), arg);
  }

  public static Void gestureStrokeType(int arg) {
    return BaseDSL.attr(GestureStrokeTypeFunc8567756a.getInstance(), arg);
  }

  public static Void gestureStrokeWidth(float arg) {
    return BaseDSL.attr(GestureStrokeWidthFunce0893188.getInstance(), arg);
  }

  public static Void gestureVisible(boolean arg) {
    return BaseDSL.attr(GestureVisibleFunc148d6054.getInstance(), arg);
  }

  public static Void gravity(int arg) {
    return BaseDSL.attr(GravityFunc8567756a.getInstance(), arg);
  }

  public static Void groupIndicator(Drawable arg) {
    return BaseDSL.attr(GroupIndicatorFuncfb47464a.getInstance(), arg);
  }

  public static Void hapticFeedbackEnabled(boolean arg) {
    return BaseDSL.attr(HapticFeedbackEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void hasTransientState(boolean arg) {
    return BaseDSL.attr(HasTransientStateFunc148d6054.getInstance(), arg);
  }

  public static Void headerDividersEnabled(boolean arg) {
    return BaseDSL.attr(HeaderDividersEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void height(int arg) {
    return BaseDSL.attr(HeightFunc8567756a.getInstance(), arg);
  }

  public static Void highlightColor(int arg) {
    return BaseDSL.attr(HighlightColorFunc8567756a.getInstance(), arg);
  }

  public static Void hint(int arg) {
    return BaseDSL.attr(HintFunc8567756a.getInstance(), arg);
  }

  public static Void hint(CharSequence arg) {
    return BaseDSL.attr(HintFuncc0af808b.getInstance(), arg);
  }

  public static Void hintTextColor(ColorStateList arg) {
    return BaseDSL.attr(HintTextColorFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void hintTextColor(int arg) {
    return BaseDSL.attr(HintTextColorFunc8567756a.getInstance(), arg);
  }

  public static Void horizontalFadingEdgeEnabled(boolean arg) {
    return BaseDSL.attr(HorizontalFadingEdgeEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void horizontalGravity(int arg) {
    return BaseDSL.attr(HorizontalGravityFunc8567756a.getInstance(), arg);
  }

  public static Void horizontalScrollBarEnabled(boolean arg) {
    return BaseDSL.attr(HorizontalScrollBarEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void horizontalScrollbarOverlay(boolean arg) {
    return BaseDSL.attr(HorizontalScrollbarOverlayFunc148d6054.getInstance(), arg);
  }

  public static Void horizontalSpacing(int arg) {
    return BaseDSL.attr(HorizontalSpacingFunc8567756a.getInstance(), arg);
  }

  public static Void horizontallyScrolling(boolean arg) {
    return BaseDSL.attr(HorizontallyScrollingFunc148d6054.getInstance(), arg);
  }

  public static Void hovered(boolean arg) {
    return BaseDSL.attr(HoveredFunc148d6054.getInstance(), arg);
  }

  public static Void iconified(boolean arg) {
    return BaseDSL.attr(IconifiedFunc148d6054.getInstance(), arg);
  }

  public static Void iconifiedByDefault(boolean arg) {
    return BaseDSL.attr(IconifiedByDefaultFunc148d6054.getInstance(), arg);
  }

  public static Void id(int arg) {
    return BaseDSL.attr(IdFunc8567756a.getInstance(), arg);
  }

  public static Void ignoreGravity(int arg) {
    return BaseDSL.attr(IgnoreGravityFunc8567756a.getInstance(), arg);
  }

  public static Void imageAlpha(int arg) {
    return BaseDSL.attr(ImageAlphaFunc8567756a.getInstance(), arg);
  }

  public static Void imageBitmap(Bitmap arg) {
    return BaseDSL.attr(ImageBitmapFuncf4654c93.getInstance(), arg);
  }

  public static Void imageDrawable(Drawable arg) {
    return BaseDSL.attr(ImageDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void imageLevel(int arg) {
    return BaseDSL.attr(ImageLevelFunc8567756a.getInstance(), arg);
  }

  public static Void imageMatrix(Matrix arg) {
    return BaseDSL.attr(ImageMatrixFunc6b9f325.getInstance(), arg);
  }

  public static Void imageResource(int arg) {
    return BaseDSL.attr(ImageResourceFunc8567756a.getInstance(), arg);
  }

  public static Void imageTintList(ColorStateList arg) {
    return BaseDSL.attr(ImageTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void imageTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ImageTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void imageURI(Uri arg) {
    return BaseDSL.attr(ImageURIFunc75f430fc.getInstance(), arg);
  }

  public static Void imeOptions(int arg) {
    return BaseDSL.attr(ImeOptionsFunc8567756a.getInstance(), arg);
  }

  public static Void importantForAccessibility(int arg) {
    return BaseDSL.attr(ImportantForAccessibilityFunc8567756a.getInstance(), arg);
  }

  public static Void inAnimation(ObjectAnimator arg) {
    return BaseDSL.attr(InAnimationFunc9a08bdaf.getInstance(), arg);
  }

  public static Void inAnimation(Animation arg) {
    return BaseDSL.attr(InAnimationFunc76cb7b50.getInstance(), arg);
  }

  public static Void includeFontPadding(boolean arg) {
    return BaseDSL.attr(IncludeFontPaddingFunc148d6054.getInstance(), arg);
  }

  public static Void indeterminate(boolean arg) {
    return BaseDSL.attr(IndeterminateFunc148d6054.getInstance(), arg);
  }

  public static Void indeterminateDrawable(Drawable arg) {
    return BaseDSL.attr(IndeterminateDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void indeterminateDrawableTiled(Drawable arg) {
    return BaseDSL.attr(IndeterminateDrawableTiledFuncfb47464a.getInstance(), arg);
  }

  public static Void indeterminateTintList(ColorStateList arg) {
    return BaseDSL.attr(IndeterminateTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void indeterminateTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(IndeterminateTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void inflatedId(int arg) {
    return BaseDSL.attr(InflatedIdFunc8567756a.getInstance(), arg);
  }

  public static Void initialScale(int arg) {
    return BaseDSL.attr(InitialScaleFunc8567756a.getInstance(), arg);
  }

  public static Void inputExtras(int arg) {
    return BaseDSL.attr(InputExtrasFunc8567756a.getInstance(), arg);
  }

  public static Void inputType(int arg) {
    return BaseDSL.attr(InputTypeFunc8567756a.getInstance(), arg);
  }

  public static Void interpolator(Interpolator arg) {
    return BaseDSL.attr(InterpolatorFunc805e457b.getInstance(), arg);
  }

  public static Void is24HourView(Boolean arg) {
    return BaseDSL.attr(Is24HourViewFunc148d6054.getInstance(), arg);
  }

  public static Void isIndicator(boolean arg) {
    return BaseDSL.attr(IsIndicatorFunc148d6054.getInstance(), arg);
  }

  public static Void isZoomInEnabled(boolean arg) {
    return BaseDSL.attr(IsZoomInEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void isZoomOutEnabled(boolean arg) {
    return BaseDSL.attr(IsZoomOutEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void itemsCanFocus(boolean arg) {
    return BaseDSL.attr(ItemsCanFocusFunc148d6054.getInstance(), arg);
  }

  public static Void keepScreenOn(boolean arg) {
    return BaseDSL.attr(KeepScreenOnFunc148d6054.getInstance(), arg);
  }

  public static Void keyListener(KeyListener arg) {
    return BaseDSL.attr(KeyListenerFuncc20cfe68.getInstance(), arg);
  }

  public static Void keyProgressIncrement(int arg) {
    return BaseDSL.attr(KeyProgressIncrementFunc8567756a.getInstance(), arg);
  }

  public static Void keyboard(Keyboard arg) {
    return BaseDSL.attr(KeyboardFunc68284f4c.getInstance(), arg);
  }

  public static Void labelFor(int arg) {
    return BaseDSL.attr(LabelForFunc8567756a.getInstance(), arg);
  }

  public static Void layerPaint(Paint arg) {
    return BaseDSL.attr(LayerPaintFunc7c40a07a.getInstance(), arg);
  }

  public static Void layoutAnimation(LayoutAnimationController arg) {
    return BaseDSL.attr(LayoutAnimationFunc97b72682.getInstance(), arg);
  }

  public static Void layoutAnimationListener(Animation.AnimationListener arg) {
    return BaseDSL.attr(LayoutAnimationListenerFunc3ffca91a.getInstance(), arg);
  }

  public static Void layoutDirection(int arg) {
    return BaseDSL.attr(LayoutDirectionFunc8567756a.getInstance(), arg);
  }

  public static Void layoutInflater(LayoutInflater arg) {
    return BaseDSL.attr(LayoutInflaterFunc3f91d1f.getInstance(), arg);
  }

  public static Void layoutMode(int arg) {
    return BaseDSL.attr(LayoutModeFunc8567756a.getInstance(), arg);
  }

  public static Void layoutParams(ViewGroup.LayoutParams arg) {
    return BaseDSL.attr(LayoutParamsFunc613f8e8e.getInstance(), arg);
  }

  public static Void layoutResource(int arg) {
    return BaseDSL.attr(LayoutResourceFunc8567756a.getInstance(), arg);
  }

  public static Void layoutTransition(LayoutTransition arg) {
    return BaseDSL.attr(LayoutTransitionFuncda5a1c48.getInstance(), arg);
  }

  public static Void left(int arg) {
    return BaseDSL.attr(LeftFunc8567756a.getInstance(), arg);
  }

  public static Void leftStripDrawable(Drawable arg) {
    return BaseDSL.attr(LeftStripDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void leftStripDrawable(int arg) {
    return BaseDSL.attr(LeftStripDrawableFunc8567756a.getInstance(), arg);
  }

  public static Void letterSpacing(float arg) {
    return BaseDSL.attr(LetterSpacingFunce0893188.getInstance(), arg);
  }

  public static Void lettersWatcher(TextWatcher arg) {
    return BaseDSL.attr(LettersWatcherFuncb32320d.getInstance(), arg);
  }

  public static Void lines(int arg) {
    return BaseDSL.attr(LinesFunc8567756a.getInstance(), arg);
  }

  public static Void linkTextColor(ColorStateList arg) {
    return BaseDSL.attr(LinkTextColorFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void linkTextColor(int arg) {
    return BaseDSL.attr(LinkTextColorFunc8567756a.getInstance(), arg);
  }

  public static Void linksClickable(boolean arg) {
    return BaseDSL.attr(LinksClickableFunc148d6054.getInstance(), arg);
  }

  public static Void listSelection(int arg) {
    return BaseDSL.attr(ListSelectionFunc8567756a.getInstance(), arg);
  }

  public static Void logo(Drawable arg) {
    return BaseDSL.attr(LogoFuncfb47464a.getInstance(), arg);
  }

  public static Void logo(int arg) {
    return BaseDSL.attr(LogoFunc8567756a.getInstance(), arg);
  }

  public static Void logoDescription(int arg) {
    return BaseDSL.attr(LogoDescriptionFunc8567756a.getInstance(), arg);
  }

  public static Void logoDescription(CharSequence arg) {
    return BaseDSL.attr(LogoDescriptionFuncc0af808b.getInstance(), arg);
  }

  public static Void longClickable(boolean arg) {
    return BaseDSL.attr(LongClickableFunc148d6054.getInstance(), arg);
  }

  public static Void marqueeRepeatLimit(int arg) {
    return BaseDSL.attr(MarqueeRepeatLimitFunc8567756a.getInstance(), arg);
  }

  public static Void max(int arg) {
    return BaseDSL.attr(MaxFunc8567756a.getInstance(), arg);
  }

  public static Void maxDate(long arg) {
    return BaseDSL.attr(MaxDateFunc17c521d0.getInstance(), arg);
  }

  public static Void maxEms(int arg) {
    return BaseDSL.attr(MaxEmsFunc8567756a.getInstance(), arg);
  }

  public static Void maxHeight(int arg) {
    return BaseDSL.attr(MaxHeightFunc8567756a.getInstance(), arg);
  }

  public static Void maxLines(int arg) {
    return BaseDSL.attr(MaxLinesFunc8567756a.getInstance(), arg);
  }

  public static Void maxValue(int arg) {
    return BaseDSL.attr(MaxValueFunc8567756a.getInstance(), arg);
  }

  public static Void maxVisible(int arg) {
    return BaseDSL.attr(MaxVisibleFunc8567756a.getInstance(), arg);
  }

  public static Void maxWidth(int arg) {
    return BaseDSL.attr(MaxWidthFunc8567756a.getInstance(), arg);
  }

  public static Void measureAllChildren(boolean arg) {
    return BaseDSL.attr(MeasureAllChildrenFunc148d6054.getInstance(), arg);
  }

  public static Void measureWithLargestChildEnabled(boolean arg) {
    return BaseDSL.attr(MeasureWithLargestChildEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void mediaController(MediaController arg) {
    return BaseDSL.attr(MediaControllerFunc727c9135.getInstance(), arg);
  }

  public static Void mediaPlayer(MediaController.MediaPlayerControl arg) {
    return BaseDSL.attr(MediaPlayerFunc3deec331.getInstance(), arg);
  }

  public static Void minDate(long arg) {
    return BaseDSL.attr(MinDateFunc17c521d0.getInstance(), arg);
  }

  public static Void minEms(int arg) {
    return BaseDSL.attr(MinEmsFunc8567756a.getInstance(), arg);
  }

  public static Void minHeight(int arg) {
    return BaseDSL.attr(MinHeightFunc8567756a.getInstance(), arg);
  }

  public static Void minLines(int arg) {
    return BaseDSL.attr(MinLinesFunc8567756a.getInstance(), arg);
  }

  public static Void minValue(int arg) {
    return BaseDSL.attr(MinValueFunc8567756a.getInstance(), arg);
  }

  public static Void minWidth(int arg) {
    return BaseDSL.attr(MinWidthFunc8567756a.getInstance(), arg);
  }

  public static Void minimumHeight(int arg) {
    return BaseDSL.attr(MinimumHeightFunc8567756a.getInstance(), arg);
  }

  public static Void minimumWidth(int arg) {
    return BaseDSL.attr(MinimumWidthFunc8567756a.getInstance(), arg);
  }

  public static Void mode(int arg) {
    return BaseDSL.attr(ModeFunc8567756a.getInstance(), arg);
  }

  public static Void motionEventSplittingEnabled(boolean arg) {
    return BaseDSL.attr(MotionEventSplittingEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void movementMethod(MovementMethod arg) {
    return BaseDSL.attr(MovementMethodFunc9584901b.getInstance(), arg);
  }

  public static Void multiChoiceModeListener(AbsListView.MultiChoiceModeListener arg) {
    return BaseDSL.attr(MultiChoiceModeListenerFunc74531ecd.getInstance(), arg);
  }

  public static Void navigationContentDescription(int arg) {
    return BaseDSL.attr(NavigationContentDescriptionFunc8567756a.getInstance(), arg);
  }

  public static Void navigationContentDescription(CharSequence arg) {
    return BaseDSL.attr(NavigationContentDescriptionFuncc0af808b.getInstance(), arg);
  }

  public static Void navigationIcon(Drawable arg) {
    return BaseDSL.attr(NavigationIconFuncfb47464a.getInstance(), arg);
  }

  public static Void navigationIcon(int arg) {
    return BaseDSL.attr(NavigationIconFunc8567756a.getInstance(), arg);
  }

  public static Void navigationOnClickListener(View.OnClickListener arg) {
    return BaseDSL.attr(NavigationOnClickListenerFunc79a13a5e.getInstance(), arg);
  }

  public static Void nestedScrollingEnabled(boolean arg) {
    return BaseDSL.attr(NestedScrollingEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void networkAvailable(boolean arg) {
    return BaseDSL.attr(NetworkAvailableFunc148d6054.getInstance(), arg);
  }

  public static Void nextFocusDownId(int arg) {
    return BaseDSL.attr(NextFocusDownIdFunc8567756a.getInstance(), arg);
  }

  public static Void nextFocusForwardId(int arg) {
    return BaseDSL.attr(NextFocusForwardIdFunc8567756a.getInstance(), arg);
  }

  public static Void nextFocusLeftId(int arg) {
    return BaseDSL.attr(NextFocusLeftIdFunc8567756a.getInstance(), arg);
  }

  public static Void nextFocusRightId(int arg) {
    return BaseDSL.attr(NextFocusRightIdFunc8567756a.getInstance(), arg);
  }

  public static Void nextFocusUpId(int arg) {
    return BaseDSL.attr(NextFocusUpIdFunc8567756a.getInstance(), arg);
  }

  public static Void numColumns(int arg) {
    return BaseDSL.attr(NumColumnsFunc8567756a.getInstance(), arg);
  }

  public static Void numStars(int arg) {
    return BaseDSL.attr(NumStarsFunc8567756a.getInstance(), arg);
  }

  public static Void onApplyWindowInsets(View.OnApplyWindowInsetsListener arg) {
    return BaseDSL.attr(OnApplyWindowInsetsFunc1d84af6a.getInstance(), arg);
  }

  public static Void onBreadCrumbClick(FragmentBreadCrumbs.OnBreadCrumbClickListener arg) {
    return BaseDSL.attr(OnBreadCrumbClickFunc9216bf60.getInstance(), arg);
  }

  public static Void onCheckedChange(CompoundButton.OnCheckedChangeListener arg) {
    return BaseDSL.attr(OnCheckedChangeFunca7ec32e6.getInstance(), arg);
  }

  public static Void onCheckedChange(RadioGroup.OnCheckedChangeListener arg) {
    return BaseDSL.attr(OnCheckedChangeFunc9ce6f1ed.getInstance(), arg);
  }

  public static Void onChildClick(ExpandableListView.OnChildClickListener arg) {
    return BaseDSL.attr(OnChildClickFunc41bf08ab.getInstance(), arg);
  }

  public static Void onChronometerTick(Chronometer.OnChronometerTickListener arg) {
    return BaseDSL.attr(OnChronometerTickFunc314a7a05.getInstance(), arg);
  }

  public static Void onClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnClickFunc79a13a5e.getInstance(), arg);
  }

  public static Void onClose(SearchView.OnCloseListener arg) {
    return BaseDSL.attr(OnCloseFunc2f96a1d7.getInstance(), arg);
  }

  public static Void onCompletion(MediaPlayer.OnCompletionListener arg) {
    return BaseDSL.attr(OnCompletionFunc118298c1.getInstance(), arg);
  }

  public static Void onCreateContextMenu(View.OnCreateContextMenuListener arg) {
    return BaseDSL.attr(OnCreateContextMenuFunc657678e8.getInstance(), arg);
  }

  public static Void onDateChange(CalendarView.OnDateChangeListener arg) {
    return BaseDSL.attr(OnDateChangeFuncd43c4991.getInstance(), arg);
  }

  public static Void onDismiss(AutoCompleteTextView.OnDismissListener arg) {
    return BaseDSL.attr(OnDismissFuncfea72fd6.getInstance(), arg);
  }

  public static Void onDrag(View.OnDragListener arg) {
    return BaseDSL.attr(OnDragFunc685605c6.getInstance(), arg);
  }

  public static Void onDrawerClose(SlidingDrawer.OnDrawerCloseListener arg) {
    return BaseDSL.attr(OnDrawerCloseFunc2c932b02.getInstance(), arg);
  }

  public static Void onDrawerOpen(SlidingDrawer.OnDrawerOpenListener arg) {
    return BaseDSL.attr(OnDrawerOpenFuncbff66a28.getInstance(), arg);
  }

  public static Void onDrawerScroll(SlidingDrawer.OnDrawerScrollListener arg) {
    return BaseDSL.attr(OnDrawerScrollFunc44bfdd2b.getInstance(), arg);
  }

  public static Void onEditorAction(TextView.OnEditorActionListener arg) {
    return BaseDSL.attr(OnEditorActionFuncb9b05d07.getInstance(), arg);
  }

  public static Void onError(MediaPlayer.OnErrorListener arg) {
    return BaseDSL.attr(OnErrorFunc19f5c42b.getInstance(), arg);
  }

  public static Void onFocusChange(View.OnFocusChangeListener arg) {
    return BaseDSL.attr(OnFocusChangeFunca56a1dfe.getInstance(), arg);
  }

  public static Void onGenericMotion(View.OnGenericMotionListener arg) {
    return BaseDSL.attr(OnGenericMotionFunc35b75643.getInstance(), arg);
  }

  public static Void onGroupClick(ExpandableListView.OnGroupClickListener arg) {
    return BaseDSL.attr(OnGroupClickFunc8330a028.getInstance(), arg);
  }

  public static Void onGroupCollapse(ExpandableListView.OnGroupCollapseListener arg) {
    return BaseDSL.attr(OnGroupCollapseFunc817eb235.getInstance(), arg);
  }

  public static Void onGroupExpand(ExpandableListView.OnGroupExpandListener arg) {
    return BaseDSL.attr(OnGroupExpandFunccdb64d22.getInstance(), arg);
  }

  public static Void onHierarchyChange(ViewGroup.OnHierarchyChangeListener arg) {
    return BaseDSL.attr(OnHierarchyChangeFunc7b5dc8bc.getInstance(), arg);
  }

  public static Void onHover(View.OnHoverListener arg) {
    return BaseDSL.attr(OnHoverFuncbf544a12.getInstance(), arg);
  }

  public static Void onInflate(ViewStub.OnInflateListener arg) {
    return BaseDSL.attr(OnInflateFuncdd97752b.getInstance(), arg);
  }

  public static Void onInfo(MediaPlayer.OnInfoListener arg) {
    return BaseDSL.attr(OnInfoFuncfc58c853.getInstance(), arg);
  }

  public static Void onItemClick(AdapterView.OnItemClickListener arg) {
    return BaseDSL.attr(OnItemClickFuncbe673005.getInstance(), arg);
  }

  public static Void onItemLongClick(AdapterView.OnItemLongClickListener arg) {
    return BaseDSL.attr(OnItemLongClickFuncbc740669.getInstance(), arg);
  }

  public static Void onItemSelected(AdapterView.OnItemSelectedListener arg) {
    return BaseDSL.attr(OnItemSelectedFuncb7923a26.getInstance(), arg);
  }

  public static Void onKey(View.OnKeyListener arg) {
    return BaseDSL.attr(OnKeyFunce04764b5.getInstance(), arg);
  }

  public static Void onKeyboardAction(KeyboardView.OnKeyboardActionListener arg) {
    return BaseDSL.attr(OnKeyboardActionFunc754370ed.getInstance(), arg);
  }

  public static Void onLongClick(View.OnLongClickListener arg) {
    return BaseDSL.attr(OnLongClickFuncdc7f3c42.getInstance(), arg);
  }

  public static Void onLongPressUpdateInterval(long arg) {
    return BaseDSL.attr(OnLongPressUpdateIntervalFunc17c521d0.getInstance(), arg);
  }

  public static Void onMenuItemClick(ActionMenuView.OnMenuItemClickListener arg) {
    return BaseDSL.attr(OnMenuItemClickFuncc8271282.getInstance(), arg);
  }

  public static Void onMenuItemClick(Toolbar.OnMenuItemClickListener arg) {
    return BaseDSL.attr(OnMenuItemClickFunc8ed2cccd.getInstance(), arg);
  }

  public static Void onPrepared(MediaPlayer.OnPreparedListener arg) {
    return BaseDSL.attr(OnPreparedFuncde5b2862.getInstance(), arg);
  }

  public static Void onQueryText(SearchView.OnQueryTextListener arg) {
    return BaseDSL.attr(OnQueryTextFunc8c880774.getInstance(), arg);
  }

  public static Void onQueryTextFocusChange(View.OnFocusChangeListener arg) {
    return BaseDSL.attr(OnQueryTextFocusChangeFunca56a1dfe.getInstance(), arg);
  }

  public static Void onRatingBarChange(RatingBar.OnRatingBarChangeListener arg) {
    return BaseDSL.attr(OnRatingBarChangeFunceb1aadb8.getInstance(), arg);
  }

  public static Void onScroll(AbsListView.OnScrollListener arg) {
    return BaseDSL.attr(OnScrollFunce14bebe4.getInstance(), arg);
  }

  public static Void onScroll(NumberPicker.OnScrollListener arg) {
    return BaseDSL.attr(OnScrollFunca8ab482c.getInstance(), arg);
  }

  public static Void onSearchClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnSearchClickFunc79a13a5e.getInstance(), arg);
  }

  public static Void onSeekBarChange(SeekBar.OnSeekBarChangeListener arg) {
    return BaseDSL.attr(OnSeekBarChangeFunc11980542.getInstance(), arg);
  }

  public static Void onSuggestion(SearchView.OnSuggestionListener arg) {
    return BaseDSL.attr(OnSuggestionFunc8020caad.getInstance(), arg);
  }

  public static Void onSystemUiVisibilityChange(View.OnSystemUiVisibilityChangeListener arg) {
    return BaseDSL.attr(OnSystemUiVisibilityChangeFunc42302537.getInstance(), arg);
  }

  public static Void onTabChanged(TabHost.OnTabChangeListener arg) {
    return BaseDSL.attr(OnTabChangedFunc2d645be.getInstance(), arg);
  }

  public static Void onTimeChanged(TimePicker.OnTimeChangedListener arg) {
    return BaseDSL.attr(OnTimeChangedFuncaf1cf294.getInstance(), arg);
  }

  public static Void onTouch(View.OnTouchListener arg) {
    return BaseDSL.attr(OnTouchFunca554ad15.getInstance(), arg);
  }

  public static Void onUnhandledInputEvent(TvView.OnUnhandledInputEventListener arg) {
    return BaseDSL.attr(OnUnhandledInputEventFunc8283e384.getInstance(), arg);
  }

  public static Void onValueChanged(NumberPicker.OnValueChangeListener arg) {
    return BaseDSL.attr(OnValueChangedFunc6e8a79aa.getInstance(), arg);
  }

  public static Void onZoomInClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnZoomInClickFunc79a13a5e.getInstance(), arg);
  }

  public static Void onZoomOutClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnZoomOutClickFunc79a13a5e.getInstance(), arg);
  }

  public static Void opaque(boolean arg) {
    return BaseDSL.attr(OpaqueFunc148d6054.getInstance(), arg);
  }

  public static Void orientation(int arg) {
    return BaseDSL.attr(OrientationFunc8567756a.getInstance(), arg);
  }

  public static Void outAnimation(ObjectAnimator arg) {
    return BaseDSL.attr(OutAnimationFunc9a08bdaf.getInstance(), arg);
  }

  public static Void outAnimation(Animation arg) {
    return BaseDSL.attr(OutAnimationFunc76cb7b50.getInstance(), arg);
  }

  public static Void outlineProvider(ViewOutlineProvider arg) {
    return BaseDSL.attr(OutlineProviderFuncc76d7ca4.getInstance(), arg);
  }

  public static Void overScrollMode(int arg) {
    return BaseDSL.attr(OverScrollModeFunc8567756a.getInstance(), arg);
  }

  public static Void overlay(Drawable arg) {
    return BaseDSL.attr(OverlayFuncfb47464a.getInstance(), arg);
  }

  public static Void overscrollFooter(Drawable arg) {
    return BaseDSL.attr(OverscrollFooterFuncfb47464a.getInstance(), arg);
  }

  public static Void overscrollHeader(Drawable arg) {
    return BaseDSL.attr(OverscrollHeaderFuncfb47464a.getInstance(), arg);
  }

  public static Void paintFlags(int arg) {
    return BaseDSL.attr(PaintFlagsFunc8567756a.getInstance(), arg);
  }

  public static Void persistentDrawingCache(int arg) {
    return BaseDSL.attr(PersistentDrawingCacheFunc8567756a.getInstance(), arg);
  }

  public static Void pivotX(float arg) {
    return BaseDSL.attr(PivotXFunce0893188.getInstance(), arg);
  }

  public static Void pivotY(float arg) {
    return BaseDSL.attr(PivotYFunce0893188.getInstance(), arg);
  }

  public static Void popupBackgroundDrawable(Drawable arg) {
    return BaseDSL.attr(PopupBackgroundDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void popupBackgroundResource(int arg) {
    return BaseDSL.attr(PopupBackgroundResourceFunc8567756a.getInstance(), arg);
  }

  public static Void popupParent(View arg) {
    return BaseDSL.attr(PopupParentFunc6c3617af.getInstance(), arg);
  }

  public static Void popupTheme(int arg) {
    return BaseDSL.attr(PopupThemeFunc8567756a.getInstance(), arg);
  }

  public static Void preserveEGLContextOnPause(boolean arg) {
    return BaseDSL.attr(PreserveEGLContextOnPauseFunc148d6054.getInstance(), arg);
  }

  public static Void pressed(boolean arg) {
    return BaseDSL.attr(PressedFunc148d6054.getInstance(), arg);
  }

  public static Void previewEnabled(boolean arg) {
    return BaseDSL.attr(PreviewEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void privateImeOptions(String arg) {
    return BaseDSL.attr(PrivateImeOptionsFunc473e3665.getInstance(), arg);
  }

  public static Void progress(int arg) {
    return BaseDSL.attr(ProgressFunc8567756a.getInstance(), arg);
  }

  public static Void progressBackgroundTintList(ColorStateList arg) {
    return BaseDSL.attr(ProgressBackgroundTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void progressBackgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ProgressBackgroundTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void progressDrawable(Drawable arg) {
    return BaseDSL.attr(ProgressDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void progressDrawableTiled(Drawable arg) {
    return BaseDSL.attr(ProgressDrawableTiledFuncfb47464a.getInstance(), arg);
  }

  public static Void progressTintList(ColorStateList arg) {
    return BaseDSL.attr(ProgressTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void progressTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ProgressTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void prompt(CharSequence arg) {
    return BaseDSL.attr(PromptFuncc0af808b.getInstance(), arg);
  }

  public static Void promptId(int arg) {
    return BaseDSL.attr(PromptIdFunc8567756a.getInstance(), arg);
  }

  public static Void proximityCorrectionEnabled(boolean arg) {
    return BaseDSL.attr(ProximityCorrectionEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void queryHint(CharSequence arg) {
    return BaseDSL.attr(QueryHintFuncc0af808b.getInstance(), arg);
  }

  public static Void queryRefinementEnabled(boolean arg) {
    return BaseDSL.attr(QueryRefinementEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void rating(float arg) {
    return BaseDSL.attr(RatingFunce0893188.getInstance(), arg);
  }

  public static Void rawInputType(int arg) {
    return BaseDSL.attr(RawInputTypeFunc8567756a.getInstance(), arg);
  }

  public static Void recyclerListener(AbsListView.RecyclerListener arg) {
    return BaseDSL.attr(RecyclerListenerFunc93ebab97.getInstance(), arg);
  }

  public static Void remoteViewsAdapter(Intent arg) {
    return BaseDSL.attr(RemoteViewsAdapterFuncbcfa9f30.getInstance(), arg);
  }

  public static Void renderMode(int arg) {
    return BaseDSL.attr(RenderModeFunc8567756a.getInstance(), arg);
  }

  public static Void renderer(GLSurfaceView.Renderer arg) {
    return BaseDSL.attr(RendererFunc48532fc4.getInstance(), arg);
  }

  public static Void right(int arg) {
    return BaseDSL.attr(RightFunc8567756a.getInstance(), arg);
  }

  public static Void rightStripDrawable(Drawable arg) {
    return BaseDSL.attr(RightStripDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void rightStripDrawable(int arg) {
    return BaseDSL.attr(RightStripDrawableFunc8567756a.getInstance(), arg);
  }

  public static Void rotation(float arg) {
    return BaseDSL.attr(RotationFunce0893188.getInstance(), arg);
  }

  public static Void rotationX(float arg) {
    return BaseDSL.attr(RotationXFunce0893188.getInstance(), arg);
  }

  public static Void rotationY(float arg) {
    return BaseDSL.attr(RotationYFunce0893188.getInstance(), arg);
  }

  public static Void routeTypes(int arg) {
    return BaseDSL.attr(RouteTypesFunc8567756a.getInstance(), arg);
  }

  public static Void rowCount(int arg) {
    return BaseDSL.attr(RowCountFunc8567756a.getInstance(), arg);
  }

  public static Void rowOrderPreserved(boolean arg) {
    return BaseDSL.attr(RowOrderPreservedFunc148d6054.getInstance(), arg);
  }

  public static Void saveEnabled(boolean arg) {
    return BaseDSL.attr(SaveEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void saveFromParentEnabled(boolean arg) {
    return BaseDSL.attr(SaveFromParentEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void scaleType(ImageView.ScaleType arg) {
    return BaseDSL.attr(ScaleTypeFunc1c5151cb.getInstance(), arg);
  }

  public static Void scaleX(float arg) {
    return BaseDSL.attr(ScaleXFunce0893188.getInstance(), arg);
  }

  public static Void scaleY(float arg) {
    return BaseDSL.attr(ScaleYFunce0893188.getInstance(), arg);
  }

  public static Void scrollBarDefaultDelayBeforeFade(int arg) {
    return BaseDSL.attr(ScrollBarDefaultDelayBeforeFadeFunc8567756a.getInstance(), arg);
  }

  public static Void scrollBarFadeDuration(int arg) {
    return BaseDSL.attr(ScrollBarFadeDurationFunc8567756a.getInstance(), arg);
  }

  public static Void scrollBarSize(int arg) {
    return BaseDSL.attr(ScrollBarSizeFunc8567756a.getInstance(), arg);
  }

  public static Void scrollBarStyle(int arg) {
    return BaseDSL.attr(ScrollBarStyleFunc8567756a.getInstance(), arg);
  }

  public static Void scrollContainer(boolean arg) {
    return BaseDSL.attr(ScrollContainerFunc148d6054.getInstance(), arg);
  }

  public static Void scrollX(int arg) {
    return BaseDSL.attr(ScrollXFunc8567756a.getInstance(), arg);
  }

  public static Void scrollY(int arg) {
    return BaseDSL.attr(ScrollYFunc8567756a.getInstance(), arg);
  }

  public static Void scrollbarFadingEnabled(boolean arg) {
    return BaseDSL.attr(ScrollbarFadingEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void scroller(Scroller arg) {
    return BaseDSL.attr(ScrollerFunc7fa71345.getInstance(), arg);
  }

  public static Void scrollingCacheEnabled(boolean arg) {
    return BaseDSL.attr(ScrollingCacheEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void searchableInfo(SearchableInfo arg) {
    return BaseDSL.attr(SearchableInfoFunc1f96c03c.getInstance(), arg);
  }

  public static Void secondaryProgress(int arg) {
    return BaseDSL.attr(SecondaryProgressFunc8567756a.getInstance(), arg);
  }

  public static Void secondaryProgressTintList(ColorStateList arg) {
    return BaseDSL.attr(SecondaryProgressTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void secondaryProgressTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(SecondaryProgressTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void secure(boolean arg) {
    return BaseDSL.attr(SecureFunc148d6054.getInstance(), arg);
  }

  public static Void selectAllOnFocus(boolean arg) {
    return BaseDSL.attr(SelectAllOnFocusFunc148d6054.getInstance(), arg);
  }

  public static Void selected(boolean arg) {
    return BaseDSL.attr(SelectedFunc148d6054.getInstance(), arg);
  }

  public static Void selectedDateVerticalBar(Drawable arg) {
    return BaseDSL.attr(SelectedDateVerticalBarFuncfb47464a.getInstance(), arg);
  }

  public static Void selectedDateVerticalBar(int arg) {
    return BaseDSL.attr(SelectedDateVerticalBarFunc8567756a.getInstance(), arg);
  }

  public static Void selectedGroup(int arg) {
    return BaseDSL.attr(SelectedGroupFunc8567756a.getInstance(), arg);
  }

  public static Void selectedWeekBackgroundColor(int arg) {
    return BaseDSL.attr(SelectedWeekBackgroundColorFunc8567756a.getInstance(), arg);
  }

  public static Void selection(int arg) {
    return BaseDSL.attr(SelectionFunc8567756a.getInstance(), arg);
  }

  public static Void selector(Drawable arg) {
    return BaseDSL.attr(SelectorFuncfb47464a.getInstance(), arg);
  }

  public static Void selector(int arg) {
    return BaseDSL.attr(SelectorFunc8567756a.getInstance(), arg);
  }

  public static Void shifted(boolean arg) {
    return BaseDSL.attr(ShiftedFunc148d6054.getInstance(), arg);
  }

  public static Void showDividers(int arg) {
    return BaseDSL.attr(ShowDividersFunc8567756a.getInstance(), arg);
  }

  public static Void showSoftInputOnFocus(boolean arg) {
    return BaseDSL.attr(ShowSoftInputOnFocusFunc148d6054.getInstance(), arg);
  }

  public static Void showText(boolean arg) {
    return BaseDSL.attr(ShowTextFunc148d6054.getInstance(), arg);
  }

  public static Void showWeekNumber(boolean arg) {
    return BaseDSL.attr(ShowWeekNumberFunc148d6054.getInstance(), arg);
  }

  public static Void shownWeekCount(int arg) {
    return BaseDSL.attr(ShownWeekCountFunc8567756a.getInstance(), arg);
  }

  public static Void shrinkAllColumns(boolean arg) {
    return BaseDSL.attr(ShrinkAllColumnsFunc148d6054.getInstance(), arg);
  }

  public static Void singleLine(boolean arg) {
    return BaseDSL.attr(SingleLineFunc148d6054.getInstance(), arg);
  }

  public static Void smoothScrollbarEnabled(boolean arg) {
    return BaseDSL.attr(SmoothScrollbarEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void smoothScrollingEnabled(boolean arg) {
    return BaseDSL.attr(SmoothScrollingEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void soundEffectsEnabled(boolean arg) {
    return BaseDSL.attr(SoundEffectsEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void spacing(int arg) {
    return BaseDSL.attr(SpacingFunc8567756a.getInstance(), arg);
  }

  public static Void spannableFactory(Spannable.Factory arg) {
    return BaseDSL.attr(SpannableFactoryFunc195c8c78.getInstance(), arg);
  }

  public static Void spinnersShown(boolean arg) {
    return BaseDSL.attr(SpinnersShownFunc148d6054.getInstance(), arg);
  }

  public static Void splitTrack(boolean arg) {
    return BaseDSL.attr(SplitTrackFunc148d6054.getInstance(), arg);
  }

  public static Void stackFromBottom(boolean arg) {
    return BaseDSL.attr(StackFromBottomFunc148d6054.getInstance(), arg);
  }

  public static Void stateListAnimator(StateListAnimator arg) {
    return BaseDSL.attr(StateListAnimatorFunc24d8c9cd.getInstance(), arg);
  }

  public static Void stepSize(float arg) {
    return BaseDSL.attr(StepSizeFunce0893188.getInstance(), arg);
  }

  public static Void streamVolume(float arg) {
    return BaseDSL.attr(StreamVolumeFunce0893188.getInstance(), arg);
  }

  public static Void stretchAllColumns(boolean arg) {
    return BaseDSL.attr(StretchAllColumnsFunc148d6054.getInstance(), arg);
  }

  public static Void stretchMode(int arg) {
    return BaseDSL.attr(StretchModeFunc8567756a.getInstance(), arg);
  }

  public static Void stripEnabled(boolean arg) {
    return BaseDSL.attr(StripEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void submitButtonEnabled(boolean arg) {
    return BaseDSL.attr(SubmitButtonEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void subtitle(int arg) {
    return BaseDSL.attr(SubtitleFunc8567756a.getInstance(), arg);
  }

  public static Void subtitle(CharSequence arg) {
    return BaseDSL.attr(SubtitleFuncc0af808b.getInstance(), arg);
  }

  public static Void subtitleTextColor(int arg) {
    return BaseDSL.attr(SubtitleTextColorFunc8567756a.getInstance(), arg);
  }

  public static Void suggestionsAdapter(CursorAdapter arg) {
    return BaseDSL.attr(SuggestionsAdapterFunc2f59eaee.getInstance(), arg);
  }

  public static Void surfaceTexture(SurfaceTexture arg) {
    return BaseDSL.attr(SurfaceTextureFuncc2f30b12.getInstance(), arg);
  }

  public static Void surfaceTextureListener(TextureView.SurfaceTextureListener arg) {
    return BaseDSL.attr(SurfaceTextureListenerFunc528d697a.getInstance(), arg);
  }

  public static Void switchMinWidth(int arg) {
    return BaseDSL.attr(SwitchMinWidthFunc8567756a.getInstance(), arg);
  }

  public static Void switchPadding(int arg) {
    return BaseDSL.attr(SwitchPaddingFunc8567756a.getInstance(), arg);
  }

  public static Void switchTypeface(Typeface arg) {
    return BaseDSL.attr(SwitchTypefaceFunc53b4afb.getInstance(), arg);
  }

  public static Void systemUiVisibility(int arg) {
    return BaseDSL.attr(SystemUiVisibilityFunc8567756a.getInstance(), arg);
  }

  public static Void tag(Object arg) {
    return BaseDSL.attr(TagFunc3f697993.getInstance(), arg);
  }

  public static Void text(int arg) {
    return BaseDSL.attr(TextFunc8567756a.getInstance(), arg);
  }

  public static Void textAlignment(int arg) {
    return BaseDSL.attr(TextAlignmentFunc8567756a.getInstance(), arg);
  }

  public static Void textColor(ColorStateList arg) {
    return BaseDSL.attr(TextColorFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void textColor(int arg) {
    return BaseDSL.attr(TextColorFunc8567756a.getInstance(), arg);
  }

  public static Void textDirection(int arg) {
    return BaseDSL.attr(TextDirectionFunc8567756a.getInstance(), arg);
  }

  public static Void textFilterEnabled(boolean arg) {
    return BaseDSL.attr(TextFilterEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void textIsSelectable(boolean arg) {
    return BaseDSL.attr(TextIsSelectableFunc148d6054.getInstance(), arg);
  }

  public static Void textKeepState(CharSequence arg) {
    return BaseDSL.attr(TextKeepStateFuncc0af808b.getInstance(), arg);
  }

  public static Void textLocale(Locale arg) {
    return BaseDSL.attr(TextLocaleFuncba8c481a.getInstance(), arg);
  }

  public static Void textOff(CharSequence arg) {
    return BaseDSL.attr(TextOffFuncc0af808b.getInstance(), arg);
  }

  public static Void textOn(CharSequence arg) {
    return BaseDSL.attr(TextOnFuncc0af808b.getInstance(), arg);
  }

  public static Void textScaleX(float arg) {
    return BaseDSL.attr(TextScaleXFunce0893188.getInstance(), arg);
  }

  public static Void threshold(int arg) {
    return BaseDSL.attr(ThresholdFunc8567756a.getInstance(), arg);
  }

  public static Void thumb(Drawable arg) {
    return BaseDSL.attr(ThumbFuncfb47464a.getInstance(), arg);
  }

  public static Void thumbDrawable(Drawable arg) {
    return BaseDSL.attr(ThumbDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void thumbOffset(int arg) {
    return BaseDSL.attr(ThumbOffsetFunc8567756a.getInstance(), arg);
  }

  public static Void thumbResource(int arg) {
    return BaseDSL.attr(ThumbResourceFunc8567756a.getInstance(), arg);
  }

  public static Void thumbTextPadding(int arg) {
    return BaseDSL.attr(ThumbTextPaddingFunc8567756a.getInstance(), arg);
  }

  public static Void thumbTintList(ColorStateList arg) {
    return BaseDSL.attr(ThumbTintListFunc9e5e0e4e.getInstance(), arg);
  }

  public static Void thumbTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ThumbTintModeFuncabb7a84e.getInstance(), arg);
  }

  public static Void timeZone(String arg) {
    return BaseDSL.attr(TimeZoneFunc473e3665.getInstance(), arg);
  }

  public static Void title(int arg) {
    return BaseDSL.attr(TitleFunc8567756a.getInstance(), arg);
  }

  public static Void title(CharSequence arg) {
    return BaseDSL.attr(TitleFuncc0af808b.getInstance(), arg);
  }

  public static Void titleTextColor(int arg) {
    return BaseDSL.attr(TitleTextColorFunc8567756a.getInstance(), arg);
  }

  public static Void tokenizer(MultiAutoCompleteTextView.Tokenizer arg) {
    return BaseDSL.attr(TokenizerFunc6ae2b151.getInstance(), arg);
  }

  public static Void top(int arg) {
    return BaseDSL.attr(TopFunc8567756a.getInstance(), arg);
  }

  public static Void touchDelegate(TouchDelegate arg) {
    return BaseDSL.attr(TouchDelegateFunc8217a01a.getInstance(), arg);
  }

  public static Void touchscreenBlocksFocus(boolean arg) {
    return BaseDSL.attr(TouchscreenBlocksFocusFunc148d6054.getInstance(), arg);
  }

  public static Void trackDrawable(Drawable arg) {
    return BaseDSL.attr(TrackDrawableFuncfb47464a.getInstance(), arg);
  }

  public static Void trackResource(int arg) {
    return BaseDSL.attr(TrackResourceFunc8567756a.getInstance(), arg);
  }

  public static Void transcriptMode(int arg) {
    return BaseDSL.attr(TranscriptModeFunc8567756a.getInstance(), arg);
  }

  public static Void transform(Matrix arg) {
    return BaseDSL.attr(TransformFunc6b9f325.getInstance(), arg);
  }

  public static Void transformationMethod(TransformationMethod arg) {
    return BaseDSL.attr(TransformationMethodFunc65bbcab5.getInstance(), arg);
  }

  public static Void transitionGroup(boolean arg) {
    return BaseDSL.attr(TransitionGroupFunc148d6054.getInstance(), arg);
  }

  public static Void transitionName(String arg) {
    return BaseDSL.attr(TransitionNameFunc473e3665.getInstance(), arg);
  }

  public static Void translationX(float arg) {
    return BaseDSL.attr(TranslationXFunce0893188.getInstance(), arg);
  }

  public static Void translationY(float arg) {
    return BaseDSL.attr(TranslationYFunce0893188.getInstance(), arg);
  }

  public static Void translationZ(float arg) {
    return BaseDSL.attr(TranslationZFunce0893188.getInstance(), arg);
  }

  public static Void typeface(Typeface arg) {
    return BaseDSL.attr(TypefaceFunc53b4afb.getInstance(), arg);
  }

  public static Void uncertainGestureColor(int arg) {
    return BaseDSL.attr(UncertainGestureColorFunc8567756a.getInstance(), arg);
  }

  public static Void unfocusedMonthDateColor(int arg) {
    return BaseDSL.attr(UnfocusedMonthDateColorFunc8567756a.getInstance(), arg);
  }

  public static Void unselectedAlpha(float arg) {
    return BaseDSL.attr(UnselectedAlphaFunce0893188.getInstance(), arg);
  }

  public static Void up(LocalActivityManager arg) {
    return BaseDSL.attr(UpFunc7b013b1f.getInstance(), arg);
  }

  public static Void useDefaultMargins(boolean arg) {
    return BaseDSL.attr(UseDefaultMarginsFunc148d6054.getInstance(), arg);
  }

  public static Void validator(AutoCompleteTextView.Validator arg) {
    return BaseDSL.attr(ValidatorFuncd6d080a9.getInstance(), arg);
  }

  public static Void value(int arg) {
    return BaseDSL.attr(ValueFunc8567756a.getInstance(), arg);
  }

  public static Void velocityScale(float arg) {
    return BaseDSL.attr(VelocityScaleFunce0893188.getInstance(), arg);
  }

  public static Void verticalCorrection(int arg) {
    return BaseDSL.attr(VerticalCorrectionFunc8567756a.getInstance(), arg);
  }

  public static Void verticalFadingEdgeEnabled(boolean arg) {
    return BaseDSL.attr(VerticalFadingEdgeEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void verticalGravity(int arg) {
    return BaseDSL.attr(VerticalGravityFunc8567756a.getInstance(), arg);
  }

  public static Void verticalScrollBarEnabled(boolean arg) {
    return BaseDSL.attr(VerticalScrollBarEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void verticalScrollbarOverlay(boolean arg) {
    return BaseDSL.attr(VerticalScrollbarOverlayFunc148d6054.getInstance(), arg);
  }

  public static Void verticalScrollbarPosition(int arg) {
    return BaseDSL.attr(VerticalScrollbarPositionFunc8567756a.getInstance(), arg);
  }

  public static Void verticalSpacing(int arg) {
    return BaseDSL.attr(VerticalSpacingFunc8567756a.getInstance(), arg);
  }

  public static Void videoPath(String arg) {
    return BaseDSL.attr(VideoPathFunc473e3665.getInstance(), arg);
  }

  public static Void videoURI(Uri arg) {
    return BaseDSL.attr(VideoURIFunc75f430fc.getInstance(), arg);
  }

  public static Void visibility(int arg) {
    return BaseDSL.attr(VisibilityFunc8567756a.getInstance(), arg);
  }

  public static Void webChromeClient(WebChromeClient arg) {
    return BaseDSL.attr(WebChromeClientFunc54f22bac.getInstance(), arg);
  }

  public static Void webContentsDebuggingEnabled(boolean arg) {
    return BaseDSL.attr(WebContentsDebuggingEnabledFunc148d6054.getInstance(), arg);
  }

  public static Void webViewClient(WebViewClient arg) {
    return BaseDSL.attr(WebViewClientFunc95cf0d57.getInstance(), arg);
  }

  public static Void weekDayTextAppearance(int arg) {
    return BaseDSL.attr(WeekDayTextAppearanceFunc8567756a.getInstance(), arg);
  }

  public static Void weekNumberColor(int arg) {
    return BaseDSL.attr(WeekNumberColorFunc8567756a.getInstance(), arg);
  }

  public static Void weekSeparatorLineColor(int arg) {
    return BaseDSL.attr(WeekSeparatorLineColorFunc8567756a.getInstance(), arg);
  }

  public static Void weightSum(float arg) {
    return BaseDSL.attr(WeightSumFunce0893188.getInstance(), arg);
  }

  public static Void width(int arg) {
    return BaseDSL.attr(WidthFunc8567756a.getInstance(), arg);
  }

  public static Void willNotCacheDrawing(boolean arg) {
    return BaseDSL.attr(WillNotCacheDrawingFunc148d6054.getInstance(), arg);
  }

  public static Void willNotDraw(boolean arg) {
    return BaseDSL.attr(WillNotDrawFunc148d6054.getInstance(), arg);
  }

  public static Void wrapSelectorWheel(boolean arg) {
    return BaseDSL.attr(WrapSelectorWheelFunc148d6054.getInstance(), arg);
  }

  public static Void x(float arg) {
    return BaseDSL.attr(XFunce0893188.getInstance(), arg);
  }

  public static Void y(float arg) {
    return BaseDSL.attr(YFunce0893188.getInstance(), arg);
  }

  public static Void z(float arg) {
    return BaseDSL.attr(ZFunce0893188.getInstance(), arg);
  }

  public static Void zOrderMediaOverlay(boolean arg) {
    return BaseDSL.attr(ZOrderMediaOverlayFunc148d6054.getInstance(), arg);
  }

  public static Void zOrderOnTop(boolean arg) {
    return BaseDSL.attr(ZOrderOnTopFunc148d6054.getInstance(), arg);
  }

  public static Void zoomSpeed(long arg) {
    return BaseDSL.attr(ZoomSpeedFunc17c521d0.getInstance(), arg);
  }

  private static final class FragmentBreadCrumbsFactoryFunc implements Anvil.FactoryFunc<FragmentBreadCrumbs> {
    private static FragmentBreadCrumbsFactoryFunc instance = null;

    public static FragmentBreadCrumbsFactoryFunc getInstance() {
      if(instance == null) {
        instance = new FragmentBreadCrumbsFactoryFunc();
      }
      return instance;
    }

    public FragmentBreadCrumbs apply(Context c) {
      return new FragmentBreadCrumbs(c);
    }
  }

  private static final class MediaRouteButtonFactoryFunc implements Anvil.FactoryFunc<MediaRouteButton> {
    private static MediaRouteButtonFactoryFunc instance = null;

    public static MediaRouteButtonFactoryFunc getInstance() {
      if(instance == null) {
        instance = new MediaRouteButtonFactoryFunc();
      }
      return instance;
    }

    public MediaRouteButton apply(Context c) {
      return new MediaRouteButton(c);
    }
  }

  private static final class AppWidgetHostViewFactoryFunc implements Anvil.FactoryFunc<AppWidgetHostView> {
    private static AppWidgetHostViewFactoryFunc instance = null;

    public static AppWidgetHostViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new AppWidgetHostViewFactoryFunc();
      }
      return instance;
    }

    public AppWidgetHostView apply(Context c) {
      return new AppWidgetHostView(c);
    }
  }

  private static final class GestureOverlayViewFactoryFunc implements Anvil.FactoryFunc<GestureOverlayView> {
    private static GestureOverlayViewFactoryFunc instance = null;

    public static GestureOverlayViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new GestureOverlayViewFactoryFunc();
      }
      return instance;
    }

    public GestureOverlayView apply(Context c) {
      return new GestureOverlayView(c);
    }
  }

  private static final class ExtractEditTextFactoryFunc implements Anvil.FactoryFunc<ExtractEditText> {
    private static ExtractEditTextFactoryFunc instance = null;

    public static ExtractEditTextFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ExtractEditTextFactoryFunc();
      }
      return instance;
    }

    public ExtractEditText apply(Context c) {
      return new ExtractEditText(c);
    }
  }

  private static final class TvViewFactoryFunc implements Anvil.FactoryFunc<TvView> {
    private static TvViewFactoryFunc instance = null;

    public static TvViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TvViewFactoryFunc();
      }
      return instance;
    }

    public TvView apply(Context c) {
      return new TvView(c);
    }
  }

  private static final class GLSurfaceViewFactoryFunc implements Anvil.FactoryFunc<GLSurfaceView> {
    private static GLSurfaceViewFactoryFunc instance = null;

    public static GLSurfaceViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new GLSurfaceViewFactoryFunc();
      }
      return instance;
    }

    public GLSurfaceView apply(Context c) {
      return new GLSurfaceView(c);
    }
  }

  private static final class SurfaceViewFactoryFunc implements Anvil.FactoryFunc<SurfaceView> {
    private static SurfaceViewFactoryFunc instance = null;

    public static SurfaceViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new SurfaceViewFactoryFunc();
      }
      return instance;
    }

    public SurfaceView apply(Context c) {
      return new SurfaceView(c);
    }
  }

  private static final class TextureViewFactoryFunc implements Anvil.FactoryFunc<TextureView> {
    private static TextureViewFactoryFunc instance = null;

    public static TextureViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TextureViewFactoryFunc();
      }
      return instance;
    }

    public TextureView apply(Context c) {
      return new TextureView(c);
    }
  }

  private static final class ViewFactoryFunc implements Anvil.FactoryFunc<View> {
    private static ViewFactoryFunc instance = null;

    public static ViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ViewFactoryFunc();
      }
      return instance;
    }

    public View apply(Context c) {
      return new View(c);
    }
  }

  private static final class ViewStubFactoryFunc implements Anvil.FactoryFunc<ViewStub> {
    private static ViewStubFactoryFunc instance = null;

    public static ViewStubFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ViewStubFactoryFunc();
      }
      return instance;
    }

    public ViewStub apply(Context c) {
      return new ViewStub(c);
    }
  }

  private static final class WebViewFactoryFunc implements Anvil.FactoryFunc<WebView> {
    private static WebViewFactoryFunc instance = null;

    public static WebViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new WebViewFactoryFunc();
      }
      return instance;
    }

    public WebView apply(Context c) {
      return new WebView(c);
    }
  }

  private static final class AbsoluteLayoutFactoryFunc implements Anvil.FactoryFunc<AbsoluteLayout> {
    private static AbsoluteLayoutFactoryFunc instance = null;

    public static AbsoluteLayoutFactoryFunc getInstance() {
      if(instance == null) {
        instance = new AbsoluteLayoutFactoryFunc();
      }
      return instance;
    }

    public AbsoluteLayout apply(Context c) {
      return new AbsoluteLayout(c);
    }
  }

  private static final class ActionMenuViewFactoryFunc implements Anvil.FactoryFunc<ActionMenuView> {
    private static ActionMenuViewFactoryFunc instance = null;

    public static ActionMenuViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ActionMenuViewFactoryFunc();
      }
      return instance;
    }

    public ActionMenuView apply(Context c) {
      return new ActionMenuView(c);
    }
  }

  private static final class AdapterViewFlipperFactoryFunc implements Anvil.FactoryFunc<AdapterViewFlipper> {
    private static AdapterViewFlipperFactoryFunc instance = null;

    public static AdapterViewFlipperFactoryFunc getInstance() {
      if(instance == null) {
        instance = new AdapterViewFlipperFactoryFunc();
      }
      return instance;
    }

    public AdapterViewFlipper apply(Context c) {
      return new AdapterViewFlipper(c);
    }
  }

  private static final class AnalogClockFactoryFunc implements Anvil.FactoryFunc<AnalogClock> {
    private static AnalogClockFactoryFunc instance = null;

    public static AnalogClockFactoryFunc getInstance() {
      if(instance == null) {
        instance = new AnalogClockFactoryFunc();
      }
      return instance;
    }

    public AnalogClock apply(Context c) {
      return new AnalogClock(c);
    }
  }

  private static final class AutoCompleteTextViewFactoryFunc implements Anvil.FactoryFunc<AutoCompleteTextView> {
    private static AutoCompleteTextViewFactoryFunc instance = null;

    public static AutoCompleteTextViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new AutoCompleteTextViewFactoryFunc();
      }
      return instance;
    }

    public AutoCompleteTextView apply(Context c) {
      return new AutoCompleteTextView(c);
    }
  }

  private static final class ButtonFactoryFunc implements Anvil.FactoryFunc<Button> {
    private static ButtonFactoryFunc instance = null;

    public static ButtonFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ButtonFactoryFunc();
      }
      return instance;
    }

    public Button apply(Context c) {
      return new Button(c);
    }
  }

  private static final class CalendarViewFactoryFunc implements Anvil.FactoryFunc<CalendarView> {
    private static CalendarViewFactoryFunc instance = null;

    public static CalendarViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new CalendarViewFactoryFunc();
      }
      return instance;
    }

    public CalendarView apply(Context c) {
      return new CalendarView(c);
    }
  }

  private static final class CheckBoxFactoryFunc implements Anvil.FactoryFunc<CheckBox> {
    private static CheckBoxFactoryFunc instance = null;

    public static CheckBoxFactoryFunc getInstance() {
      if(instance == null) {
        instance = new CheckBoxFactoryFunc();
      }
      return instance;
    }

    public CheckBox apply(Context c) {
      return new CheckBox(c);
    }
  }

  private static final class CheckedTextViewFactoryFunc implements Anvil.FactoryFunc<CheckedTextView> {
    private static CheckedTextViewFactoryFunc instance = null;

    public static CheckedTextViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new CheckedTextViewFactoryFunc();
      }
      return instance;
    }

    public CheckedTextView apply(Context c) {
      return new CheckedTextView(c);
    }
  }

  private static final class ChronometerFactoryFunc implements Anvil.FactoryFunc<Chronometer> {
    private static ChronometerFactoryFunc instance = null;

    public static ChronometerFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ChronometerFactoryFunc();
      }
      return instance;
    }

    public Chronometer apply(Context c) {
      return new Chronometer(c);
    }
  }

  private static final class DatePickerFactoryFunc implements Anvil.FactoryFunc<DatePicker> {
    private static DatePickerFactoryFunc instance = null;

    public static DatePickerFactoryFunc getInstance() {
      if(instance == null) {
        instance = new DatePickerFactoryFunc();
      }
      return instance;
    }

    public DatePicker apply(Context c) {
      return new DatePicker(c);
    }
  }

  private static final class DialerFilterFactoryFunc implements Anvil.FactoryFunc<DialerFilter> {
    private static DialerFilterFactoryFunc instance = null;

    public static DialerFilterFactoryFunc getInstance() {
      if(instance == null) {
        instance = new DialerFilterFactoryFunc();
      }
      return instance;
    }

    public DialerFilter apply(Context c) {
      return new DialerFilter(c);
    }
  }

  private static final class DigitalClockFactoryFunc implements Anvil.FactoryFunc<DigitalClock> {
    private static DigitalClockFactoryFunc instance = null;

    public static DigitalClockFactoryFunc getInstance() {
      if(instance == null) {
        instance = new DigitalClockFactoryFunc();
      }
      return instance;
    }

    public DigitalClock apply(Context c) {
      return new DigitalClock(c);
    }
  }

  private static final class EditTextFactoryFunc implements Anvil.FactoryFunc<EditText> {
    private static EditTextFactoryFunc instance = null;

    public static EditTextFactoryFunc getInstance() {
      if(instance == null) {
        instance = new EditTextFactoryFunc();
      }
      return instance;
    }

    public EditText apply(Context c) {
      return new EditText(c);
    }
  }

  private static final class ExpandableListViewFactoryFunc implements Anvil.FactoryFunc<ExpandableListView> {
    private static ExpandableListViewFactoryFunc instance = null;

    public static ExpandableListViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ExpandableListViewFactoryFunc();
      }
      return instance;
    }

    public ExpandableListView apply(Context c) {
      return new ExpandableListView(c);
    }
  }

  private static final class FrameLayoutFactoryFunc implements Anvil.FactoryFunc<FrameLayout> {
    private static FrameLayoutFactoryFunc instance = null;

    public static FrameLayoutFactoryFunc getInstance() {
      if(instance == null) {
        instance = new FrameLayoutFactoryFunc();
      }
      return instance;
    }

    public FrameLayout apply(Context c) {
      return new FrameLayout(c);
    }
  }

  private static final class GalleryFactoryFunc implements Anvil.FactoryFunc<Gallery> {
    private static GalleryFactoryFunc instance = null;

    public static GalleryFactoryFunc getInstance() {
      if(instance == null) {
        instance = new GalleryFactoryFunc();
      }
      return instance;
    }

    public Gallery apply(Context c) {
      return new Gallery(c);
    }
  }

  private static final class GridLayoutFactoryFunc implements Anvil.FactoryFunc<GridLayout> {
    private static GridLayoutFactoryFunc instance = null;

    public static GridLayoutFactoryFunc getInstance() {
      if(instance == null) {
        instance = new GridLayoutFactoryFunc();
      }
      return instance;
    }

    public GridLayout apply(Context c) {
      return new GridLayout(c);
    }
  }

  private static final class GridViewFactoryFunc implements Anvil.FactoryFunc<GridView> {
    private static GridViewFactoryFunc instance = null;

    public static GridViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new GridViewFactoryFunc();
      }
      return instance;
    }

    public GridView apply(Context c) {
      return new GridView(c);
    }
  }

  private static final class HorizontalScrollViewFactoryFunc implements Anvil.FactoryFunc<HorizontalScrollView> {
    private static HorizontalScrollViewFactoryFunc instance = null;

    public static HorizontalScrollViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new HorizontalScrollViewFactoryFunc();
      }
      return instance;
    }

    public HorizontalScrollView apply(Context c) {
      return new HorizontalScrollView(c);
    }
  }

  private static final class ImageButtonFactoryFunc implements Anvil.FactoryFunc<ImageButton> {
    private static ImageButtonFactoryFunc instance = null;

    public static ImageButtonFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ImageButtonFactoryFunc();
      }
      return instance;
    }

    public ImageButton apply(Context c) {
      return new ImageButton(c);
    }
  }

  private static final class ImageSwitcherFactoryFunc implements Anvil.FactoryFunc<ImageSwitcher> {
    private static ImageSwitcherFactoryFunc instance = null;

    public static ImageSwitcherFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ImageSwitcherFactoryFunc();
      }
      return instance;
    }

    public ImageSwitcher apply(Context c) {
      return new ImageSwitcher(c);
    }
  }

  private static final class ImageViewFactoryFunc implements Anvil.FactoryFunc<ImageView> {
    private static ImageViewFactoryFunc instance = null;

    public static ImageViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ImageViewFactoryFunc();
      }
      return instance;
    }

    public ImageView apply(Context c) {
      return new ImageView(c);
    }
  }

  private static final class LinearLayoutFactoryFunc implements Anvil.FactoryFunc<LinearLayout> {
    private static LinearLayoutFactoryFunc instance = null;

    public static LinearLayoutFactoryFunc getInstance() {
      if(instance == null) {
        instance = new LinearLayoutFactoryFunc();
      }
      return instance;
    }

    public LinearLayout apply(Context c) {
      return new LinearLayout(c);
    }
  }

  private static final class ListViewFactoryFunc implements Anvil.FactoryFunc<ListView> {
    private static ListViewFactoryFunc instance = null;

    public static ListViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ListViewFactoryFunc();
      }
      return instance;
    }

    public ListView apply(Context c) {
      return new ListView(c);
    }
  }

  private static final class MediaControllerFactoryFunc implements Anvil.FactoryFunc<MediaController> {
    private static MediaControllerFactoryFunc instance = null;

    public static MediaControllerFactoryFunc getInstance() {
      if(instance == null) {
        instance = new MediaControllerFactoryFunc();
      }
      return instance;
    }

    public MediaController apply(Context c) {
      return new MediaController(c);
    }
  }

  private static final class MultiAutoCompleteTextViewFactoryFunc implements Anvil.FactoryFunc<MultiAutoCompleteTextView> {
    private static MultiAutoCompleteTextViewFactoryFunc instance = null;

    public static MultiAutoCompleteTextViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new MultiAutoCompleteTextViewFactoryFunc();
      }
      return instance;
    }

    public MultiAutoCompleteTextView apply(Context c) {
      return new MultiAutoCompleteTextView(c);
    }
  }

  private static final class NumberPickerFactoryFunc implements Anvil.FactoryFunc<NumberPicker> {
    private static NumberPickerFactoryFunc instance = null;

    public static NumberPickerFactoryFunc getInstance() {
      if(instance == null) {
        instance = new NumberPickerFactoryFunc();
      }
      return instance;
    }

    public NumberPicker apply(Context c) {
      return new NumberPicker(c);
    }
  }

  private static final class ProgressBarFactoryFunc implements Anvil.FactoryFunc<ProgressBar> {
    private static ProgressBarFactoryFunc instance = null;

    public static ProgressBarFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ProgressBarFactoryFunc();
      }
      return instance;
    }

    public ProgressBar apply(Context c) {
      return new ProgressBar(c);
    }
  }

  private static final class QuickContactBadgeFactoryFunc implements Anvil.FactoryFunc<QuickContactBadge> {
    private static QuickContactBadgeFactoryFunc instance = null;

    public static QuickContactBadgeFactoryFunc getInstance() {
      if(instance == null) {
        instance = new QuickContactBadgeFactoryFunc();
      }
      return instance;
    }

    public QuickContactBadge apply(Context c) {
      return new QuickContactBadge(c);
    }
  }

  private static final class RadioButtonFactoryFunc implements Anvil.FactoryFunc<RadioButton> {
    private static RadioButtonFactoryFunc instance = null;

    public static RadioButtonFactoryFunc getInstance() {
      if(instance == null) {
        instance = new RadioButtonFactoryFunc();
      }
      return instance;
    }

    public RadioButton apply(Context c) {
      return new RadioButton(c);
    }
  }

  private static final class RadioGroupFactoryFunc implements Anvil.FactoryFunc<RadioGroup> {
    private static RadioGroupFactoryFunc instance = null;

    public static RadioGroupFactoryFunc getInstance() {
      if(instance == null) {
        instance = new RadioGroupFactoryFunc();
      }
      return instance;
    }

    public RadioGroup apply(Context c) {
      return new RadioGroup(c);
    }
  }

  private static final class RatingBarFactoryFunc implements Anvil.FactoryFunc<RatingBar> {
    private static RatingBarFactoryFunc instance = null;

    public static RatingBarFactoryFunc getInstance() {
      if(instance == null) {
        instance = new RatingBarFactoryFunc();
      }
      return instance;
    }

    public RatingBar apply(Context c) {
      return new RatingBar(c);
    }
  }

  private static final class RelativeLayoutFactoryFunc implements Anvil.FactoryFunc<RelativeLayout> {
    private static RelativeLayoutFactoryFunc instance = null;

    public static RelativeLayoutFactoryFunc getInstance() {
      if(instance == null) {
        instance = new RelativeLayoutFactoryFunc();
      }
      return instance;
    }

    public RelativeLayout apply(Context c) {
      return new RelativeLayout(c);
    }
  }

  private static final class ScrollViewFactoryFunc implements Anvil.FactoryFunc<ScrollView> {
    private static ScrollViewFactoryFunc instance = null;

    public static ScrollViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ScrollViewFactoryFunc();
      }
      return instance;
    }

    public ScrollView apply(Context c) {
      return new ScrollView(c);
    }
  }

  private static final class SearchViewFactoryFunc implements Anvil.FactoryFunc<SearchView> {
    private static SearchViewFactoryFunc instance = null;

    public static SearchViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new SearchViewFactoryFunc();
      }
      return instance;
    }

    public SearchView apply(Context c) {
      return new SearchView(c);
    }
  }

  private static final class SeekBarFactoryFunc implements Anvil.FactoryFunc<SeekBar> {
    private static SeekBarFactoryFunc instance = null;

    public static SeekBarFactoryFunc getInstance() {
      if(instance == null) {
        instance = new SeekBarFactoryFunc();
      }
      return instance;
    }

    public SeekBar apply(Context c) {
      return new SeekBar(c);
    }
  }

  private static final class SpaceFactoryFunc implements Anvil.FactoryFunc<Space> {
    private static SpaceFactoryFunc instance = null;

    public static SpaceFactoryFunc getInstance() {
      if(instance == null) {
        instance = new SpaceFactoryFunc();
      }
      return instance;
    }

    public Space apply(Context c) {
      return new Space(c);
    }
  }

  private static final class SpinnerFactoryFunc implements Anvil.FactoryFunc<Spinner> {
    private static SpinnerFactoryFunc instance = null;

    public static SpinnerFactoryFunc getInstance() {
      if(instance == null) {
        instance = new SpinnerFactoryFunc();
      }
      return instance;
    }

    public Spinner apply(Context c) {
      return new Spinner(c);
    }
  }

  private static final class StackViewFactoryFunc implements Anvil.FactoryFunc<StackView> {
    private static StackViewFactoryFunc instance = null;

    public static StackViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new StackViewFactoryFunc();
      }
      return instance;
    }

    public StackView apply(Context c) {
      return new StackView(c);
    }
  }

  private static final class SwitchFactoryFunc implements Anvil.FactoryFunc<Switch> {
    private static SwitchFactoryFunc instance = null;

    public static SwitchFactoryFunc getInstance() {
      if(instance == null) {
        instance = new SwitchFactoryFunc();
      }
      return instance;
    }

    public Switch apply(Context c) {
      return new Switch(c);
    }
  }

  private static final class TabHostFactoryFunc implements Anvil.FactoryFunc<TabHost> {
    private static TabHostFactoryFunc instance = null;

    public static TabHostFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TabHostFactoryFunc();
      }
      return instance;
    }

    public TabHost apply(Context c) {
      return new TabHost(c);
    }
  }

  private static final class TabWidgetFactoryFunc implements Anvil.FactoryFunc<TabWidget> {
    private static TabWidgetFactoryFunc instance = null;

    public static TabWidgetFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TabWidgetFactoryFunc();
      }
      return instance;
    }

    public TabWidget apply(Context c) {
      return new TabWidget(c);
    }
  }

  private static final class TableLayoutFactoryFunc implements Anvil.FactoryFunc<TableLayout> {
    private static TableLayoutFactoryFunc instance = null;

    public static TableLayoutFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TableLayoutFactoryFunc();
      }
      return instance;
    }

    public TableLayout apply(Context c) {
      return new TableLayout(c);
    }
  }

  private static final class TableRowFactoryFunc implements Anvil.FactoryFunc<TableRow> {
    private static TableRowFactoryFunc instance = null;

    public static TableRowFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TableRowFactoryFunc();
      }
      return instance;
    }

    public TableRow apply(Context c) {
      return new TableRow(c);
    }
  }

  private static final class TextClockFactoryFunc implements Anvil.FactoryFunc<TextClock> {
    private static TextClockFactoryFunc instance = null;

    public static TextClockFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TextClockFactoryFunc();
      }
      return instance;
    }

    public TextClock apply(Context c) {
      return new TextClock(c);
    }
  }

  private static final class TextSwitcherFactoryFunc implements Anvil.FactoryFunc<TextSwitcher> {
    private static TextSwitcherFactoryFunc instance = null;

    public static TextSwitcherFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TextSwitcherFactoryFunc();
      }
      return instance;
    }

    public TextSwitcher apply(Context c) {
      return new TextSwitcher(c);
    }
  }

  private static final class TextViewFactoryFunc implements Anvil.FactoryFunc<TextView> {
    private static TextViewFactoryFunc instance = null;

    public static TextViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TextViewFactoryFunc();
      }
      return instance;
    }

    public TextView apply(Context c) {
      return new TextView(c);
    }
  }

  private static final class TimePickerFactoryFunc implements Anvil.FactoryFunc<TimePicker> {
    private static TimePickerFactoryFunc instance = null;

    public static TimePickerFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TimePickerFactoryFunc();
      }
      return instance;
    }

    public TimePicker apply(Context c) {
      return new TimePicker(c);
    }
  }

  private static final class ToggleButtonFactoryFunc implements Anvil.FactoryFunc<ToggleButton> {
    private static ToggleButtonFactoryFunc instance = null;

    public static ToggleButtonFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ToggleButtonFactoryFunc();
      }
      return instance;
    }

    public ToggleButton apply(Context c) {
      return new ToggleButton(c);
    }
  }

  private static final class ToolbarFactoryFunc implements Anvil.FactoryFunc<Toolbar> {
    private static ToolbarFactoryFunc instance = null;

    public static ToolbarFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ToolbarFactoryFunc();
      }
      return instance;
    }

    public Toolbar apply(Context c) {
      return new Toolbar(c);
    }
  }

  private static final class TwoLineListItemFactoryFunc implements Anvil.FactoryFunc<TwoLineListItem> {
    private static TwoLineListItemFactoryFunc instance = null;

    public static TwoLineListItemFactoryFunc getInstance() {
      if(instance == null) {
        instance = new TwoLineListItemFactoryFunc();
      }
      return instance;
    }

    public TwoLineListItem apply(Context c) {
      return new TwoLineListItem(c);
    }
  }

  private static final class VideoViewFactoryFunc implements Anvil.FactoryFunc<VideoView> {
    private static VideoViewFactoryFunc instance = null;

    public static VideoViewFactoryFunc getInstance() {
      if(instance == null) {
        instance = new VideoViewFactoryFunc();
      }
      return instance;
    }

    public VideoView apply(Context c) {
      return new VideoView(c);
    }
  }

  private static final class ViewAnimatorFactoryFunc implements Anvil.FactoryFunc<ViewAnimator> {
    private static ViewAnimatorFactoryFunc instance = null;

    public static ViewAnimatorFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ViewAnimatorFactoryFunc();
      }
      return instance;
    }

    public ViewAnimator apply(Context c) {
      return new ViewAnimator(c);
    }
  }

  private static final class ViewFlipperFactoryFunc implements Anvil.FactoryFunc<ViewFlipper> {
    private static ViewFlipperFactoryFunc instance = null;

    public static ViewFlipperFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ViewFlipperFactoryFunc();
      }
      return instance;
    }

    public ViewFlipper apply(Context c) {
      return new ViewFlipper(c);
    }
  }

  private static final class ViewSwitcherFactoryFunc implements Anvil.FactoryFunc<ViewSwitcher> {
    private static ViewSwitcherFactoryFunc instance = null;

    public static ViewSwitcherFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ViewSwitcherFactoryFunc();
      }
      return instance;
    }

    public ViewSwitcher apply(Context c) {
      return new ViewSwitcher(c);
    }
  }

  private static final class ZoomButtonFactoryFunc implements Anvil.FactoryFunc<ZoomButton> {
    private static ZoomButtonFactoryFunc instance = null;

    public static ZoomButtonFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ZoomButtonFactoryFunc();
      }
      return instance;
    }

    public ZoomButton apply(Context c) {
      return new ZoomButton(c);
    }
  }

  private static final class ZoomControlsFactoryFunc implements Anvil.FactoryFunc<ZoomControls> {
    private static ZoomControlsFactoryFunc instance = null;

    public static ZoomControlsFactoryFunc getInstance() {
      if(instance == null) {
        instance = new ZoomControlsFactoryFunc();
      }
      return instance;
    }

    public ZoomControls apply(Context c) {
      return new ZoomControls(c);
    }
  }

  private static final class AccessibilityDelegateFuncf6d047d4 implements Anvil.AttrFunc<View.AccessibilityDelegate> {
    private static AccessibilityDelegateFuncf6d047d4 instance = null;

    public static AccessibilityDelegateFuncf6d047d4 getInstance() {
      if(instance == null) {
        instance = new AccessibilityDelegateFuncf6d047d4();
      }
      return instance;
    }

    public void apply(View v, final View.AccessibilityDelegate arg, final View.AccessibilityDelegate old) {
      v.setAccessibilityDelegate(arg);
    }
  }

  private static final class AccessibilityLiveRegionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static AccessibilityLiveRegionFunc8567756a instance = null;

    public static AccessibilityLiveRegionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new AccessibilityLiveRegionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setAccessibilityLiveRegion(arg);
    }
  }

  private static final class ActivatedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ActivatedFunc148d6054 instance = null;

    public static ActivatedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ActivatedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setActivated(arg);
    }
  }

  private static final class ActivityFunccb86c57b implements Anvil.AttrFunc<Activity> {
    private static ActivityFunccb86c57b instance = null;

    public static ActivityFunccb86c57b getInstance() {
      if(instance == null) {
        instance = new ActivityFunccb86c57b();
      }
      return instance;
    }

    public void apply(View v, final Activity arg, final Activity old) {
      if (v instanceof FragmentBreadCrumbs) {
        ((FragmentBreadCrumbs) v).setActivity(arg);
      }
    }
  }

  private static final class AdapterFunc1b2776e4 implements Anvil.AttrFunc<Adapter> {
    private static AdapterFunc1b2776e4 instance = null;

    public static AdapterFunc1b2776e4 getInstance() {
      if(instance == null) {
        instance = new AdapterFunc1b2776e4();
      }
      return instance;
    }

    public void apply(View v, final Adapter arg, final Adapter old) {
      if (v instanceof AdapterView) {
        ((AdapterView) v).setAdapter(arg);
      }
    }
  }

  private static final class AdapterFunc9c589812 implements Anvil.AttrFunc<ExpandableListAdapter> {
    private static AdapterFunc9c589812 instance = null;

    public static AdapterFunc9c589812 getInstance() {
      if(instance == null) {
        instance = new AdapterFunc9c589812();
      }
      return instance;
    }

    public void apply(View v, final ExpandableListAdapter arg, final ExpandableListAdapter old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setAdapter(arg);
      }
    }
  }

  private static final class AddStatesFromChildrenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AddStatesFromChildrenFunc148d6054 instance = null;

    public static AddStatesFromChildrenFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AddStatesFromChildrenFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setAddStatesFromChildren(arg);
      }
    }
  }

  private static final class AdjustViewBoundsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AdjustViewBoundsFunc148d6054 instance = null;

    public static AdjustViewBoundsFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AdjustViewBoundsFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setAdjustViewBounds(arg);
      }
    }
  }

  private static final class AlignmentModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static AlignmentModeFunc8567756a instance = null;

    public static AlignmentModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new AlignmentModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setAlignmentMode(arg);
      }
    }
  }

  private static final class AllCapsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AllCapsFunc148d6054 instance = null;

    public static AllCapsFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AllCapsFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setAllCaps(arg);
      }
    }
  }

  private static final class AlphaFunce0893188 implements Anvil.AttrFunc<Float> {
    private static AlphaFunce0893188 instance = null;

    public static AlphaFunce0893188 getInstance() {
      if(instance == null) {
        instance = new AlphaFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setAlpha(arg);
    }
  }

  private static final class AlwaysDrawnWithCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AlwaysDrawnWithCacheEnabledFunc148d6054 instance = null;

    public static AlwaysDrawnWithCacheEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AlwaysDrawnWithCacheEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setAlwaysDrawnWithCacheEnabled(arg);
      }
    }
  }

  private static final class AnchorViewFunc6c3617af implements Anvil.AttrFunc<View> {
    private static AnchorViewFunc6c3617af instance = null;

    public static AnchorViewFunc6c3617af getInstance() {
      if(instance == null) {
        instance = new AnchorViewFunc6c3617af();
      }
      return instance;
    }

    public void apply(View v, final View arg, final View old) {
      if (v instanceof MediaController) {
        ((MediaController) v).setAnchorView(arg);
      }
    }
  }

  private static final class AnimateFirstViewFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AnimateFirstViewFunc148d6054 instance = null;

    public static AnimateFirstViewFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AnimateFirstViewFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setAnimateFirstView(arg);
      }
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setAnimateFirstView(arg);
      }
    }
  }

  private static final class AnimationFunc76cb7b50 implements Anvil.AttrFunc<Animation> {
    private static AnimationFunc76cb7b50 instance = null;

    public static AnimationFunc76cb7b50 getInstance() {
      if(instance == null) {
        instance = new AnimationFunc76cb7b50();
      }
      return instance;
    }

    public void apply(View v, final Animation arg, final Animation old) {
      v.setAnimation(arg);
    }
  }

  private static final class AnimationCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AnimationCacheEnabledFunc148d6054 instance = null;

    public static AnimationCacheEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AnimationCacheEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setAnimationCacheEnabled(arg);
      }
    }
  }

  private static final class AnimationDurationFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static AnimationDurationFunc8567756a instance = null;

    public static AnimationDurationFunc8567756a getInstance() {
      if(instance == null) {
        instance = new AnimationDurationFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setAnimationDuration(arg);
      }
    }
  }

  private static final class AutoLinkMaskFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static AutoLinkMaskFunc8567756a instance = null;

    public static AutoLinkMaskFunc8567756a getInstance() {
      if(instance == null) {
        instance = new AutoLinkMaskFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setAutoLinkMask(arg);
      }
    }
  }

  private static final class AutoStartFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static AutoStartFunc148d6054 instance = null;

    public static AutoStartFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new AutoStartFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AdapterViewFlipper) {
        ((AdapterViewFlipper) v).setAutoStart(arg);
      }
      if (v instanceof ViewFlipper) {
        ((ViewFlipper) v).setAutoStart(arg);
      }
    }
  }

  private static final class BackgroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static BackgroundFuncfb47464a instance = null;

    public static BackgroundFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new BackgroundFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      v.setBackground(arg);
    }
  }

  private static final class BackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static BackgroundColorFunc8567756a instance = null;

    public static BackgroundColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new BackgroundColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setBackgroundColor(arg);
    }
  }

  private static final class BackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static BackgroundResourceFunc8567756a instance = null;

    public static BackgroundResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new BackgroundResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setBackgroundResource(arg);
    }
  }

  private static final class BackgroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static BackgroundTintListFunc9e5e0e4e instance = null;

    public static BackgroundTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new BackgroundTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      v.setBackgroundTintList(arg);
    }
  }

  private static final class BackgroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static BackgroundTintModeFuncabb7a84e instance = null;

    public static BackgroundTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new BackgroundTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      v.setBackgroundTintMode(arg);
    }
  }

  private static final class BaseFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static BaseFunc17c521d0 instance = null;

    public static BaseFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new BaseFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof Chronometer) {
        ((Chronometer) v).setBase(arg);
      }
    }
  }

  private static final class BaselineFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static BaselineFunc8567756a instance = null;

    public static BaselineFunc8567756a getInstance() {
      if(instance == null) {
        instance = new BaselineFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setBaseline(arg);
      }
    }
  }

  private static final class BaselineAlignBottomFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static BaselineAlignBottomFunc148d6054 instance = null;

    public static BaselineAlignBottomFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new BaselineAlignBottomFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setBaselineAlignBottom(arg);
      }
    }
  }

  private static final class BaselineAlignedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static BaselineAlignedFunc148d6054 instance = null;

    public static BaselineAlignedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new BaselineAlignedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setBaselineAligned(arg);
      }
    }
  }

  private static final class BaselineAlignedChildIndexFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static BaselineAlignedChildIndexFunc8567756a instance = null;

    public static BaselineAlignedChildIndexFunc8567756a getInstance() {
      if(instance == null) {
        instance = new BaselineAlignedChildIndexFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setBaselineAlignedChildIndex(arg);
      }
    }
  }

  private static final class BottomFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static BottomFunc8567756a instance = null;

    public static BottomFunc8567756a getInstance() {
      if(instance == null) {
        instance = new BottomFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setBottom(arg);
    }
  }

  private static final class ButtonDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ButtonDrawableFuncfb47464a instance = null;

    public static ButtonDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ButtonDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonDrawable(arg);
      }
    }
  }

  private static final class ButtonDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ButtonDrawableFunc8567756a instance = null;

    public static ButtonDrawableFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ButtonDrawableFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonDrawable(arg);
      }
    }
  }

  private static final class ButtonTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static ButtonTintListFunc9e5e0e4e instance = null;

    public static ButtonTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new ButtonTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonTintList(arg);
      }
    }
  }

  private static final class ButtonTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static ButtonTintModeFuncabb7a84e instance = null;

    public static ButtonTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new ButtonTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonTintMode(arg);
      }
    }
  }

  private static final class CacheColorHintFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static CacheColorHintFunc8567756a instance = null;

    public static CacheColorHintFunc8567756a getInstance() {
      if(instance == null) {
        instance = new CacheColorHintFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setCacheColorHint(arg);
      }
    }
  }

  private static final class CalendarViewShownFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static CalendarViewShownFunc148d6054 instance = null;

    public static CalendarViewShownFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new CalendarViewShownFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof DatePicker) {
        ((DatePicker) v).setCalendarViewShown(arg);
      }
    }
  }

  private static final class CallbackFuncca7d3f09 implements Anvil.AttrFunc<TvView.TvInputCallback> {
    private static CallbackFuncca7d3f09 instance = null;

    public static CallbackFuncca7d3f09 getInstance() {
      if(instance == null) {
        instance = new CallbackFuncca7d3f09();
      }
      return instance;
    }

    public void apply(View v, final TvView.TvInputCallback arg, final TvView.TvInputCallback old) {
      if (v instanceof TvView) {
        ((TvView) v).setCallback(arg);
      }
    }
  }

  private static final class CallbackDuringFlingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static CallbackDuringFlingFunc148d6054 instance = null;

    public static CallbackDuringFlingFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new CallbackDuringFlingFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setCallbackDuringFling(arg);
      }
    }
  }

  private static final class CameraDistanceFunce0893188 implements Anvil.AttrFunc<Float> {
    private static CameraDistanceFunce0893188 instance = null;

    public static CameraDistanceFunce0893188 getInstance() {
      if(instance == null) {
        instance = new CameraDistanceFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setCameraDistance(arg);
    }
  }

  private static final class CaptionEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static CaptionEnabledFunc148d6054 instance = null;

    public static CaptionEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new CaptionEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TvView) {
        ((TvView) v).setCaptionEnabled(arg);
      }
    }
  }

  private static final class CheckMarkDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static CheckMarkDrawableFuncfb47464a instance = null;

    public static CheckMarkDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new CheckMarkDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkDrawable(arg);
      }
    }
  }

  private static final class CheckMarkDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static CheckMarkDrawableFunc8567756a instance = null;

    public static CheckMarkDrawableFunc8567756a getInstance() {
      if(instance == null) {
        instance = new CheckMarkDrawableFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkDrawable(arg);
      }
    }
  }

  private static final class CheckMarkTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static CheckMarkTintListFunc9e5e0e4e instance = null;

    public static CheckMarkTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new CheckMarkTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkTintList(arg);
      }
    }
  }

  private static final class CheckMarkTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static CheckMarkTintModeFuncabb7a84e instance = null;

    public static CheckMarkTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new CheckMarkTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkTintMode(arg);
      }
    }
  }

  private static final class CheckedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static CheckedFunc148d6054 instance = null;

    public static CheckedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new CheckedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setChecked(arg);
      }
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setChecked(arg);
      }
    }
  }

  private static final class ChildDividerFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ChildDividerFuncfb47464a instance = null;

    public static ChildDividerFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ChildDividerFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setChildDivider(arg);
      }
    }
  }

  private static final class ChildIndicatorFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ChildIndicatorFuncfb47464a instance = null;

    public static ChildIndicatorFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ChildIndicatorFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setChildIndicator(arg);
      }
    }
  }

  private static final class ChoiceModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ChoiceModeFunc8567756a instance = null;

    public static ChoiceModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ChoiceModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setChoiceMode(arg);
      }
    }
  }

  private static final class ClickableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ClickableFunc148d6054 instance = null;

    public static ClickableFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ClickableFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setClickable(arg);
    }
  }

  private static final class ClipBoundsFunc1cc93e48 implements Anvil.AttrFunc<Rect> {
    private static ClipBoundsFunc1cc93e48 instance = null;

    public static ClipBoundsFunc1cc93e48 getInstance() {
      if(instance == null) {
        instance = new ClipBoundsFunc1cc93e48();
      }
      return instance;
    }

    public void apply(View v, final Rect arg, final Rect old) {
      v.setClipBounds(arg);
    }
  }

  private static final class ClipChildrenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ClipChildrenFunc148d6054 instance = null;

    public static ClipChildrenFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ClipChildrenFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setClipChildren(arg);
      }
    }
  }

  private static final class ClipToOutlineFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ClipToOutlineFunc148d6054 instance = null;

    public static ClipToOutlineFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ClipToOutlineFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setClipToOutline(arg);
    }
  }

  private static final class ClipToPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ClipToPaddingFunc148d6054 instance = null;

    public static ClipToPaddingFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ClipToPaddingFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setClipToPadding(arg);
      }
    }
  }

  private static final class ColorFilterFunc6bb7b3d7 implements Anvil.AttrFunc<ColorFilter> {
    private static ColorFilterFunc6bb7b3d7 instance = null;

    public static ColorFilterFunc6bb7b3d7 getInstance() {
      if(instance == null) {
        instance = new ColorFilterFunc6bb7b3d7();
      }
      return instance;
    }

    public void apply(View v, final ColorFilter arg, final ColorFilter old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setColorFilter(arg);
      }
    }
  }

  private static final class ColorFilterFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ColorFilterFunc8567756a instance = null;

    public static ColorFilterFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ColorFilterFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setColorFilter(arg);
      }
    }
  }

  private static final class ColumnCountFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ColumnCountFunc8567756a instance = null;

    public static ColumnCountFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ColumnCountFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setColumnCount(arg);
      }
    }
  }

  private static final class ColumnOrderPreservedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ColumnOrderPreservedFunc148d6054 instance = null;

    public static ColumnOrderPreservedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ColumnOrderPreservedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setColumnOrderPreserved(arg);
      }
    }
  }

  private static final class ColumnWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ColumnWidthFunc8567756a instance = null;

    public static ColumnWidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ColumnWidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setColumnWidth(arg);
      }
    }
  }

  private static final class CompletionHintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static CompletionHintFuncc0af808b instance = null;

    public static CompletionHintFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new CompletionHintFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setCompletionHint(arg);
      }
    }
  }

  private static final class CompoundDrawablePaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static CompoundDrawablePaddingFunc8567756a instance = null;

    public static CompoundDrawablePaddingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new CompoundDrawablePaddingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setCompoundDrawablePadding(arg);
      }
    }
  }

  private static final class ContentDescriptionFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static ContentDescriptionFuncc0af808b instance = null;

    public static ContentDescriptionFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new ContentDescriptionFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      v.setContentDescription(arg);
    }
  }

  private static final class CropToPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static CropToPaddingFunc148d6054 instance = null;

    public static CropToPaddingFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new CropToPaddingFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setCropToPadding(arg);
      }
    }
  }

  private static final class CurrentHourFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static CurrentHourFunc8567756a instance = null;

    public static CurrentHourFunc8567756a getInstance() {
      if(instance == null) {
        instance = new CurrentHourFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TimePicker) {
        ((TimePicker) v).setCurrentHour(arg);
      }
    }
  }

  private static final class CurrentMinuteFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static CurrentMinuteFunc8567756a instance = null;

    public static CurrentMinuteFunc8567756a getInstance() {
      if(instance == null) {
        instance = new CurrentMinuteFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TimePicker) {
        ((TimePicker) v).setCurrentMinute(arg);
      }
    }
  }

  private static final class CurrentTabFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static CurrentTabFunc8567756a instance = null;

    public static CurrentTabFunc8567756a getInstance() {
      if(instance == null) {
        instance = new CurrentTabFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabHost) {
        ((TabHost) v).setCurrentTab(arg);
      }
      if (v instanceof TabWidget) {
        ((TabWidget) v).setCurrentTab(arg);
      }
    }
  }

  private static final class CurrentTabByTagFunc473e3665 implements Anvil.AttrFunc<String> {
    private static CurrentTabByTagFunc473e3665 instance = null;

    public static CurrentTabByTagFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new CurrentTabByTagFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TabHost) {
        ((TabHost) v).setCurrentTabByTag(arg);
      }
    }
  }

  private static final class CurrentTextFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static CurrentTextFuncc0af808b instance = null;

    public static CurrentTextFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new CurrentTextFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextSwitcher) {
        ((TextSwitcher) v).setCurrentText(arg);
      }
    }
  }

  private static final class CursorVisibleFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static CursorVisibleFunc148d6054 instance = null;

    public static CursorVisibleFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new CursorVisibleFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setCursorVisible(arg);
      }
    }
  }

  private static final class CustomSelectionActionModeCallbackFunc57558b70 implements Anvil.AttrFunc<ActionMode.Callback> {
    private static CustomSelectionActionModeCallbackFunc57558b70 instance = null;

    public static CustomSelectionActionModeCallbackFunc57558b70 getInstance() {
      if(instance == null) {
        instance = new CustomSelectionActionModeCallbackFunc57558b70();
      }
      return instance;
    }

    public void apply(View v, final ActionMode.Callback arg, final ActionMode.Callback old) {
      if (v instanceof TextView) {
        ((TextView) v).setCustomSelectionActionModeCallback(arg);
      }
    }
  }

  private static final class DateFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static DateFunc17c521d0 instance = null;

    public static DateFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new DateFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setDate(arg);
      }
    }
  }

  private static final class DateTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DateTextAppearanceFunc8567756a instance = null;

    public static DateTextAppearanceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DateTextAppearanceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setDateTextAppearance(arg);
      }
    }
  }

  private static final class DebugFlagsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DebugFlagsFunc8567756a instance = null;

    public static DebugFlagsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DebugFlagsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setDebugFlags(arg);
      }
    }
  }

  private static final class DescendantFocusabilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DescendantFocusabilityFunc8567756a instance = null;

    public static DescendantFocusabilityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DescendantFocusabilityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setDescendantFocusability(arg);
      }
    }
  }

  private static final class DigitsWatcherFuncb32320d implements Anvil.AttrFunc<TextWatcher> {
    private static DigitsWatcherFuncb32320d instance = null;

    public static DigitsWatcherFuncb32320d getInstance() {
      if(instance == null) {
        instance = new DigitsWatcherFuncb32320d();
      }
      return instance;
    }

    public void apply(View v, final TextWatcher arg, final TextWatcher old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setDigitsWatcher(arg);
      }
    }
  }

  private static final class DisplayedChildFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DisplayedChildFunc8567756a instance = null;

    public static DisplayedChildFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DisplayedChildFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setDisplayedChild(arg);
      }
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setDisplayedChild(arg);
      }
    }
  }

  private static final class DisplayedValuesFunc708a3c87 implements Anvil.AttrFunc<String[]> {
    private static DisplayedValuesFunc708a3c87 instance = null;

    public static DisplayedValuesFunc708a3c87 getInstance() {
      if(instance == null) {
        instance = new DisplayedValuesFunc708a3c87();
      }
      return instance;
    }

    public void apply(View v, final String[] arg, final String[] old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setDisplayedValues(arg);
      }
    }
  }

  private static final class DividerFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static DividerFuncfb47464a instance = null;

    public static DividerFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new DividerFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ListView) {
        ((ListView) v).setDivider(arg);
      }
    }
  }

  private static final class DividerDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static DividerDrawableFuncfb47464a instance = null;

    public static DividerDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new DividerDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setDividerDrawable(arg);
      }
    }
  }

  private static final class DividerDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DividerDrawableFunc8567756a instance = null;

    public static DividerDrawableFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DividerDrawableFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setDividerDrawable(arg);
      }
    }
  }

  private static final class DividerHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DividerHeightFunc8567756a instance = null;

    public static DividerHeightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DividerHeightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ListView) {
        ((ListView) v).setDividerHeight(arg);
      }
    }
  }

  private static final class DividerPaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DividerPaddingFunc8567756a instance = null;

    public static DividerPaddingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DividerPaddingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setDividerPadding(arg);
      }
    }
  }

  private static final class DownloadListenerFunc34ae5869 implements Anvil.AttrFunc<DownloadListener> {
    private static DownloadListenerFunc34ae5869 instance = null;

    public static DownloadListenerFunc34ae5869 getInstance() {
      if(instance == null) {
        instance = new DownloadListenerFunc34ae5869();
      }
      return instance;
    }

    public void apply(View v, final DownloadListener arg, final DownloadListener old) {
      if (v instanceof WebView) {
        ((WebView) v).setDownloadListener(arg);
      }
    }
  }

  private static final class DrawSelectorOnTopFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static DrawSelectorOnTopFunc148d6054 instance = null;

    public static DrawSelectorOnTopFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new DrawSelectorOnTopFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setDrawSelectorOnTop(arg);
      }
    }
  }

  private static final class DrawingCacheBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DrawingCacheBackgroundColorFunc8567756a instance = null;

    public static DrawingCacheBackgroundColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DrawingCacheBackgroundColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setDrawingCacheBackgroundColor(arg);
    }
  }

  private static final class DrawingCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static DrawingCacheEnabledFunc148d6054 instance = null;

    public static DrawingCacheEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new DrawingCacheEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setDrawingCacheEnabled(arg);
    }
  }

  private static final class DrawingCacheQualityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DrawingCacheQualityFunc8567756a instance = null;

    public static DrawingCacheQualityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DrawingCacheQualityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setDrawingCacheQuality(arg);
    }
  }

  private static final class DropDownAnchorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DropDownAnchorFunc8567756a instance = null;

    public static DropDownAnchorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DropDownAnchorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownAnchor(arg);
      }
    }
  }

  private static final class DropDownBackgroundDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static DropDownBackgroundDrawableFuncfb47464a instance = null;

    public static DropDownBackgroundDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new DropDownBackgroundDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownBackgroundDrawable(arg);
      }
    }
  }

  private static final class DropDownBackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DropDownBackgroundResourceFunc8567756a instance = null;

    public static DropDownBackgroundResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DropDownBackgroundResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownBackgroundResource(arg);
      }
    }
  }

  private static final class DropDownHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DropDownHeightFunc8567756a instance = null;

    public static DropDownHeightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DropDownHeightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownHeight(arg);
      }
    }
  }

  private static final class DropDownHorizontalOffsetFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DropDownHorizontalOffsetFunc8567756a instance = null;

    public static DropDownHorizontalOffsetFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DropDownHorizontalOffsetFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownHorizontalOffset(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setDropDownHorizontalOffset(arg);
      }
    }
  }

  private static final class DropDownVerticalOffsetFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DropDownVerticalOffsetFunc8567756a instance = null;

    public static DropDownVerticalOffsetFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DropDownVerticalOffsetFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownVerticalOffset(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setDropDownVerticalOffset(arg);
      }
    }
  }

  private static final class DropDownWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static DropDownWidthFunc8567756a instance = null;

    public static DropDownWidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new DropDownWidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownWidth(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setDropDownWidth(arg);
      }
    }
  }

  private static final class DuplicateParentStateEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static DuplicateParentStateEnabledFunc148d6054 instance = null;

    public static DuplicateParentStateEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new DuplicateParentStateEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setDuplicateParentStateEnabled(arg);
    }
  }

  private static final class EGLConfigChooserFuncb283fdb0 implements Anvil.AttrFunc<GLSurfaceView.EGLConfigChooser> {
    private static EGLConfigChooserFuncb283fdb0 instance = null;

    public static EGLConfigChooserFuncb283fdb0 getInstance() {
      if(instance == null) {
        instance = new EGLConfigChooserFuncb283fdb0();
      }
      return instance;
    }

    public void apply(View v, final GLSurfaceView.EGLConfigChooser arg, final GLSurfaceView.EGLConfigChooser old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLConfigChooser(arg);
      }
    }
  }

  private static final class EGLConfigChooserFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static EGLConfigChooserFunc148d6054 instance = null;

    public static EGLConfigChooserFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new EGLConfigChooserFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLConfigChooser(arg);
      }
    }
  }

  private static final class EGLContextClientVersionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static EGLContextClientVersionFunc8567756a instance = null;

    public static EGLContextClientVersionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new EGLContextClientVersionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLContextClientVersion(arg);
      }
    }
  }

  private static final class EGLContextFactoryFunc8cdc7924 implements Anvil.AttrFunc<GLSurfaceView.EGLContextFactory> {
    private static EGLContextFactoryFunc8cdc7924 instance = null;

    public static EGLContextFactoryFunc8cdc7924 getInstance() {
      if(instance == null) {
        instance = new EGLContextFactoryFunc8cdc7924();
      }
      return instance;
    }

    public void apply(View v, final GLSurfaceView.EGLContextFactory arg, final GLSurfaceView.EGLContextFactory old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLContextFactory(arg);
      }
    }
  }

  private static final class EGLWindowSurfaceFactoryFunc204911b6 implements Anvil.AttrFunc<GLSurfaceView.EGLWindowSurfaceFactory> {
    private static EGLWindowSurfaceFactoryFunc204911b6 instance = null;

    public static EGLWindowSurfaceFactoryFunc204911b6 getInstance() {
      if(instance == null) {
        instance = new EGLWindowSurfaceFactoryFunc204911b6();
      }
      return instance;
    }

    public void apply(View v, final GLSurfaceView.EGLWindowSurfaceFactory arg, final GLSurfaceView.EGLWindowSurfaceFactory old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLWindowSurfaceFactory(arg);
      }
    }
  }

  private static final class EditableFactoryFunc1efa17e2 implements Anvil.AttrFunc<Editable.Factory> {
    private static EditableFactoryFunc1efa17e2 instance = null;

    public static EditableFactoryFunc1efa17e2 getInstance() {
      if(instance == null) {
        instance = new EditableFactoryFunc1efa17e2();
      }
      return instance;
    }

    public void apply(View v, final Editable.Factory arg, final Editable.Factory old) {
      if (v instanceof TextView) {
        ((TextView) v).setEditableFactory(arg);
      }
    }
  }

  private static final class ElegantTextHeightFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ElegantTextHeightFunc148d6054 instance = null;

    public static ElegantTextHeightFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ElegantTextHeightFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setElegantTextHeight(arg);
      }
    }
  }

  private static final class ElevationFunce0893188 implements Anvil.AttrFunc<Float> {
    private static ElevationFunce0893188 instance = null;

    public static ElevationFunce0893188 getInstance() {
      if(instance == null) {
        instance = new ElevationFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setElevation(arg);
    }
  }

  private static final class EllipsizeFunc63cb4885 implements Anvil.AttrFunc<TextUtils.TruncateAt> {
    private static EllipsizeFunc63cb4885 instance = null;

    public static EllipsizeFunc63cb4885 getInstance() {
      if(instance == null) {
        instance = new EllipsizeFunc63cb4885();
      }
      return instance;
    }

    public void apply(View v, final TextUtils.TruncateAt arg, final TextUtils.TruncateAt old) {
      if (v instanceof TextView) {
        ((TextView) v).setEllipsize(arg);
      }
    }
  }

  private static final class EmptyViewFunc6c3617af implements Anvil.AttrFunc<View> {
    private static EmptyViewFunc6c3617af instance = null;

    public static EmptyViewFunc6c3617af getInstance() {
      if(instance == null) {
        instance = new EmptyViewFunc6c3617af();
      }
      return instance;
    }

    public void apply(View v, final View arg, final View old) {
      if (v instanceof AdapterView) {
        ((AdapterView) v).setEmptyView(arg);
      }
    }
  }

  private static final class EmsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static EmsFunc8567756a instance = null;

    public static EmsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new EmsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setEms(arg);
      }
    }
  }

  private static final class EnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static EnabledFunc148d6054 instance = null;

    public static EnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new EnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setEnabled(arg);
    }
  }

  private static final class ErrorFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static ErrorFuncc0af808b instance = null;

    public static ErrorFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new ErrorFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextView) {
        ((TextView) v).setError(arg);
      }
    }
  }

  private static final class EventsInterceptionEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static EventsInterceptionEnabledFunc148d6054 instance = null;

    public static EventsInterceptionEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new EventsInterceptionEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setEventsInterceptionEnabled(arg);
      }
    }
  }

  private static final class ExcludeMimesFunc708a3c87 implements Anvil.AttrFunc<String[]> {
    private static ExcludeMimesFunc708a3c87 instance = null;

    public static ExcludeMimesFunc708a3c87 getInstance() {
      if(instance == null) {
        instance = new ExcludeMimesFunc708a3c87();
      }
      return instance;
    }

    public void apply(View v, final String[] arg, final String[] old) {
      if (v instanceof QuickContactBadge) {
        ((QuickContactBadge) v).setExcludeMimes(arg);
      }
    }
  }

  private static final class ExtendedSettingsClickListenerFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    private static ExtendedSettingsClickListenerFunc79a13a5e instance = null;

    public static ExtendedSettingsClickListenerFunc79a13a5e getInstance() {
      if(instance == null) {
        instance = new ExtendedSettingsClickListenerFunc79a13a5e();
      }
      return instance;
    }

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof MediaRouteButton) {
        ((MediaRouteButton) v).setExtendedSettingsClickListener(arg);
      }
    }
  }

  private static final class ExtractedTextFunc410b6fe0 implements Anvil.AttrFunc<ExtractedText> {
    private static ExtractedTextFunc410b6fe0 instance = null;

    public static ExtractedTextFunc410b6fe0 getInstance() {
      if(instance == null) {
        instance = new ExtractedTextFunc410b6fe0();
      }
      return instance;
    }

    public void apply(View v, final ExtractedText arg, final ExtractedText old) {
      if (v instanceof TextView) {
        ((TextView) v).setExtractedText(arg);
      }
    }
  }

  private static final class FactoryFunc6a48ea48 implements Anvil.AttrFunc<ViewSwitcher.ViewFactory> {
    private static FactoryFunc6a48ea48 instance = null;

    public static FactoryFunc6a48ea48 getInstance() {
      if(instance == null) {
        instance = new FactoryFunc6a48ea48();
      }
      return instance;
    }

    public void apply(View v, final ViewSwitcher.ViewFactory arg, final ViewSwitcher.ViewFactory old) {
      if (v instanceof ViewSwitcher) {
        ((ViewSwitcher) v).setFactory(arg);
      }
    }
  }

  private static final class FadeEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FadeEnabledFunc148d6054 instance = null;

    public static FadeEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FadeEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setFadeEnabled(arg);
      }
    }
  }

  private static final class FadeOffsetFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static FadeOffsetFunc17c521d0 instance = null;

    public static FadeOffsetFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new FadeOffsetFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setFadeOffset(arg);
      }
    }
  }

  private static final class FadingEdgeLengthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static FadingEdgeLengthFunc8567756a instance = null;

    public static FadingEdgeLengthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new FadingEdgeLengthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setFadingEdgeLength(arg);
    }
  }

  private static final class FastScrollAlwaysVisibleFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FastScrollAlwaysVisibleFunc148d6054 instance = null;

    public static FastScrollAlwaysVisibleFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FastScrollAlwaysVisibleFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFastScrollAlwaysVisible(arg);
      }
    }
  }

  private static final class FastScrollEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FastScrollEnabledFunc148d6054 instance = null;

    public static FastScrollEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FastScrollEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFastScrollEnabled(arg);
      }
    }
  }

  private static final class FastScrollStyleFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static FastScrollStyleFunc8567756a instance = null;

    public static FastScrollStyleFunc8567756a getInstance() {
      if(instance == null) {
        instance = new FastScrollStyleFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFastScrollStyle(arg);
      }
    }
  }

  private static final class FillViewportFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FillViewportFunc148d6054 instance = null;

    public static FillViewportFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FillViewportFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof HorizontalScrollView) {
        ((HorizontalScrollView) v).setFillViewport(arg);
      }
      if (v instanceof ScrollView) {
        ((ScrollView) v).setFillViewport(arg);
      }
    }
  }

  private static final class FilterTextFunc473e3665 implements Anvil.AttrFunc<String> {
    private static FilterTextFunc473e3665 instance = null;

    public static FilterTextFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new FilterTextFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFilterText(arg);
      }
    }
  }

  private static final class FilterTouchesWhenObscuredFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FilterTouchesWhenObscuredFunc148d6054 instance = null;

    public static FilterTouchesWhenObscuredFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FilterTouchesWhenObscuredFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFilterTouchesWhenObscured(arg);
    }
  }

  private static final class FilterWatcherFuncb32320d implements Anvil.AttrFunc<TextWatcher> {
    private static FilterWatcherFuncb32320d instance = null;

    public static FilterWatcherFuncb32320d getInstance() {
      if(instance == null) {
        instance = new FilterWatcherFuncb32320d();
      }
      return instance;
    }

    public void apply(View v, final TextWatcher arg, final TextWatcher old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setFilterWatcher(arg);
      }
    }
  }

  private static final class FiltersFuncfb505582 implements Anvil.AttrFunc<InputFilter[]> {
    private static FiltersFuncfb505582 instance = null;

    public static FiltersFuncfb505582 getInstance() {
      if(instance == null) {
        instance = new FiltersFuncfb505582();
      }
      return instance;
    }

    public void apply(View v, final InputFilter[] arg, final InputFilter[] old) {
      if (v instanceof TextView) {
        ((TextView) v).setFilters(arg);
      }
    }
  }

  private static final class FindListenerFunc28f7f5ef implements Anvil.AttrFunc<WebView.FindListener> {
    private static FindListenerFunc28f7f5ef instance = null;

    public static FindListenerFunc28f7f5ef getInstance() {
      if(instance == null) {
        instance = new FindListenerFunc28f7f5ef();
      }
      return instance;
    }

    public void apply(View v, final WebView.FindListener arg, final WebView.FindListener old) {
      if (v instanceof WebView) {
        ((WebView) v).setFindListener(arg);
      }
    }
  }

  private static final class FirstDayOfWeekFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static FirstDayOfWeekFunc8567756a instance = null;

    public static FirstDayOfWeekFunc8567756a getInstance() {
      if(instance == null) {
        instance = new FirstDayOfWeekFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setFirstDayOfWeek(arg);
      }
      if (v instanceof DatePicker) {
        ((DatePicker) v).setFirstDayOfWeek(arg);
      }
    }
  }

  private static final class FitsSystemWindowsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FitsSystemWindowsFunc148d6054 instance = null;

    public static FitsSystemWindowsFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FitsSystemWindowsFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFitsSystemWindows(arg);
    }
  }

  private static final class FlipIntervalFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static FlipIntervalFunc8567756a instance = null;

    public static FlipIntervalFunc8567756a getInstance() {
      if(instance == null) {
        instance = new FlipIntervalFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AdapterViewFlipper) {
        ((AdapterViewFlipper) v).setFlipInterval(arg);
      }
      if (v instanceof ViewFlipper) {
        ((ViewFlipper) v).setFlipInterval(arg);
      }
    }
  }

  private static final class FocusableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FocusableFunc148d6054 instance = null;

    public static FocusableFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FocusableFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFocusable(arg);
    }
  }

  private static final class FocusableInTouchModeFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FocusableInTouchModeFunc148d6054 instance = null;

    public static FocusableInTouchModeFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FocusableInTouchModeFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFocusableInTouchMode(arg);
    }
  }

  private static final class FocusedMonthDateColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static FocusedMonthDateColorFunc8567756a instance = null;

    public static FocusedMonthDateColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new FocusedMonthDateColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setFocusedMonthDateColor(arg);
      }
    }
  }

  private static final class FontFeatureSettingsFunc473e3665 implements Anvil.AttrFunc<String> {
    private static FontFeatureSettingsFunc473e3665 instance = null;

    public static FontFeatureSettingsFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new FontFeatureSettingsFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TextView) {
        ((TextView) v).setFontFeatureSettings(arg);
      }
    }
  }

  private static final class FooterDividersEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FooterDividersEnabledFunc148d6054 instance = null;

    public static FooterDividersEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FooterDividersEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ListView) {
        ((ListView) v).setFooterDividersEnabled(arg);
      }
    }
  }

  private static final class ForegroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ForegroundFuncfb47464a instance = null;

    public static ForegroundFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ForegroundFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForeground(arg);
      }
    }
  }

  private static final class ForegroundGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ForegroundGravityFunc8567756a instance = null;

    public static ForegroundGravityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ForegroundGravityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForegroundGravity(arg);
      }
    }
  }

  private static final class ForegroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static ForegroundTintListFunc9e5e0e4e instance = null;

    public static ForegroundTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new ForegroundTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForegroundTintList(arg);
      }
    }
  }

  private static final class ForegroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static ForegroundTintModeFuncabb7a84e instance = null;

    public static ForegroundTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new ForegroundTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForegroundTintMode(arg);
      }
    }
  }

  private static final class FormatFunc473e3665 implements Anvil.AttrFunc<String> {
    private static FormatFunc473e3665 instance = null;

    public static FormatFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new FormatFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof Chronometer) {
        ((Chronometer) v).setFormat(arg);
      }
    }
  }

  private static final class Format12HourFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static Format12HourFuncc0af808b instance = null;

    public static Format12HourFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new Format12HourFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextClock) {
        ((TextClock) v).setFormat12Hour(arg);
      }
    }
  }

  private static final class Format24HourFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static Format24HourFuncc0af808b instance = null;

    public static Format24HourFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new Format24HourFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextClock) {
        ((TextClock) v).setFormat24Hour(arg);
      }
    }
  }

  private static final class FormatterFunc5e27b07e implements Anvil.AttrFunc<NumberPicker.Formatter> {
    private static FormatterFunc5e27b07e instance = null;

    public static FormatterFunc5e27b07e getInstance() {
      if(instance == null) {
        instance = new FormatterFunc5e27b07e();
      }
      return instance;
    }

    public void apply(View v, final NumberPicker.Formatter arg, final NumberPicker.Formatter old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setFormatter(arg);
      }
    }
  }

  private static final class FreezesTextFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static FreezesTextFunc148d6054 instance = null;

    public static FreezesTextFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new FreezesTextFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setFreezesText(arg);
      }
    }
  }

  private static final class FrictionFunce0893188 implements Anvil.AttrFunc<Float> {
    private static FrictionFunce0893188 instance = null;

    public static FrictionFunce0893188 getInstance() {
      if(instance == null) {
        instance = new FrictionFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFriction(arg);
      }
    }
  }

  private static final class GLWrapperFunc9520092d implements Anvil.AttrFunc<GLSurfaceView.GLWrapper> {
    private static GLWrapperFunc9520092d instance = null;

    public static GLWrapperFunc9520092d getInstance() {
      if(instance == null) {
        instance = new GLWrapperFunc9520092d();
      }
      return instance;
    }

    public void apply(View v, final GLSurfaceView.GLWrapper arg, final GLSurfaceView.GLWrapper old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setGLWrapper(arg);
      }
    }
  }

  private static final class GestureFunc15eb6005 implements Anvil.AttrFunc<Gesture> {
    private static GestureFunc15eb6005 instance = null;

    public static GestureFunc15eb6005 getInstance() {
      if(instance == null) {
        instance = new GestureFunc15eb6005();
      }
      return instance;
    }

    public void apply(View v, final Gesture arg, final Gesture old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGesture(arg);
      }
    }
  }

  private static final class GestureColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static GestureColorFunc8567756a instance = null;

    public static GestureColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new GestureColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureColor(arg);
      }
    }
  }

  private static final class GestureStrokeAngleThresholdFunce0893188 implements Anvil.AttrFunc<Float> {
    private static GestureStrokeAngleThresholdFunce0893188 instance = null;

    public static GestureStrokeAngleThresholdFunce0893188 getInstance() {
      if(instance == null) {
        instance = new GestureStrokeAngleThresholdFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeAngleThreshold(arg);
      }
    }
  }

  private static final class GestureStrokeLengthThresholdFunce0893188 implements Anvil.AttrFunc<Float> {
    private static GestureStrokeLengthThresholdFunce0893188 instance = null;

    public static GestureStrokeLengthThresholdFunce0893188 getInstance() {
      if(instance == null) {
        instance = new GestureStrokeLengthThresholdFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeLengthThreshold(arg);
      }
    }
  }

  private static final class GestureStrokeSquarenessTresholdFunce0893188 implements Anvil.AttrFunc<Float> {
    private static GestureStrokeSquarenessTresholdFunce0893188 instance = null;

    public static GestureStrokeSquarenessTresholdFunce0893188 getInstance() {
      if(instance == null) {
        instance = new GestureStrokeSquarenessTresholdFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeSquarenessTreshold(arg);
      }
    }
  }

  private static final class GestureStrokeTypeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static GestureStrokeTypeFunc8567756a instance = null;

    public static GestureStrokeTypeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new GestureStrokeTypeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeType(arg);
      }
    }
  }

  private static final class GestureStrokeWidthFunce0893188 implements Anvil.AttrFunc<Float> {
    private static GestureStrokeWidthFunce0893188 instance = null;

    public static GestureStrokeWidthFunce0893188 getInstance() {
      if(instance == null) {
        instance = new GestureStrokeWidthFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeWidth(arg);
      }
    }
  }

  private static final class GestureVisibleFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static GestureVisibleFunc148d6054 instance = null;

    public static GestureVisibleFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new GestureVisibleFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureVisible(arg);
      }
    }
  }

  private static final class GravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static GravityFunc8567756a instance = null;

    public static GravityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new GravityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setGravity(arg);
      }
      if (v instanceof GridView) {
        ((GridView) v).setGravity(arg);
      }
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setGravity(arg);
      }
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setGravity(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setGravity(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setGravity(arg);
      }
    }
  }

  private static final class GroupIndicatorFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static GroupIndicatorFuncfb47464a instance = null;

    public static GroupIndicatorFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new GroupIndicatorFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setGroupIndicator(arg);
      }
    }
  }

  private static final class HapticFeedbackEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HapticFeedbackEnabledFunc148d6054 instance = null;

    public static HapticFeedbackEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HapticFeedbackEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHapticFeedbackEnabled(arg);
    }
  }

  private static final class HasTransientStateFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HasTransientStateFunc148d6054 instance = null;

    public static HasTransientStateFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HasTransientStateFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHasTransientState(arg);
    }
  }

  private static final class HeaderDividersEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HeaderDividersEnabledFunc148d6054 instance = null;

    public static HeaderDividersEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HeaderDividersEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ListView) {
        ((ListView) v).setHeaderDividersEnabled(arg);
      }
    }
  }

  private static final class HeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static HeightFunc8567756a instance = null;

    public static HeightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new HeightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHeight(arg);
      }
    }
  }

  private static final class HighlightColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static HighlightColorFunc8567756a instance = null;

    public static HighlightColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new HighlightColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHighlightColor(arg);
      }
    }
  }

  private static final class HintFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static HintFunc8567756a instance = null;

    public static HintFunc8567756a getInstance() {
      if(instance == null) {
        instance = new HintFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHint(arg);
      }
    }
  }

  private static final class HintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static HintFuncc0af808b instance = null;

    public static HintFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new HintFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextView) {
        ((TextView) v).setHint(arg);
      }
    }
  }

  private static final class HintTextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static HintTextColorFunc9e5e0e4e instance = null;

    public static HintTextColorFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new HintTextColorFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TextView) {
        ((TextView) v).setHintTextColor(arg);
      }
    }
  }

  private static final class HintTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static HintTextColorFunc8567756a instance = null;

    public static HintTextColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new HintTextColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHintTextColor(arg);
      }
    }
  }

  private static final class HorizontalFadingEdgeEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HorizontalFadingEdgeEnabledFunc148d6054 instance = null;

    public static HorizontalFadingEdgeEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HorizontalFadingEdgeEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHorizontalFadingEdgeEnabled(arg);
    }
  }

  private static final class HorizontalGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static HorizontalGravityFunc8567756a instance = null;

    public static HorizontalGravityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new HorizontalGravityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setHorizontalGravity(arg);
      }
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setHorizontalGravity(arg);
      }
    }
  }

  private static final class HorizontalScrollBarEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HorizontalScrollBarEnabledFunc148d6054 instance = null;

    public static HorizontalScrollBarEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HorizontalScrollBarEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHorizontalScrollBarEnabled(arg);
    }
  }

  private static final class HorizontalScrollbarOverlayFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HorizontalScrollbarOverlayFunc148d6054 instance = null;

    public static HorizontalScrollbarOverlayFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HorizontalScrollbarOverlayFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setHorizontalScrollbarOverlay(arg);
      }
    }
  }

  private static final class HorizontalSpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static HorizontalSpacingFunc8567756a instance = null;

    public static HorizontalSpacingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new HorizontalSpacingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setHorizontalSpacing(arg);
      }
    }
  }

  private static final class HorizontallyScrollingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HorizontallyScrollingFunc148d6054 instance = null;

    public static HorizontallyScrollingFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HorizontallyScrollingFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setHorizontallyScrolling(arg);
      }
    }
  }

  private static final class HoveredFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static HoveredFunc148d6054 instance = null;

    public static HoveredFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new HoveredFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHovered(arg);
    }
  }

  private static final class IconifiedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IconifiedFunc148d6054 instance = null;

    public static IconifiedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IconifiedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setIconified(arg);
      }
    }
  }

  private static final class IconifiedByDefaultFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IconifiedByDefaultFunc148d6054 instance = null;

    public static IconifiedByDefaultFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IconifiedByDefaultFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setIconifiedByDefault(arg);
      }
    }
  }

  private static final class IdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static IdFunc8567756a instance = null;

    public static IdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new IdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setId(arg);
    }
  }

  private static final class IgnoreGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static IgnoreGravityFunc8567756a instance = null;

    public static IgnoreGravityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new IgnoreGravityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setIgnoreGravity(arg);
      }
    }
  }

  private static final class ImageAlphaFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ImageAlphaFunc8567756a instance = null;

    public static ImageAlphaFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ImageAlphaFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageAlpha(arg);
      }
    }
  }

  private static final class ImageBitmapFuncf4654c93 implements Anvil.AttrFunc<Bitmap> {
    private static ImageBitmapFuncf4654c93 instance = null;

    public static ImageBitmapFuncf4654c93 getInstance() {
      if(instance == null) {
        instance = new ImageBitmapFuncf4654c93();
      }
      return instance;
    }

    public void apply(View v, final Bitmap arg, final Bitmap old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageBitmap(arg);
      }
    }
  }

  private static final class ImageDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ImageDrawableFuncfb47464a instance = null;

    public static ImageDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ImageDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ImageSwitcher) {
        ((ImageSwitcher) v).setImageDrawable(arg);
      }
      if (v instanceof ImageView) {
        ((ImageView) v).setImageDrawable(arg);
      }
    }
  }

  private static final class ImageLevelFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ImageLevelFunc8567756a instance = null;

    public static ImageLevelFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ImageLevelFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageLevel(arg);
      }
    }
  }

  private static final class ImageMatrixFunc6b9f325 implements Anvil.AttrFunc<Matrix> {
    private static ImageMatrixFunc6b9f325 instance = null;

    public static ImageMatrixFunc6b9f325 getInstance() {
      if(instance == null) {
        instance = new ImageMatrixFunc6b9f325();
      }
      return instance;
    }

    public void apply(View v, final Matrix arg, final Matrix old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageMatrix(arg);
      }
    }
  }

  private static final class ImageResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ImageResourceFunc8567756a instance = null;

    public static ImageResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ImageResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageSwitcher) {
        ((ImageSwitcher) v).setImageResource(arg);
      }
      if (v instanceof ImageView) {
        ((ImageView) v).setImageResource(arg);
      }
    }
  }

  private static final class ImageTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static ImageTintListFunc9e5e0e4e instance = null;

    public static ImageTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new ImageTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageTintList(arg);
      }
    }
  }

  private static final class ImageTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static ImageTintModeFuncabb7a84e instance = null;

    public static ImageTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new ImageTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageTintMode(arg);
      }
    }
  }

  private static final class ImageURIFunc75f430fc implements Anvil.AttrFunc<Uri> {
    private static ImageURIFunc75f430fc instance = null;

    public static ImageURIFunc75f430fc getInstance() {
      if(instance == null) {
        instance = new ImageURIFunc75f430fc();
      }
      return instance;
    }

    public void apply(View v, final Uri arg, final Uri old) {
      if (v instanceof ImageSwitcher) {
        ((ImageSwitcher) v).setImageURI(arg);
      }
      if (v instanceof ImageView) {
        ((ImageView) v).setImageURI(arg);
      }
    }
  }

  private static final class ImeOptionsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ImeOptionsFunc8567756a instance = null;

    public static ImeOptionsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ImeOptionsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setImeOptions(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setImeOptions(arg);
      }
    }
  }

  private static final class ImportantForAccessibilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ImportantForAccessibilityFunc8567756a instance = null;

    public static ImportantForAccessibilityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ImportantForAccessibilityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setImportantForAccessibility(arg);
    }
  }

  private static final class InAnimationFunc9a08bdaf implements Anvil.AttrFunc<ObjectAnimator> {
    private static InAnimationFunc9a08bdaf instance = null;

    public static InAnimationFunc9a08bdaf getInstance() {
      if(instance == null) {
        instance = new InAnimationFunc9a08bdaf();
      }
      return instance;
    }

    public void apply(View v, final ObjectAnimator arg, final ObjectAnimator old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setInAnimation(arg);
      }
    }
  }

  private static final class InAnimationFunc76cb7b50 implements Anvil.AttrFunc<Animation> {
    private static InAnimationFunc76cb7b50 instance = null;

    public static InAnimationFunc76cb7b50 getInstance() {
      if(instance == null) {
        instance = new InAnimationFunc76cb7b50();
      }
      return instance;
    }

    public void apply(View v, final Animation arg, final Animation old) {
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setInAnimation(arg);
      }
    }
  }

  private static final class IncludeFontPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IncludeFontPaddingFunc148d6054 instance = null;

    public static IncludeFontPaddingFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IncludeFontPaddingFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setIncludeFontPadding(arg);
      }
    }
  }

  private static final class IndeterminateFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IndeterminateFunc148d6054 instance = null;

    public static IndeterminateFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IndeterminateFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminate(arg);
      }
    }
  }

  private static final class IndeterminateDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static IndeterminateDrawableFuncfb47464a instance = null;

    public static IndeterminateDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new IndeterminateDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateDrawable(arg);
      }
    }
  }

  private static final class IndeterminateDrawableTiledFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static IndeterminateDrawableTiledFuncfb47464a instance = null;

    public static IndeterminateDrawableTiledFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new IndeterminateDrawableTiledFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateDrawableTiled(arg);
      }
    }
  }

  private static final class IndeterminateTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static IndeterminateTintListFunc9e5e0e4e instance = null;

    public static IndeterminateTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new IndeterminateTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateTintList(arg);
      }
    }
  }

  private static final class IndeterminateTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static IndeterminateTintModeFuncabb7a84e instance = null;

    public static IndeterminateTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new IndeterminateTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateTintMode(arg);
      }
    }
  }

  private static final class InflatedIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static InflatedIdFunc8567756a instance = null;

    public static InflatedIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new InflatedIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewStub) {
        ((ViewStub) v).setInflatedId(arg);
      }
    }
  }

  private static final class InitialScaleFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static InitialScaleFunc8567756a instance = null;

    public static InitialScaleFunc8567756a getInstance() {
      if(instance == null) {
        instance = new InitialScaleFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof WebView) {
        ((WebView) v).setInitialScale(arg);
      }
    }
  }

  private static final class InputExtrasFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static InputExtrasFunc8567756a instance = null;

    public static InputExtrasFunc8567756a getInstance() {
      if(instance == null) {
        instance = new InputExtrasFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      try {
      	if (v instanceof android.widget.TextView)
      		((android.widget.TextView) v).setInputExtras(arg);
      } catch (org.xmlpull.v1.XmlPullParserException e) {
      	e.printStackTrace();
      } catch (java.io.IOException e) {
      	e.printStackTrace();
      }
    }
  }

  private static final class InputTypeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static InputTypeFunc8567756a instance = null;

    public static InputTypeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new InputTypeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setInputType(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setInputType(arg);
      }
    }
  }

  private static final class InterpolatorFunc805e457b implements Anvil.AttrFunc<Interpolator> {
    private static InterpolatorFunc805e457b instance = null;

    public static InterpolatorFunc805e457b getInstance() {
      if(instance == null) {
        instance = new InterpolatorFunc805e457b();
      }
      return instance;
    }

    public void apply(View v, final Interpolator arg, final Interpolator old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setInterpolator(arg);
      }
    }
  }

  private static final class Is24HourViewFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static Is24HourViewFunc148d6054 instance = null;

    public static Is24HourViewFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new Is24HourViewFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TimePicker) {
        ((TimePicker) v).setIs24HourView(arg);
      }
    }
  }

  private static final class IsIndicatorFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IsIndicatorFunc148d6054 instance = null;

    public static IsIndicatorFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IsIndicatorFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setIsIndicator(arg);
      }
    }
  }

  private static final class IsZoomInEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IsZoomInEnabledFunc148d6054 instance = null;

    public static IsZoomInEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IsZoomInEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ZoomControls) {
        ((ZoomControls) v).setIsZoomInEnabled(arg);
      }
    }
  }

  private static final class IsZoomOutEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static IsZoomOutEnabledFunc148d6054 instance = null;

    public static IsZoomOutEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new IsZoomOutEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ZoomControls) {
        ((ZoomControls) v).setIsZoomOutEnabled(arg);
      }
    }
  }

  private static final class ItemsCanFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ItemsCanFocusFunc148d6054 instance = null;

    public static ItemsCanFocusFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ItemsCanFocusFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ListView) {
        ((ListView) v).setItemsCanFocus(arg);
      }
    }
  }

  private static final class KeepScreenOnFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static KeepScreenOnFunc148d6054 instance = null;

    public static KeepScreenOnFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new KeepScreenOnFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setKeepScreenOn(arg);
    }
  }

  private static final class KeyListenerFuncc20cfe68 implements Anvil.AttrFunc<KeyListener> {
    private static KeyListenerFuncc20cfe68 instance = null;

    public static KeyListenerFuncc20cfe68 getInstance() {
      if(instance == null) {
        instance = new KeyListenerFuncc20cfe68();
      }
      return instance;
    }

    public void apply(View v, final KeyListener arg, final KeyListener old) {
      if (v instanceof TextView) {
        ((TextView) v).setKeyListener(arg);
      }
    }
  }

  private static final class KeyProgressIncrementFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static KeyProgressIncrementFunc8567756a instance = null;

    public static KeyProgressIncrementFunc8567756a getInstance() {
      if(instance == null) {
        instance = new KeyProgressIncrementFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setKeyProgressIncrement(arg);
      }
    }
  }

  private static final class KeyboardFunc68284f4c implements Anvil.AttrFunc<Keyboard> {
    private static KeyboardFunc68284f4c instance = null;

    public static KeyboardFunc68284f4c getInstance() {
      if(instance == null) {
        instance = new KeyboardFunc68284f4c();
      }
      return instance;
    }

    public void apply(View v, final Keyboard arg, final Keyboard old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setKeyboard(arg);
      }
    }
  }

  private static final class LabelForFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LabelForFunc8567756a instance = null;

    public static LabelForFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LabelForFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setLabelFor(arg);
    }
  }

  private static final class LayerPaintFunc7c40a07a implements Anvil.AttrFunc<Paint> {
    private static LayerPaintFunc7c40a07a instance = null;

    public static LayerPaintFunc7c40a07a getInstance() {
      if(instance == null) {
        instance = new LayerPaintFunc7c40a07a();
      }
      return instance;
    }

    public void apply(View v, final Paint arg, final Paint old) {
      v.setLayerPaint(arg);
    }
  }

  private static final class LayoutAnimationFunc97b72682 implements Anvil.AttrFunc<LayoutAnimationController> {
    private static LayoutAnimationFunc97b72682 instance = null;

    public static LayoutAnimationFunc97b72682 getInstance() {
      if(instance == null) {
        instance = new LayoutAnimationFunc97b72682();
      }
      return instance;
    }

    public void apply(View v, final LayoutAnimationController arg, final LayoutAnimationController old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutAnimation(arg);
      }
    }
  }

  private static final class LayoutAnimationListenerFunc3ffca91a implements Anvil.AttrFunc<Animation.AnimationListener> {
    private static LayoutAnimationListenerFunc3ffca91a instance = null;

    public static LayoutAnimationListenerFunc3ffca91a getInstance() {
      if(instance == null) {
        instance = new LayoutAnimationListenerFunc3ffca91a();
      }
      return instance;
    }

    public void apply(View v, final Animation.AnimationListener arg, final Animation.AnimationListener old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutAnimationListener(arg);
      }
    }
  }

  private static final class LayoutDirectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LayoutDirectionFunc8567756a instance = null;

    public static LayoutDirectionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LayoutDirectionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setLayoutDirection(arg);
    }
  }

  private static final class LayoutInflaterFunc3f91d1f implements Anvil.AttrFunc<LayoutInflater> {
    private static LayoutInflaterFunc3f91d1f instance = null;

    public static LayoutInflaterFunc3f91d1f getInstance() {
      if(instance == null) {
        instance = new LayoutInflaterFunc3f91d1f();
      }
      return instance;
    }

    public void apply(View v, final LayoutInflater arg, final LayoutInflater old) {
      if (v instanceof ViewStub) {
        ((ViewStub) v).setLayoutInflater(arg);
      }
    }
  }

  private static final class LayoutModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LayoutModeFunc8567756a instance = null;

    public static LayoutModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LayoutModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutMode(arg);
      }
    }
  }

  private static final class LayoutParamsFunc613f8e8e implements Anvil.AttrFunc<ViewGroup.LayoutParams> {
    private static LayoutParamsFunc613f8e8e instance = null;

    public static LayoutParamsFunc613f8e8e getInstance() {
      if(instance == null) {
        instance = new LayoutParamsFunc613f8e8e();
      }
      return instance;
    }

    public void apply(View v, final ViewGroup.LayoutParams arg, final ViewGroup.LayoutParams old) {
      v.setLayoutParams(arg);
    }
  }

  private static final class LayoutResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LayoutResourceFunc8567756a instance = null;

    public static LayoutResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LayoutResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewStub) {
        ((ViewStub) v).setLayoutResource(arg);
      }
    }
  }

  private static final class LayoutTransitionFuncda5a1c48 implements Anvil.AttrFunc<LayoutTransition> {
    private static LayoutTransitionFuncda5a1c48 instance = null;

    public static LayoutTransitionFuncda5a1c48 getInstance() {
      if(instance == null) {
        instance = new LayoutTransitionFuncda5a1c48();
      }
      return instance;
    }

    public void apply(View v, final LayoutTransition arg, final LayoutTransition old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutTransition(arg);
      }
    }
  }

  private static final class LeftFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LeftFunc8567756a instance = null;

    public static LeftFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LeftFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setLeft(arg);
    }
  }

  private static final class LeftStripDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static LeftStripDrawableFuncfb47464a instance = null;

    public static LeftStripDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new LeftStripDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setLeftStripDrawable(arg);
      }
    }
  }

  private static final class LeftStripDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LeftStripDrawableFunc8567756a instance = null;

    public static LeftStripDrawableFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LeftStripDrawableFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setLeftStripDrawable(arg);
      }
    }
  }

  private static final class LetterSpacingFunce0893188 implements Anvil.AttrFunc<Float> {
    private static LetterSpacingFunce0893188 instance = null;

    public static LetterSpacingFunce0893188 getInstance() {
      if(instance == null) {
        instance = new LetterSpacingFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof TextView) {
        ((TextView) v).setLetterSpacing(arg);
      }
    }
  }

  private static final class LettersWatcherFuncb32320d implements Anvil.AttrFunc<TextWatcher> {
    private static LettersWatcherFuncb32320d instance = null;

    public static LettersWatcherFuncb32320d getInstance() {
      if(instance == null) {
        instance = new LettersWatcherFuncb32320d();
      }
      return instance;
    }

    public void apply(View v, final TextWatcher arg, final TextWatcher old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setLettersWatcher(arg);
      }
    }
  }

  private static final class LinesFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LinesFunc8567756a instance = null;

    public static LinesFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LinesFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setLines(arg);
      }
    }
  }

  private static final class LinkTextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static LinkTextColorFunc9e5e0e4e instance = null;

    public static LinkTextColorFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new LinkTextColorFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TextView) {
        ((TextView) v).setLinkTextColor(arg);
      }
    }
  }

  private static final class LinkTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LinkTextColorFunc8567756a instance = null;

    public static LinkTextColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LinkTextColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setLinkTextColor(arg);
      }
    }
  }

  private static final class LinksClickableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static LinksClickableFunc148d6054 instance = null;

    public static LinksClickableFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new LinksClickableFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setLinksClickable(arg);
      }
    }
  }

  private static final class ListSelectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ListSelectionFunc8567756a instance = null;

    public static ListSelectionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ListSelectionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setListSelection(arg);
      }
    }
  }

  private static final class LogoFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static LogoFuncfb47464a instance = null;

    public static LogoFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new LogoFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogo(arg);
      }
    }
  }

  private static final class LogoFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LogoFunc8567756a instance = null;

    public static LogoFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LogoFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogo(arg);
      }
    }
  }

  private static final class LogoDescriptionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static LogoDescriptionFunc8567756a instance = null;

    public static LogoDescriptionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new LogoDescriptionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogoDescription(arg);
      }
    }
  }

  private static final class LogoDescriptionFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static LogoDescriptionFuncc0af808b instance = null;

    public static LogoDescriptionFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new LogoDescriptionFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogoDescription(arg);
      }
    }
  }

  private static final class LongClickableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static LongClickableFunc148d6054 instance = null;

    public static LongClickableFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new LongClickableFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setLongClickable(arg);
    }
  }

  private static final class MarqueeRepeatLimitFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MarqueeRepeatLimitFunc8567756a instance = null;

    public static MarqueeRepeatLimitFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MarqueeRepeatLimitFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMarqueeRepeatLimit(arg);
      }
    }
  }

  private static final class MaxFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxFunc8567756a instance = null;

    public static MaxFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setMax(arg);
      }
    }
  }

  private static final class MaxDateFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static MaxDateFunc17c521d0 instance = null;

    public static MaxDateFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new MaxDateFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setMaxDate(arg);
      }
      if (v instanceof DatePicker) {
        ((DatePicker) v).setMaxDate(arg);
      }
    }
  }

  private static final class MaxEmsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxEmsFunc8567756a instance = null;

    public static MaxEmsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxEmsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMaxEms(arg);
      }
    }
  }

  private static final class MaxHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxHeightFunc8567756a instance = null;

    public static MaxHeightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxHeightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setMaxHeight(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setMaxHeight(arg);
      }
    }
  }

  private static final class MaxLinesFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxLinesFunc8567756a instance = null;

    public static MaxLinesFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxLinesFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMaxLines(arg);
      }
    }
  }

  private static final class MaxValueFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxValueFunc8567756a instance = null;

    public static MaxValueFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxValueFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setMaxValue(arg);
      }
    }
  }

  private static final class MaxVisibleFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxVisibleFunc8567756a instance = null;

    public static MaxVisibleFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxVisibleFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof FragmentBreadCrumbs) {
        ((FragmentBreadCrumbs) v).setMaxVisible(arg);
      }
    }
  }

  private static final class MaxWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MaxWidthFunc8567756a instance = null;

    public static MaxWidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MaxWidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setMaxWidth(arg);
      }
      if (v instanceof SearchView) {
        ((SearchView) v).setMaxWidth(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setMaxWidth(arg);
      }
    }
  }

  private static final class MeasureAllChildrenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static MeasureAllChildrenFunc148d6054 instance = null;

    public static MeasureAllChildrenFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new MeasureAllChildrenFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setMeasureAllChildren(arg);
      }
    }
  }

  private static final class MeasureWithLargestChildEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static MeasureWithLargestChildEnabledFunc148d6054 instance = null;

    public static MeasureWithLargestChildEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new MeasureWithLargestChildEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setMeasureWithLargestChildEnabled(arg);
      }
    }
  }

  private static final class MediaControllerFunc727c9135 implements Anvil.AttrFunc<MediaController> {
    private static MediaControllerFunc727c9135 instance = null;

    public static MediaControllerFunc727c9135 getInstance() {
      if(instance == null) {
        instance = new MediaControllerFunc727c9135();
      }
      return instance;
    }

    public void apply(View v, final MediaController arg, final MediaController old) {
      if (v instanceof VideoView) {
        ((VideoView) v).setMediaController(arg);
      }
    }
  }

  private static final class MediaPlayerFunc3deec331 implements Anvil.AttrFunc<MediaController.MediaPlayerControl> {
    private static MediaPlayerFunc3deec331 instance = null;

    public static MediaPlayerFunc3deec331 getInstance() {
      if(instance == null) {
        instance = new MediaPlayerFunc3deec331();
      }
      return instance;
    }

    public void apply(View v, final MediaController.MediaPlayerControl arg, final MediaController.MediaPlayerControl old) {
      if (v instanceof MediaController) {
        ((MediaController) v).setMediaPlayer(arg);
      }
    }
  }

  private static final class MinDateFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static MinDateFunc17c521d0 instance = null;

    public static MinDateFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new MinDateFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setMinDate(arg);
      }
      if (v instanceof DatePicker) {
        ((DatePicker) v).setMinDate(arg);
      }
    }
  }

  private static final class MinEmsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinEmsFunc8567756a instance = null;

    public static MinEmsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinEmsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinEms(arg);
      }
    }
  }

  private static final class MinHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinHeightFunc8567756a instance = null;

    public static MinHeightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinHeightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinHeight(arg);
      }
    }
  }

  private static final class MinLinesFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinLinesFunc8567756a instance = null;

    public static MinLinesFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinLinesFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinLines(arg);
      }
    }
  }

  private static final class MinValueFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinValueFunc8567756a instance = null;

    public static MinValueFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinValueFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setMinValue(arg);
      }
    }
  }

  private static final class MinWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinWidthFunc8567756a instance = null;

    public static MinWidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinWidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinWidth(arg);
      }
    }
  }

  private static final class MinimumHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinimumHeightFunc8567756a instance = null;

    public static MinimumHeightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinimumHeightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setMinimumHeight(arg);
    }
  }

  private static final class MinimumWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static MinimumWidthFunc8567756a instance = null;

    public static MinimumWidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new MinimumWidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setMinimumWidth(arg);
    }
  }

  private static final class ModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ModeFunc8567756a instance = null;

    public static ModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setMode(arg);
      }
      if (v instanceof QuickContactBadge) {
        ((QuickContactBadge) v).setMode(arg);
      }
    }
  }

  private static final class MotionEventSplittingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static MotionEventSplittingEnabledFunc148d6054 instance = null;

    public static MotionEventSplittingEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new MotionEventSplittingEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setMotionEventSplittingEnabled(arg);
      }
    }
  }

  private static final class MovementMethodFunc9584901b implements Anvil.AttrFunc<MovementMethod> {
    private static MovementMethodFunc9584901b instance = null;

    public static MovementMethodFunc9584901b getInstance() {
      if(instance == null) {
        instance = new MovementMethodFunc9584901b();
      }
      return instance;
    }

    public void apply(View v, final MovementMethod arg, final MovementMethod old) {
      if (v instanceof TextView) {
        ((TextView) v).setMovementMethod(arg);
      }
    }
  }

  private static final class MultiChoiceModeListenerFunc74531ecd implements Anvil.AttrFunc<AbsListView.MultiChoiceModeListener> {
    private static MultiChoiceModeListenerFunc74531ecd instance = null;

    public static MultiChoiceModeListenerFunc74531ecd getInstance() {
      if(instance == null) {
        instance = new MultiChoiceModeListenerFunc74531ecd();
      }
      return instance;
    }

    public void apply(View v, final AbsListView.MultiChoiceModeListener arg, final AbsListView.MultiChoiceModeListener old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setMultiChoiceModeListener(arg);
      }
    }
  }

  private static final class NavigationContentDescriptionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NavigationContentDescriptionFunc8567756a instance = null;

    public static NavigationContentDescriptionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NavigationContentDescriptionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationContentDescription(arg);
      }
    }
  }

  private static final class NavigationContentDescriptionFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static NavigationContentDescriptionFuncc0af808b instance = null;

    public static NavigationContentDescriptionFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new NavigationContentDescriptionFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationContentDescription(arg);
      }
    }
  }

  private static final class NavigationIconFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static NavigationIconFuncfb47464a instance = null;

    public static NavigationIconFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new NavigationIconFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationIcon(arg);
      }
    }
  }

  private static final class NavigationIconFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NavigationIconFunc8567756a instance = null;

    public static NavigationIconFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NavigationIconFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationIcon(arg);
      }
    }
  }

  private static final class NavigationOnClickListenerFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    private static NavigationOnClickListenerFunc79a13a5e instance = null;

    public static NavigationOnClickListenerFunc79a13a5e getInstance() {
      if(instance == null) {
        instance = new NavigationOnClickListenerFunc79a13a5e();
      }
      return instance;
    }

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationOnClickListener(arg);
      }
    }
  }

  private static final class NestedScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static NestedScrollingEnabledFunc148d6054 instance = null;

    public static NestedScrollingEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new NestedScrollingEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setNestedScrollingEnabled(arg);
    }
  }

  private static final class NetworkAvailableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static NetworkAvailableFunc148d6054 instance = null;

    public static NetworkAvailableFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new NetworkAvailableFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setNetworkAvailable(arg);
      }
    }
  }

  private static final class NextFocusDownIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NextFocusDownIdFunc8567756a instance = null;

    public static NextFocusDownIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NextFocusDownIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusDownId(arg);
    }
  }

  private static final class NextFocusForwardIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NextFocusForwardIdFunc8567756a instance = null;

    public static NextFocusForwardIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NextFocusForwardIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusForwardId(arg);
    }
  }

  private static final class NextFocusLeftIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NextFocusLeftIdFunc8567756a instance = null;

    public static NextFocusLeftIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NextFocusLeftIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusLeftId(arg);
    }
  }

  private static final class NextFocusRightIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NextFocusRightIdFunc8567756a instance = null;

    public static NextFocusRightIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NextFocusRightIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusRightId(arg);
    }
  }

  private static final class NextFocusUpIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NextFocusUpIdFunc8567756a instance = null;

    public static NextFocusUpIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NextFocusUpIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusUpId(arg);
    }
  }

  private static final class NumColumnsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NumColumnsFunc8567756a instance = null;

    public static NumColumnsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NumColumnsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setNumColumns(arg);
      }
    }
  }

  private static final class NumStarsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static NumStarsFunc8567756a instance = null;

    public static NumStarsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new NumStarsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setNumStars(arg);
      }
    }
  }

  private static final class OnApplyWindowInsetsFunc1d84af6a implements Anvil.AttrFunc<View.OnApplyWindowInsetsListener> {
    private static OnApplyWindowInsetsFunc1d84af6a instance = null;

    public static OnApplyWindowInsetsFunc1d84af6a getInstance() {
      if(instance == null) {
        instance = new OnApplyWindowInsetsFunc1d84af6a();
      }
      return instance;
    }

    public void apply(View v, final View.OnApplyWindowInsetsListener arg, final View.OnApplyWindowInsetsListener old) {
      if (arg != null) {
        v.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
          public WindowInsets onApplyWindowInsets(View a0, WindowInsets a1) {
            WindowInsets r = arg.onApplyWindowInsets(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
      }
    }
  }

  private static final class OnBreadCrumbClickFunc9216bf60 implements Anvil.AttrFunc<FragmentBreadCrumbs.OnBreadCrumbClickListener> {
    private static OnBreadCrumbClickFunc9216bf60 instance = null;

    public static OnBreadCrumbClickFunc9216bf60 getInstance() {
      if(instance == null) {
        instance = new OnBreadCrumbClickFunc9216bf60();
      }
      return instance;
    }

    public void apply(View v, final FragmentBreadCrumbs.OnBreadCrumbClickListener arg, final FragmentBreadCrumbs.OnBreadCrumbClickListener old) {
      if (v instanceof FragmentBreadCrumbs) {
        if (arg != null) {
          ((FragmentBreadCrumbs) v).setOnBreadCrumbClickListener(new FragmentBreadCrumbs.OnBreadCrumbClickListener() {
            public boolean onBreadCrumbClick(FragmentManager.BackStackEntry a0, int a1) {
              boolean r = arg.onBreadCrumbClick(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((FragmentBreadCrumbs) v).setOnBreadCrumbClickListener((FragmentBreadCrumbs.OnBreadCrumbClickListener) null);
        }
      }
    }
  }

  private static final class OnCheckedChangeFunca7ec32e6 implements Anvil.AttrFunc<CompoundButton.OnCheckedChangeListener> {
    private static OnCheckedChangeFunca7ec32e6 instance = null;

    public static OnCheckedChangeFunca7ec32e6 getInstance() {
      if(instance == null) {
        instance = new OnCheckedChangeFunca7ec32e6();
      }
      return instance;
    }

    public void apply(View v, final CompoundButton.OnCheckedChangeListener arg, final CompoundButton.OnCheckedChangeListener old) {
      if (v instanceof CompoundButton) {
        if (arg != null) {
          ((CompoundButton) v).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton a0, boolean a1) {
              arg.onCheckedChanged(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((CompoundButton) v).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
      }
    }
  }

  private static final class OnCheckedChangeFunc9ce6f1ed implements Anvil.AttrFunc<RadioGroup.OnCheckedChangeListener> {
    private static OnCheckedChangeFunc9ce6f1ed instance = null;

    public static OnCheckedChangeFunc9ce6f1ed getInstance() {
      if(instance == null) {
        instance = new OnCheckedChangeFunc9ce6f1ed();
      }
      return instance;
    }

    public void apply(View v, final RadioGroup.OnCheckedChangeListener arg, final RadioGroup.OnCheckedChangeListener old) {
      if (v instanceof RadioGroup) {
        if (arg != null) {
          ((RadioGroup) v).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup a0, int a1) {
              arg.onCheckedChanged(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((RadioGroup) v).setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
      }
    }
  }

  private static final class OnChildClickFunc41bf08ab implements Anvil.AttrFunc<ExpandableListView.OnChildClickListener> {
    private static OnChildClickFunc41bf08ab instance = null;

    public static OnChildClickFunc41bf08ab getInstance() {
      if(instance == null) {
        instance = new OnChildClickFunc41bf08ab();
      }
      return instance;
    }

    public void apply(View v, final ExpandableListView.OnChildClickListener arg, final ExpandableListView.OnChildClickListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            public boolean onChildClick(ExpandableListView a0, View a1, int a2, int a3, long a4) {
              boolean r = arg.onChildClick(a0, a1, a2, a3, a4);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((ExpandableListView) v).setOnChildClickListener((ExpandableListView.OnChildClickListener) null);
        }
      }
    }
  }

  private static final class OnChronometerTickFunc314a7a05 implements Anvil.AttrFunc<Chronometer.OnChronometerTickListener> {
    private static OnChronometerTickFunc314a7a05 instance = null;

    public static OnChronometerTickFunc314a7a05 getInstance() {
      if(instance == null) {
        instance = new OnChronometerTickFunc314a7a05();
      }
      return instance;
    }

    public void apply(View v, final Chronometer.OnChronometerTickListener arg, final Chronometer.OnChronometerTickListener old) {
      if (v instanceof Chronometer) {
        if (arg != null) {
          ((Chronometer) v).setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            public void onChronometerTick(Chronometer a0) {
              arg.onChronometerTick(a0);
              Anvil.render();
            }
          });
        } else {
          ((Chronometer) v).setOnChronometerTickListener((Chronometer.OnChronometerTickListener) null);
        }
      }
    }
  }

  private static final class OnClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    private static OnClickFunc79a13a5e instance = null;

    public static OnClickFunc79a13a5e getInstance() {
      if(instance == null) {
        instance = new OnClickFunc79a13a5e();
      }
      return instance;
    }

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (arg != null) {
        v.setOnClickListener(new View.OnClickListener() {
          public void onClick(View a0) {
            arg.onClick(a0);
            Anvil.render();
          }
        });
      } else {
        v.setOnClickListener((View.OnClickListener) null);
      }
    }
  }

  private static final class OnCloseFunc2f96a1d7 implements Anvil.AttrFunc<SearchView.OnCloseListener> {
    private static OnCloseFunc2f96a1d7 instance = null;

    public static OnCloseFunc2f96a1d7 getInstance() {
      if(instance == null) {
        instance = new OnCloseFunc2f96a1d7();
      }
      return instance;
    }

    public void apply(View v, final SearchView.OnCloseListener arg, final SearchView.OnCloseListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnCloseListener(new SearchView.OnCloseListener() {
            public boolean onClose() {
              boolean r = arg.onClose();
              Anvil.render();
              return r;
            }
          });
        } else {
          ((SearchView) v).setOnCloseListener((SearchView.OnCloseListener) null);
        }
      }
    }
  }

  private static final class OnCompletionFunc118298c1 implements Anvil.AttrFunc<MediaPlayer.OnCompletionListener> {
    private static OnCompletionFunc118298c1 instance = null;

    public static OnCompletionFunc118298c1 getInstance() {
      if(instance == null) {
        instance = new OnCompletionFunc118298c1();
      }
      return instance;
    }

    public void apply(View v, final MediaPlayer.OnCompletionListener arg, final MediaPlayer.OnCompletionListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer a0) {
              arg.onCompletion(a0);
              Anvil.render();
            }
          });
        } else {
          ((VideoView) v).setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        }
      }
    }
  }

  private static final class OnCreateContextMenuFunc657678e8 implements Anvil.AttrFunc<View.OnCreateContextMenuListener> {
    private static OnCreateContextMenuFunc657678e8 instance = null;

    public static OnCreateContextMenuFunc657678e8 getInstance() {
      if(instance == null) {
        instance = new OnCreateContextMenuFunc657678e8();
      }
      return instance;
    }

    public void apply(View v, final View.OnCreateContextMenuListener arg, final View.OnCreateContextMenuListener old) {
      if (arg != null) {
        v.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
          public void onCreateContextMenu(ContextMenu a0, View a1, ContextMenu.ContextMenuInfo a2) {
            arg.onCreateContextMenu(a0, a1, a2);
            Anvil.render();
          }
        });
      } else {
        v.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
      }
    }
  }

  private static final class OnDateChangeFuncd43c4991 implements Anvil.AttrFunc<CalendarView.OnDateChangeListener> {
    private static OnDateChangeFuncd43c4991 instance = null;

    public static OnDateChangeFuncd43c4991 getInstance() {
      if(instance == null) {
        instance = new OnDateChangeFuncd43c4991();
      }
      return instance;
    }

    public void apply(View v, final CalendarView.OnDateChangeListener arg, final CalendarView.OnDateChangeListener old) {
      if (v instanceof CalendarView) {
        if (arg != null) {
          ((CalendarView) v).setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView a0, int a1, int a2, int a3) {
              arg.onSelectedDayChange(a0, a1, a2, a3);
              Anvil.render();
            }
          });
        } else {
          ((CalendarView) v).setOnDateChangeListener((CalendarView.OnDateChangeListener) null);
        }
      }
    }
  }

  private static final class OnDismissFuncfea72fd6 implements Anvil.AttrFunc<AutoCompleteTextView.OnDismissListener> {
    private static OnDismissFuncfea72fd6 instance = null;

    public static OnDismissFuncfea72fd6 getInstance() {
      if(instance == null) {
        instance = new OnDismissFuncfea72fd6();
      }
      return instance;
    }

    public void apply(View v, final AutoCompleteTextView.OnDismissListener arg, final AutoCompleteTextView.OnDismissListener old) {
      if (v instanceof AutoCompleteTextView) {
        if (arg != null) {
          ((AutoCompleteTextView) v).setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
            public void onDismiss() {
              arg.onDismiss();
              Anvil.render();
            }
          });
        } else {
          ((AutoCompleteTextView) v).setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
      }
    }
  }

  private static final class OnDragFunc685605c6 implements Anvil.AttrFunc<View.OnDragListener> {
    private static OnDragFunc685605c6 instance = null;

    public static OnDragFunc685605c6 getInstance() {
      if(instance == null) {
        instance = new OnDragFunc685605c6();
      }
      return instance;
    }

    public void apply(View v, final View.OnDragListener arg, final View.OnDragListener old) {
      if (arg != null) {
        v.setOnDragListener(new View.OnDragListener() {
          public boolean onDrag(View a0, DragEvent a1) {
            boolean r = arg.onDrag(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnDragListener((View.OnDragListener) null);
      }
    }
  }

  private static final class OnDrawerCloseFunc2c932b02 implements Anvil.AttrFunc<SlidingDrawer.OnDrawerCloseListener> {
    private static OnDrawerCloseFunc2c932b02 instance = null;

    public static OnDrawerCloseFunc2c932b02 getInstance() {
      if(instance == null) {
        instance = new OnDrawerCloseFunc2c932b02();
      }
      return instance;
    }

    public void apply(View v, final SlidingDrawer.OnDrawerCloseListener arg, final SlidingDrawer.OnDrawerCloseListener old) {
      if (v instanceof SlidingDrawer) {
        if (arg != null) {
          ((SlidingDrawer) v).setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            public void onDrawerClosed() {
              arg.onDrawerClosed();
              Anvil.render();
            }
          });
        } else {
          ((SlidingDrawer) v).setOnDrawerCloseListener((SlidingDrawer.OnDrawerCloseListener) null);
        }
      }
    }
  }

  private static final class OnDrawerOpenFuncbff66a28 implements Anvil.AttrFunc<SlidingDrawer.OnDrawerOpenListener> {
    private static OnDrawerOpenFuncbff66a28 instance = null;

    public static OnDrawerOpenFuncbff66a28 getInstance() {
      if(instance == null) {
        instance = new OnDrawerOpenFuncbff66a28();
      }
      return instance;
    }

    public void apply(View v, final SlidingDrawer.OnDrawerOpenListener arg, final SlidingDrawer.OnDrawerOpenListener old) {
      if (v instanceof SlidingDrawer) {
        if (arg != null) {
          ((SlidingDrawer) v).setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            public void onDrawerOpened() {
              arg.onDrawerOpened();
              Anvil.render();
            }
          });
        } else {
          ((SlidingDrawer) v).setOnDrawerOpenListener((SlidingDrawer.OnDrawerOpenListener) null);
        }
      }
    }
  }

  private static final class OnDrawerScrollFunc44bfdd2b implements Anvil.AttrFunc<SlidingDrawer.OnDrawerScrollListener> {
    private static OnDrawerScrollFunc44bfdd2b instance = null;

    public static OnDrawerScrollFunc44bfdd2b getInstance() {
      if(instance == null) {
        instance = new OnDrawerScrollFunc44bfdd2b();
      }
      return instance;
    }

    public void apply(View v, final SlidingDrawer.OnDrawerScrollListener arg, final SlidingDrawer.OnDrawerScrollListener old) {
      if (v instanceof SlidingDrawer) {
        if (arg != null) {
          ((SlidingDrawer) v).setOnDrawerScrollListener(new SlidingDrawer.OnDrawerScrollListener() {
            public void onScrollEnded() {
              arg.onScrollEnded();
              Anvil.render();
            }

            public void onScrollStarted() {
              arg.onScrollStarted();
              Anvil.render();
            }
          });
        } else {
          ((SlidingDrawer) v).setOnDrawerScrollListener((SlidingDrawer.OnDrawerScrollListener) null);
        }
      }
    }
  }

  private static final class OnEditorActionFuncb9b05d07 implements Anvil.AttrFunc<TextView.OnEditorActionListener> {
    private static OnEditorActionFuncb9b05d07 instance = null;

    public static OnEditorActionFuncb9b05d07 getInstance() {
      if(instance == null) {
        instance = new OnEditorActionFuncb9b05d07();
      }
      return instance;
    }

    public void apply(View v, final TextView.OnEditorActionListener arg, final TextView.OnEditorActionListener old) {
      if (v instanceof TextView) {
        if (arg != null) {
          ((TextView) v).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView a0, int a1, KeyEvent a2) {
              boolean r = arg.onEditorAction(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((TextView) v).setOnEditorActionListener((TextView.OnEditorActionListener) null);
        }
      }
    }
  }

  private static final class OnErrorFunc19f5c42b implements Anvil.AttrFunc<MediaPlayer.OnErrorListener> {
    private static OnErrorFunc19f5c42b instance = null;

    public static OnErrorFunc19f5c42b getInstance() {
      if(instance == null) {
        instance = new OnErrorFunc19f5c42b();
      }
      return instance;
    }

    public void apply(View v, final MediaPlayer.OnErrorListener arg, final MediaPlayer.OnErrorListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public boolean onError(MediaPlayer a0, int a1, int a2) {
              boolean r = arg.onError(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((VideoView) v).setOnErrorListener((MediaPlayer.OnErrorListener) null);
        }
      }
    }
  }

  private static final class OnFocusChangeFunca56a1dfe implements Anvil.AttrFunc<View.OnFocusChangeListener> {
    private static OnFocusChangeFunca56a1dfe instance = null;

    public static OnFocusChangeFunca56a1dfe getInstance() {
      if(instance == null) {
        instance = new OnFocusChangeFunca56a1dfe();
      }
      return instance;
    }

    public void apply(View v, final View.OnFocusChangeListener arg, final View.OnFocusChangeListener old) {
      if (arg != null) {
        v.setOnFocusChangeListener(new View.OnFocusChangeListener() {
          public void onFocusChange(View a0, boolean a1) {
            arg.onFocusChange(a0, a1);
            Anvil.render();
          }
        });
      } else {
        v.setOnFocusChangeListener((View.OnFocusChangeListener) null);
      }
    }
  }

  private static final class OnGenericMotionFunc35b75643 implements Anvil.AttrFunc<View.OnGenericMotionListener> {
    private static OnGenericMotionFunc35b75643 instance = null;

    public static OnGenericMotionFunc35b75643 getInstance() {
      if(instance == null) {
        instance = new OnGenericMotionFunc35b75643();
      }
      return instance;
    }

    public void apply(View v, final View.OnGenericMotionListener arg, final View.OnGenericMotionListener old) {
      if (arg != null) {
        v.setOnGenericMotionListener(new View.OnGenericMotionListener() {
          public boolean onGenericMotion(View a0, MotionEvent a1) {
            boolean r = arg.onGenericMotion(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnGenericMotionListener((View.OnGenericMotionListener) null);
      }
    }
  }

  private static final class OnGroupClickFunc8330a028 implements Anvil.AttrFunc<ExpandableListView.OnGroupClickListener> {
    private static OnGroupClickFunc8330a028 instance = null;

    public static OnGroupClickFunc8330a028 getInstance() {
      if(instance == null) {
        instance = new OnGroupClickFunc8330a028();
      }
      return instance;
    }

    public void apply(View v, final ExpandableListView.OnGroupClickListener arg, final ExpandableListView.OnGroupClickListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            public boolean onGroupClick(ExpandableListView a0, View a1, int a2, long a3) {
              boolean r = arg.onGroupClick(a0, a1, a2, a3);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((ExpandableListView) v).setOnGroupClickListener((ExpandableListView.OnGroupClickListener) null);
        }
      }
    }
  }

  private static final class OnGroupCollapseFunc817eb235 implements Anvil.AttrFunc<ExpandableListView.OnGroupCollapseListener> {
    private static OnGroupCollapseFunc817eb235 instance = null;

    public static OnGroupCollapseFunc817eb235 getInstance() {
      if(instance == null) {
        instance = new OnGroupCollapseFunc817eb235();
      }
      return instance;
    }

    public void apply(View v, final ExpandableListView.OnGroupCollapseListener arg, final ExpandableListView.OnGroupCollapseListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            public void onGroupCollapse(int a0) {
              arg.onGroupCollapse(a0);
              Anvil.render();
            }
          });
        } else {
          ((ExpandableListView) v).setOnGroupCollapseListener((ExpandableListView.OnGroupCollapseListener) null);
        }
      }
    }
  }

  private static final class OnGroupExpandFunccdb64d22 implements Anvil.AttrFunc<ExpandableListView.OnGroupExpandListener> {
    private static OnGroupExpandFunccdb64d22 instance = null;

    public static OnGroupExpandFunccdb64d22 getInstance() {
      if(instance == null) {
        instance = new OnGroupExpandFunccdb64d22();
      }
      return instance;
    }

    public void apply(View v, final ExpandableListView.OnGroupExpandListener arg, final ExpandableListView.OnGroupExpandListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            public void onGroupExpand(int a0) {
              arg.onGroupExpand(a0);
              Anvil.render();
            }
          });
        } else {
          ((ExpandableListView) v).setOnGroupExpandListener((ExpandableListView.OnGroupExpandListener) null);
        }
      }
    }
  }

  private static final class OnHierarchyChangeFunc7b5dc8bc implements Anvil.AttrFunc<ViewGroup.OnHierarchyChangeListener> {
    private static OnHierarchyChangeFunc7b5dc8bc instance = null;

    public static OnHierarchyChangeFunc7b5dc8bc getInstance() {
      if(instance == null) {
        instance = new OnHierarchyChangeFunc7b5dc8bc();
      }
      return instance;
    }

    public void apply(View v, final ViewGroup.OnHierarchyChangeListener arg, final ViewGroup.OnHierarchyChangeListener old) {
      if (v instanceof ViewGroup) {
        if (arg != null) {
          ((ViewGroup) v).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
            public void onChildViewAdded(View a0, View a1) {
              arg.onChildViewAdded(a0, a1);
              Anvil.render();
            }

            public void onChildViewRemoved(View a0, View a1) {
              arg.onChildViewRemoved(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((ViewGroup) v).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
      }
    }
  }

  private static final class OnHoverFuncbf544a12 implements Anvil.AttrFunc<View.OnHoverListener> {
    private static OnHoverFuncbf544a12 instance = null;

    public static OnHoverFuncbf544a12 getInstance() {
      if(instance == null) {
        instance = new OnHoverFuncbf544a12();
      }
      return instance;
    }

    public void apply(View v, final View.OnHoverListener arg, final View.OnHoverListener old) {
      if (arg != null) {
        v.setOnHoverListener(new View.OnHoverListener() {
          public boolean onHover(View a0, MotionEvent a1) {
            boolean r = arg.onHover(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnHoverListener((View.OnHoverListener) null);
      }
    }
  }

  private static final class OnInflateFuncdd97752b implements Anvil.AttrFunc<ViewStub.OnInflateListener> {
    private static OnInflateFuncdd97752b instance = null;

    public static OnInflateFuncdd97752b getInstance() {
      if(instance == null) {
        instance = new OnInflateFuncdd97752b();
      }
      return instance;
    }

    public void apply(View v, final ViewStub.OnInflateListener arg, final ViewStub.OnInflateListener old) {
      if (v instanceof ViewStub) {
        if (arg != null) {
          ((ViewStub) v).setOnInflateListener(new ViewStub.OnInflateListener() {
            public void onInflate(ViewStub a0, View a1) {
              arg.onInflate(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((ViewStub) v).setOnInflateListener((ViewStub.OnInflateListener) null);
        }
      }
    }
  }

  private static final class OnInfoFuncfc58c853 implements Anvil.AttrFunc<MediaPlayer.OnInfoListener> {
    private static OnInfoFuncfc58c853 instance = null;

    public static OnInfoFuncfc58c853 getInstance() {
      if(instance == null) {
        instance = new OnInfoFuncfc58c853();
      }
      return instance;
    }

    public void apply(View v, final MediaPlayer.OnInfoListener arg, final MediaPlayer.OnInfoListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnInfoListener(new MediaPlayer.OnInfoListener() {
            public boolean onInfo(MediaPlayer a0, int a1, int a2) {
              boolean r = arg.onInfo(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((VideoView) v).setOnInfoListener((MediaPlayer.OnInfoListener) null);
        }
      }
    }
  }

  private static final class OnItemClickFuncbe673005 implements Anvil.AttrFunc<AdapterView.OnItemClickListener> {
    private static OnItemClickFuncbe673005 instance = null;

    public static OnItemClickFuncbe673005 getInstance() {
      if(instance == null) {
        instance = new OnItemClickFuncbe673005();
      }
      return instance;
    }

    public void apply(View v, final AdapterView.OnItemClickListener arg, final AdapterView.OnItemClickListener old) {
      if (v instanceof AdapterView) {
        if (arg != null) {
          ((AdapterView) v).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemClick(a0, a1, a2, a3);
              Anvil.render();
            }
          });
        } else {
          ((AdapterView) v).setOnItemClickListener((AdapterView.OnItemClickListener) null);
        }
      }
      if (v instanceof AutoCompleteTextView) {
        if (arg != null) {
          ((AutoCompleteTextView) v).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemClick(a0, a1, a2, a3);
              Anvil.render();
            }
          });
        } else {
          ((AutoCompleteTextView) v).setOnItemClickListener((AdapterView.OnItemClickListener) null);
        }
      }
    }
  }

  private static final class OnItemLongClickFuncbc740669 implements Anvil.AttrFunc<AdapterView.OnItemLongClickListener> {
    private static OnItemLongClickFuncbc740669 instance = null;

    public static OnItemLongClickFuncbc740669 getInstance() {
      if(instance == null) {
        instance = new OnItemLongClickFuncbc740669();
      }
      return instance;
    }

    public void apply(View v, final AdapterView.OnItemLongClickListener arg, final AdapterView.OnItemLongClickListener old) {
      if (v instanceof AdapterView) {
        if (arg != null) {
          ((AdapterView) v).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView a0, View a1, int a2, long a3) {
              boolean r = arg.onItemLongClick(a0, a1, a2, a3);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((AdapterView) v).setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
        }
      }
    }
  }

  private static final class OnItemSelectedFuncb7923a26 implements Anvil.AttrFunc<AdapterView.OnItemSelectedListener> {
    private static OnItemSelectedFuncb7923a26 instance = null;

    public static OnItemSelectedFuncb7923a26 getInstance() {
      if(instance == null) {
        instance = new OnItemSelectedFuncb7923a26();
      }
      return instance;
    }

    public void apply(View v, final AdapterView.OnItemSelectedListener arg, final AdapterView.OnItemSelectedListener old) {
      if (v instanceof AdapterView) {
        if (arg != null) {
          ((AdapterView) v).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemSelected(a0, a1, a2, a3);
              Anvil.render();
            }

            public void onNothingSelected(AdapterView a0) {
              arg.onNothingSelected(a0);
              Anvil.render();
            }
          });
        } else {
          ((AdapterView) v).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        }
      }
      if (v instanceof AutoCompleteTextView) {
        if (arg != null) {
          ((AutoCompleteTextView) v).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemSelected(a0, a1, a2, a3);
              Anvil.render();
            }

            public void onNothingSelected(AdapterView a0) {
              arg.onNothingSelected(a0);
              Anvil.render();
            }
          });
        } else {
          ((AutoCompleteTextView) v).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        }
      }
    }
  }

  private static final class OnKeyFunce04764b5 implements Anvil.AttrFunc<View.OnKeyListener> {
    private static OnKeyFunce04764b5 instance = null;

    public static OnKeyFunce04764b5 getInstance() {
      if(instance == null) {
        instance = new OnKeyFunce04764b5();
      }
      return instance;
    }

    public void apply(View v, final View.OnKeyListener arg, final View.OnKeyListener old) {
      if (arg != null) {
        v.setOnKeyListener(new View.OnKeyListener() {
          public boolean onKey(View a0, int a1, KeyEvent a2) {
            boolean r = arg.onKey(a0, a1, a2);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnKeyListener((View.OnKeyListener) null);
      }
    }
  }

  private static final class OnKeyboardActionFunc754370ed implements Anvil.AttrFunc<KeyboardView.OnKeyboardActionListener> {
    private static OnKeyboardActionFunc754370ed instance = null;

    public static OnKeyboardActionFunc754370ed getInstance() {
      if(instance == null) {
        instance = new OnKeyboardActionFunc754370ed();
      }
      return instance;
    }

    public void apply(View v, final KeyboardView.OnKeyboardActionListener arg, final KeyboardView.OnKeyboardActionListener old) {
      if (v instanceof KeyboardView) {
        if (arg != null) {
          ((KeyboardView) v).setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() {
            public void onKey(int a0, int[] a1) {
              arg.onKey(a0, a1);
              Anvil.render();
            }

            public void onPress(int a0) {
              arg.onPress(a0);
              Anvil.render();
            }

            public void onRelease(int a0) {
              arg.onRelease(a0);
              Anvil.render();
            }

            public void onText(CharSequence a0) {
              arg.onText(a0);
              Anvil.render();
            }

            public void swipeDown() {
              arg.swipeDown();
              Anvil.render();
            }

            public void swipeLeft() {
              arg.swipeLeft();
              Anvil.render();
            }

            public void swipeRight() {
              arg.swipeRight();
              Anvil.render();
            }

            public void swipeUp() {
              arg.swipeUp();
              Anvil.render();
            }
          });
        } else {
          ((KeyboardView) v).setOnKeyboardActionListener((KeyboardView.OnKeyboardActionListener) null);
        }
      }
    }
  }

  private static final class OnLongClickFuncdc7f3c42 implements Anvil.AttrFunc<View.OnLongClickListener> {
    private static OnLongClickFuncdc7f3c42 instance = null;

    public static OnLongClickFuncdc7f3c42 getInstance() {
      if(instance == null) {
        instance = new OnLongClickFuncdc7f3c42();
      }
      return instance;
    }

    public void apply(View v, final View.OnLongClickListener arg, final View.OnLongClickListener old) {
      if (arg != null) {
        v.setOnLongClickListener(new View.OnLongClickListener() {
          public boolean onLongClick(View a0) {
            boolean r = arg.onLongClick(a0);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnLongClickListener((View.OnLongClickListener) null);
      }
    }
  }

  private static final class OnLongPressUpdateIntervalFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static OnLongPressUpdateIntervalFunc17c521d0 instance = null;

    public static OnLongPressUpdateIntervalFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new OnLongPressUpdateIntervalFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setOnLongPressUpdateInterval(arg);
      }
    }
  }

  private static final class OnMenuItemClickFuncc8271282 implements Anvil.AttrFunc<ActionMenuView.OnMenuItemClickListener> {
    private static OnMenuItemClickFuncc8271282 instance = null;

    public static OnMenuItemClickFuncc8271282 getInstance() {
      if(instance == null) {
        instance = new OnMenuItemClickFuncc8271282();
      }
      return instance;
    }

    public void apply(View v, final ActionMenuView.OnMenuItemClickListener arg, final ActionMenuView.OnMenuItemClickListener old) {
      if (v instanceof ActionMenuView) {
        if (arg != null) {
          ((ActionMenuView) v).setOnMenuItemClickListener(new ActionMenuView.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem a0) {
              boolean r = arg.onMenuItemClick(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((ActionMenuView) v).setOnMenuItemClickListener((ActionMenuView.OnMenuItemClickListener) null);
        }
      }
    }
  }

  private static final class OnMenuItemClickFunc8ed2cccd implements Anvil.AttrFunc<Toolbar.OnMenuItemClickListener> {
    private static OnMenuItemClickFunc8ed2cccd instance = null;

    public static OnMenuItemClickFunc8ed2cccd getInstance() {
      if(instance == null) {
        instance = new OnMenuItemClickFunc8ed2cccd();
      }
      return instance;
    }

    public void apply(View v, final Toolbar.OnMenuItemClickListener arg, final Toolbar.OnMenuItemClickListener old) {
      if (v instanceof Toolbar) {
        if (arg != null) {
          ((Toolbar) v).setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem a0) {
              boolean r = arg.onMenuItemClick(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((Toolbar) v).setOnMenuItemClickListener((Toolbar.OnMenuItemClickListener) null);
        }
      }
    }
  }

  private static final class OnPreparedFuncde5b2862 implements Anvil.AttrFunc<MediaPlayer.OnPreparedListener> {
    private static OnPreparedFuncde5b2862 instance = null;

    public static OnPreparedFuncde5b2862 getInstance() {
      if(instance == null) {
        instance = new OnPreparedFuncde5b2862();
      }
      return instance;
    }

    public void apply(View v, final MediaPlayer.OnPreparedListener arg, final MediaPlayer.OnPreparedListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer a0) {
              arg.onPrepared(a0);
              Anvil.render();
            }
          });
        } else {
          ((VideoView) v).setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        }
      }
    }
  }

  private static final class OnQueryTextFunc8c880774 implements Anvil.AttrFunc<SearchView.OnQueryTextListener> {
    private static OnQueryTextFunc8c880774 instance = null;

    public static OnQueryTextFunc8c880774 getInstance() {
      if(instance == null) {
        instance = new OnQueryTextFunc8c880774();
      }
      return instance;
    }

    public void apply(View v, final SearchView.OnQueryTextListener arg, final SearchView.OnQueryTextListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextChange(String a0) {
              boolean r = arg.onQueryTextChange(a0);
              Anvil.render();
              return r;
            }

            public boolean onQueryTextSubmit(String a0) {
              boolean r = arg.onQueryTextSubmit(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((SearchView) v).setOnQueryTextListener((SearchView.OnQueryTextListener) null);
        }
      }
    }
  }

  private static final class OnQueryTextFocusChangeFunca56a1dfe implements Anvil.AttrFunc<View.OnFocusChangeListener> {
    private static OnQueryTextFocusChangeFunca56a1dfe instance = null;

    public static OnQueryTextFocusChangeFunca56a1dfe getInstance() {
      if(instance == null) {
        instance = new OnQueryTextFocusChangeFunca56a1dfe();
      }
      return instance;
    }

    public void apply(View v, final View.OnFocusChangeListener arg, final View.OnFocusChangeListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View a0, boolean a1) {
              arg.onFocusChange(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((SearchView) v).setOnQueryTextFocusChangeListener((View.OnFocusChangeListener) null);
        }
      }
    }
  }

  private static final class OnRatingBarChangeFunceb1aadb8 implements Anvil.AttrFunc<RatingBar.OnRatingBarChangeListener> {
    private static OnRatingBarChangeFunceb1aadb8 instance = null;

    public static OnRatingBarChangeFunceb1aadb8 getInstance() {
      if(instance == null) {
        instance = new OnRatingBarChangeFunceb1aadb8();
      }
      return instance;
    }

    public void apply(View v, final RatingBar.OnRatingBarChangeListener arg, final RatingBar.OnRatingBarChangeListener old) {
      if (v instanceof RatingBar) {
        if (arg != null) {
          ((RatingBar) v).setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar a0, float a1, boolean a2) {
              arg.onRatingChanged(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          ((RatingBar) v).setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener) null);
        }
      }
    }
  }

  private static final class OnScrollFunce14bebe4 implements Anvil.AttrFunc<AbsListView.OnScrollListener> {
    private static OnScrollFunce14bebe4 instance = null;

    public static OnScrollFunce14bebe4 getInstance() {
      if(instance == null) {
        instance = new OnScrollFunce14bebe4();
      }
      return instance;
    }

    public void apply(View v, final AbsListView.OnScrollListener arg, final AbsListView.OnScrollListener old) {
      if (v instanceof AbsListView) {
        if (arg != null) {
          ((AbsListView) v).setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScroll(AbsListView a0, int a1, int a2, int a3) {
              arg.onScroll(a0, a1, a2, a3);
              Anvil.render();
            }

            public void onScrollStateChanged(AbsListView a0, int a1) {
              arg.onScrollStateChanged(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((AbsListView) v).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
      }
    }
  }

  private static final class OnScrollFunca8ab482c implements Anvil.AttrFunc<NumberPicker.OnScrollListener> {
    private static OnScrollFunca8ab482c instance = null;

    public static OnScrollFunca8ab482c getInstance() {
      if(instance == null) {
        instance = new OnScrollFunca8ab482c();
      }
      return instance;
    }

    public void apply(View v, final NumberPicker.OnScrollListener arg, final NumberPicker.OnScrollListener old) {
      if (v instanceof NumberPicker) {
        if (arg != null) {
          ((NumberPicker) v).setOnScrollListener(new NumberPicker.OnScrollListener() {
            public void onScrollStateChange(NumberPicker a0, int a1) {
              arg.onScrollStateChange(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((NumberPicker) v).setOnScrollListener((NumberPicker.OnScrollListener) null);
        }
      }
    }
  }

  private static final class OnSearchClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    private static OnSearchClickFunc79a13a5e instance = null;

    public static OnSearchClickFunc79a13a5e getInstance() {
      if(instance == null) {
        instance = new OnSearchClickFunc79a13a5e();
      }
      return instance;
    }

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnSearchClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              arg.onClick(a0);
              Anvil.render();
            }
          });
        } else {
          ((SearchView) v).setOnSearchClickListener((View.OnClickListener) null);
        }
      }
    }
  }

  private static final class OnSeekBarChangeFunc11980542 implements Anvil.AttrFunc<SeekBar.OnSeekBarChangeListener> {
    private static OnSeekBarChangeFunc11980542 instance = null;

    public static OnSeekBarChangeFunc11980542 getInstance() {
      if(instance == null) {
        instance = new OnSeekBarChangeFunc11980542();
      }
      return instance;
    }

    public void apply(View v, final SeekBar.OnSeekBarChangeListener arg, final SeekBar.OnSeekBarChangeListener old) {
      if (v instanceof SeekBar) {
        if (arg != null) {
          ((SeekBar) v).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar a0, int a1, boolean a2) {
              arg.onProgressChanged(a0, a1, a2);
              Anvil.render();
            }

            public void onStartTrackingTouch(SeekBar a0) {
              arg.onStartTrackingTouch(a0);
              Anvil.render();
            }

            public void onStopTrackingTouch(SeekBar a0) {
              arg.onStopTrackingTouch(a0);
              Anvil.render();
            }
          });
        } else {
          ((SeekBar) v).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        }
      }
    }
  }

  private static final class OnSuggestionFunc8020caad implements Anvil.AttrFunc<SearchView.OnSuggestionListener> {
    private static OnSuggestionFunc8020caad instance = null;

    public static OnSuggestionFunc8020caad getInstance() {
      if(instance == null) {
        instance = new OnSuggestionFunc8020caad();
      }
      return instance;
    }

    public void apply(View v, final SearchView.OnSuggestionListener arg, final SearchView.OnSuggestionListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnSuggestionListener(new SearchView.OnSuggestionListener() {
            public boolean onSuggestionClick(int a0) {
              boolean r = arg.onSuggestionClick(a0);
              Anvil.render();
              return r;
            }

            public boolean onSuggestionSelect(int a0) {
              boolean r = arg.onSuggestionSelect(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((SearchView) v).setOnSuggestionListener((SearchView.OnSuggestionListener) null);
        }
      }
    }
  }

  private static final class OnSystemUiVisibilityChangeFunc42302537 implements Anvil.AttrFunc<View.OnSystemUiVisibilityChangeListener> {
    private static OnSystemUiVisibilityChangeFunc42302537 instance = null;

    public static OnSystemUiVisibilityChangeFunc42302537 getInstance() {
      if(instance == null) {
        instance = new OnSystemUiVisibilityChangeFunc42302537();
      }
      return instance;
    }

    public void apply(View v, final View.OnSystemUiVisibilityChangeListener arg, final View.OnSystemUiVisibilityChangeListener old) {
      if (arg != null) {
        v.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
          public void onSystemUiVisibilityChange(int a0) {
            arg.onSystemUiVisibilityChange(a0);
            Anvil.render();
          }
        });
      } else {
        v.setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
      }
    }
  }

  private static final class OnTabChangedFunc2d645be implements Anvil.AttrFunc<TabHost.OnTabChangeListener> {
    private static OnTabChangedFunc2d645be instance = null;

    public static OnTabChangedFunc2d645be getInstance() {
      if(instance == null) {
        instance = new OnTabChangedFunc2d645be();
      }
      return instance;
    }

    public void apply(View v, final TabHost.OnTabChangeListener arg, final TabHost.OnTabChangeListener old) {
      if (v instanceof TabHost) {
        if (arg != null) {
          ((TabHost) v).setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            public void onTabChanged(String a0) {
              arg.onTabChanged(a0);
              Anvil.render();
            }
          });
        } else {
          ((TabHost) v).setOnTabChangedListener((TabHost.OnTabChangeListener) null);
        }
      }
    }
  }

  private static final class OnTimeChangedFuncaf1cf294 implements Anvil.AttrFunc<TimePicker.OnTimeChangedListener> {
    private static OnTimeChangedFuncaf1cf294 instance = null;

    public static OnTimeChangedFuncaf1cf294 getInstance() {
      if(instance == null) {
        instance = new OnTimeChangedFuncaf1cf294();
      }
      return instance;
    }

    public void apply(View v, final TimePicker.OnTimeChangedListener arg, final TimePicker.OnTimeChangedListener old) {
      if (v instanceof TimePicker) {
        if (arg != null) {
          ((TimePicker) v).setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            public void onTimeChanged(TimePicker a0, int a1, int a2) {
              arg.onTimeChanged(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          ((TimePicker) v).setOnTimeChangedListener((TimePicker.OnTimeChangedListener) null);
        }
      }
    }
  }

  private static final class OnTouchFunca554ad15 implements Anvil.AttrFunc<View.OnTouchListener> {
    private static OnTouchFunca554ad15 instance = null;

    public static OnTouchFunca554ad15 getInstance() {
      if(instance == null) {
        instance = new OnTouchFunca554ad15();
      }
      return instance;
    }

    public void apply(View v, final View.OnTouchListener arg, final View.OnTouchListener old) {
      if (arg != null) {
        v.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View a0, MotionEvent a1) {
            boolean r = arg.onTouch(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnTouchListener((View.OnTouchListener) null);
      }
    }
  }

  private static final class OnUnhandledInputEventFunc8283e384 implements Anvil.AttrFunc<TvView.OnUnhandledInputEventListener> {
    private static OnUnhandledInputEventFunc8283e384 instance = null;

    public static OnUnhandledInputEventFunc8283e384 getInstance() {
      if(instance == null) {
        instance = new OnUnhandledInputEventFunc8283e384();
      }
      return instance;
    }

    public void apply(View v, final TvView.OnUnhandledInputEventListener arg, final TvView.OnUnhandledInputEventListener old) {
      if (v instanceof TvView) {
        if (arg != null) {
          ((TvView) v).setOnUnhandledInputEventListener(new TvView.OnUnhandledInputEventListener() {
            public boolean onUnhandledInputEvent(InputEvent a0) {
              boolean r = arg.onUnhandledInputEvent(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((TvView) v).setOnUnhandledInputEventListener((TvView.OnUnhandledInputEventListener) null);
        }
      }
    }
  }

  private static final class OnValueChangedFunc6e8a79aa implements Anvil.AttrFunc<NumberPicker.OnValueChangeListener> {
    private static OnValueChangedFunc6e8a79aa instance = null;

    public static OnValueChangedFunc6e8a79aa getInstance() {
      if(instance == null) {
        instance = new OnValueChangedFunc6e8a79aa();
      }
      return instance;
    }

    public void apply(View v, final NumberPicker.OnValueChangeListener arg, final NumberPicker.OnValueChangeListener old) {
      if (v instanceof NumberPicker) {
        if (arg != null) {
          ((NumberPicker) v).setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            public void onValueChange(NumberPicker a0, int a1, int a2) {
              arg.onValueChange(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          ((NumberPicker) v).setOnValueChangedListener((NumberPicker.OnValueChangeListener) null);
        }
      }
    }
  }

  private static final class OnZoomInClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    private static OnZoomInClickFunc79a13a5e instance = null;

    public static OnZoomInClickFunc79a13a5e getInstance() {
      if(instance == null) {
        instance = new OnZoomInClickFunc79a13a5e();
      }
      return instance;
    }

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof ZoomControls) {
        if (arg != null) {
          ((ZoomControls) v).setOnZoomInClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              arg.onClick(a0);
              Anvil.render();
            }
          });
        } else {
          ((ZoomControls) v).setOnZoomInClickListener((View.OnClickListener) null);
        }
      }
    }
  }

  private static final class OnZoomOutClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    private static OnZoomOutClickFunc79a13a5e instance = null;

    public static OnZoomOutClickFunc79a13a5e getInstance() {
      if(instance == null) {
        instance = new OnZoomOutClickFunc79a13a5e();
      }
      return instance;
    }

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof ZoomControls) {
        if (arg != null) {
          ((ZoomControls) v).setOnZoomOutClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              arg.onClick(a0);
              Anvil.render();
            }
          });
        } else {
          ((ZoomControls) v).setOnZoomOutClickListener((View.OnClickListener) null);
        }
      }
    }
  }

  private static final class OpaqueFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static OpaqueFunc148d6054 instance = null;

    public static OpaqueFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new OpaqueFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setOpaque(arg);
      }
    }
  }

  private static final class OrientationFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static OrientationFunc8567756a instance = null;

    public static OrientationFunc8567756a getInstance() {
      if(instance == null) {
        instance = new OrientationFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setOrientation(arg);
      }
      if (v instanceof GridLayout) {
        ((GridLayout) v).setOrientation(arg);
      }
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setOrientation(arg);
      }
    }
  }

  private static final class OutAnimationFunc9a08bdaf implements Anvil.AttrFunc<ObjectAnimator> {
    private static OutAnimationFunc9a08bdaf instance = null;

    public static OutAnimationFunc9a08bdaf getInstance() {
      if(instance == null) {
        instance = new OutAnimationFunc9a08bdaf();
      }
      return instance;
    }

    public void apply(View v, final ObjectAnimator arg, final ObjectAnimator old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setOutAnimation(arg);
      }
    }
  }

  private static final class OutAnimationFunc76cb7b50 implements Anvil.AttrFunc<Animation> {
    private static OutAnimationFunc76cb7b50 instance = null;

    public static OutAnimationFunc76cb7b50 getInstance() {
      if(instance == null) {
        instance = new OutAnimationFunc76cb7b50();
      }
      return instance;
    }

    public void apply(View v, final Animation arg, final Animation old) {
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setOutAnimation(arg);
      }
    }
  }

  private static final class OutlineProviderFuncc76d7ca4 implements Anvil.AttrFunc<ViewOutlineProvider> {
    private static OutlineProviderFuncc76d7ca4 instance = null;

    public static OutlineProviderFuncc76d7ca4 getInstance() {
      if(instance == null) {
        instance = new OutlineProviderFuncc76d7ca4();
      }
      return instance;
    }

    public void apply(View v, final ViewOutlineProvider arg, final ViewOutlineProvider old) {
      v.setOutlineProvider(arg);
    }
  }

  private static final class OverScrollModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static OverScrollModeFunc8567756a instance = null;

    public static OverScrollModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new OverScrollModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setOverScrollMode(arg);
    }
  }

  private static final class OverlayFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static OverlayFuncfb47464a instance = null;

    public static OverlayFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new OverlayFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof QuickContactBadge) {
        ((QuickContactBadge) v).setOverlay(arg);
      }
    }
  }

  private static final class OverscrollFooterFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static OverscrollFooterFuncfb47464a instance = null;

    public static OverscrollFooterFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new OverscrollFooterFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ListView) {
        ((ListView) v).setOverscrollFooter(arg);
      }
    }
  }

  private static final class OverscrollHeaderFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static OverscrollHeaderFuncfb47464a instance = null;

    public static OverscrollHeaderFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new OverscrollHeaderFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ListView) {
        ((ListView) v).setOverscrollHeader(arg);
      }
    }
  }

  private static final class PaintFlagsFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static PaintFlagsFunc8567756a instance = null;

    public static PaintFlagsFunc8567756a getInstance() {
      if(instance == null) {
        instance = new PaintFlagsFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setPaintFlags(arg);
      }
    }
  }

  private static final class PersistentDrawingCacheFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static PersistentDrawingCacheFunc8567756a instance = null;

    public static PersistentDrawingCacheFunc8567756a getInstance() {
      if(instance == null) {
        instance = new PersistentDrawingCacheFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setPersistentDrawingCache(arg);
      }
    }
  }

  private static final class PivotXFunce0893188 implements Anvil.AttrFunc<Float> {
    private static PivotXFunce0893188 instance = null;

    public static PivotXFunce0893188 getInstance() {
      if(instance == null) {
        instance = new PivotXFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setPivotX(arg);
    }
  }

  private static final class PivotYFunce0893188 implements Anvil.AttrFunc<Float> {
    private static PivotYFunce0893188 instance = null;

    public static PivotYFunce0893188 getInstance() {
      if(instance == null) {
        instance = new PivotYFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setPivotY(arg);
    }
  }

  private static final class PopupBackgroundDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static PopupBackgroundDrawableFuncfb47464a instance = null;

    public static PopupBackgroundDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new PopupBackgroundDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPopupBackgroundDrawable(arg);
      }
    }
  }

  private static final class PopupBackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static PopupBackgroundResourceFunc8567756a instance = null;

    public static PopupBackgroundResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new PopupBackgroundResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPopupBackgroundResource(arg);
      }
    }
  }

  private static final class PopupParentFunc6c3617af implements Anvil.AttrFunc<View> {
    private static PopupParentFunc6c3617af instance = null;

    public static PopupParentFunc6c3617af getInstance() {
      if(instance == null) {
        instance = new PopupParentFunc6c3617af();
      }
      return instance;
    }

    public void apply(View v, final View arg, final View old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setPopupParent(arg);
      }
    }
  }

  private static final class PopupThemeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static PopupThemeFunc8567756a instance = null;

    public static PopupThemeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new PopupThemeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ActionMenuView) {
        ((ActionMenuView) v).setPopupTheme(arg);
      }
      if (v instanceof Toolbar) {
        ((Toolbar) v).setPopupTheme(arg);
      }
    }
  }

  private static final class PreserveEGLContextOnPauseFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static PreserveEGLContextOnPauseFunc148d6054 instance = null;

    public static PreserveEGLContextOnPauseFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new PreserveEGLContextOnPauseFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setPreserveEGLContextOnPause(arg);
      }
    }
  }

  private static final class PressedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static PressedFunc148d6054 instance = null;

    public static PressedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new PressedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setPressed(arg);
    }
  }

  private static final class PreviewEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static PreviewEnabledFunc148d6054 instance = null;

    public static PreviewEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new PreviewEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setPreviewEnabled(arg);
      }
    }
  }

  private static final class PrivateImeOptionsFunc473e3665 implements Anvil.AttrFunc<String> {
    private static PrivateImeOptionsFunc473e3665 instance = null;

    public static PrivateImeOptionsFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new PrivateImeOptionsFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TextView) {
        ((TextView) v).setPrivateImeOptions(arg);
      }
    }
  }

  private static final class ProgressFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ProgressFunc8567756a instance = null;

    public static ProgressFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ProgressFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgress(arg);
      }
    }
  }

  private static final class ProgressBackgroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static ProgressBackgroundTintListFunc9e5e0e4e instance = null;

    public static ProgressBackgroundTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new ProgressBackgroundTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressBackgroundTintList(arg);
      }
    }
  }

  private static final class ProgressBackgroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static ProgressBackgroundTintModeFuncabb7a84e instance = null;

    public static ProgressBackgroundTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new ProgressBackgroundTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressBackgroundTintMode(arg);
      }
    }
  }

  private static final class ProgressDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ProgressDrawableFuncfb47464a instance = null;

    public static ProgressDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ProgressDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressDrawable(arg);
      }
    }
  }

  private static final class ProgressDrawableTiledFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ProgressDrawableTiledFuncfb47464a instance = null;

    public static ProgressDrawableTiledFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ProgressDrawableTiledFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressDrawableTiled(arg);
      }
    }
  }

  private static final class ProgressTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static ProgressTintListFunc9e5e0e4e instance = null;

    public static ProgressTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new ProgressTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressTintList(arg);
      }
    }
  }

  private static final class ProgressTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static ProgressTintModeFuncabb7a84e instance = null;

    public static ProgressTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new ProgressTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressTintMode(arg);
      }
    }
  }

  private static final class PromptFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static PromptFuncc0af808b instance = null;

    public static PromptFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new PromptFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPrompt(arg);
      }
    }
  }

  private static final class PromptIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static PromptIdFunc8567756a instance = null;

    public static PromptIdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new PromptIdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPromptId(arg);
      }
    }
  }

  private static final class ProximityCorrectionEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ProximityCorrectionEnabledFunc148d6054 instance = null;

    public static ProximityCorrectionEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ProximityCorrectionEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setProximityCorrectionEnabled(arg);
      }
    }
  }

  private static final class QueryHintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static QueryHintFuncc0af808b instance = null;

    public static QueryHintFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new QueryHintFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setQueryHint(arg);
      }
    }
  }

  private static final class QueryRefinementEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static QueryRefinementEnabledFunc148d6054 instance = null;

    public static QueryRefinementEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new QueryRefinementEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setQueryRefinementEnabled(arg);
      }
    }
  }

  private static final class RatingFunce0893188 implements Anvil.AttrFunc<Float> {
    private static RatingFunce0893188 instance = null;

    public static RatingFunce0893188 getInstance() {
      if(instance == null) {
        instance = new RatingFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setRating(arg);
      }
    }
  }

  private static final class RawInputTypeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static RawInputTypeFunc8567756a instance = null;

    public static RawInputTypeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new RawInputTypeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setRawInputType(arg);
      }
    }
  }

  private static final class RecyclerListenerFunc93ebab97 implements Anvil.AttrFunc<AbsListView.RecyclerListener> {
    private static RecyclerListenerFunc93ebab97 instance = null;

    public static RecyclerListenerFunc93ebab97 getInstance() {
      if(instance == null) {
        instance = new RecyclerListenerFunc93ebab97();
      }
      return instance;
    }

    public void apply(View v, final AbsListView.RecyclerListener arg, final AbsListView.RecyclerListener old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setRecyclerListener(arg);
      }
    }
  }

  private static final class RemoteViewsAdapterFuncbcfa9f30 implements Anvil.AttrFunc<Intent> {
    private static RemoteViewsAdapterFuncbcfa9f30 instance = null;

    public static RemoteViewsAdapterFuncbcfa9f30 getInstance() {
      if(instance == null) {
        instance = new RemoteViewsAdapterFuncbcfa9f30();
      }
      return instance;
    }

    public void apply(View v, final Intent arg, final Intent old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setRemoteViewsAdapter(arg);
      }
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setRemoteViewsAdapter(arg);
      }
    }
  }

  private static final class RenderModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static RenderModeFunc8567756a instance = null;

    public static RenderModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new RenderModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setRenderMode(arg);
      }
    }
  }

  private static final class RendererFunc48532fc4 implements Anvil.AttrFunc<GLSurfaceView.Renderer> {
    private static RendererFunc48532fc4 instance = null;

    public static RendererFunc48532fc4 getInstance() {
      if(instance == null) {
        instance = new RendererFunc48532fc4();
      }
      return instance;
    }

    public void apply(View v, final GLSurfaceView.Renderer arg, final GLSurfaceView.Renderer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setRenderer(arg);
      }
    }
  }

  private static final class RightFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static RightFunc8567756a instance = null;

    public static RightFunc8567756a getInstance() {
      if(instance == null) {
        instance = new RightFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setRight(arg);
    }
  }

  private static final class RightStripDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static RightStripDrawableFuncfb47464a instance = null;

    public static RightStripDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new RightStripDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setRightStripDrawable(arg);
      }
    }
  }

  private static final class RightStripDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static RightStripDrawableFunc8567756a instance = null;

    public static RightStripDrawableFunc8567756a getInstance() {
      if(instance == null) {
        instance = new RightStripDrawableFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setRightStripDrawable(arg);
      }
    }
  }

  private static final class RotationFunce0893188 implements Anvil.AttrFunc<Float> {
    private static RotationFunce0893188 instance = null;

    public static RotationFunce0893188 getInstance() {
      if(instance == null) {
        instance = new RotationFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setRotation(arg);
    }
  }

  private static final class RotationXFunce0893188 implements Anvil.AttrFunc<Float> {
    private static RotationXFunce0893188 instance = null;

    public static RotationXFunce0893188 getInstance() {
      if(instance == null) {
        instance = new RotationXFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setRotationX(arg);
    }
  }

  private static final class RotationYFunce0893188 implements Anvil.AttrFunc<Float> {
    private static RotationYFunce0893188 instance = null;

    public static RotationYFunce0893188 getInstance() {
      if(instance == null) {
        instance = new RotationYFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setRotationY(arg);
    }
  }

  private static final class RouteTypesFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static RouteTypesFunc8567756a instance = null;

    public static RouteTypesFunc8567756a getInstance() {
      if(instance == null) {
        instance = new RouteTypesFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof MediaRouteButton) {
        ((MediaRouteButton) v).setRouteTypes(arg);
      }
    }
  }

  private static final class RowCountFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static RowCountFunc8567756a instance = null;

    public static RowCountFunc8567756a getInstance() {
      if(instance == null) {
        instance = new RowCountFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setRowCount(arg);
      }
    }
  }

  private static final class RowOrderPreservedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static RowOrderPreservedFunc148d6054 instance = null;

    public static RowOrderPreservedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new RowOrderPreservedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setRowOrderPreserved(arg);
      }
    }
  }

  private static final class SaveEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SaveEnabledFunc148d6054 instance = null;

    public static SaveEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SaveEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSaveEnabled(arg);
    }
  }

  private static final class SaveFromParentEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SaveFromParentEnabledFunc148d6054 instance = null;

    public static SaveFromParentEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SaveFromParentEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSaveFromParentEnabled(arg);
    }
  }

  private static final class ScaleTypeFunc1c5151cb implements Anvil.AttrFunc<ImageView.ScaleType> {
    private static ScaleTypeFunc1c5151cb instance = null;

    public static ScaleTypeFunc1c5151cb getInstance() {
      if(instance == null) {
        instance = new ScaleTypeFunc1c5151cb();
      }
      return instance;
    }

    public void apply(View v, final ImageView.ScaleType arg, final ImageView.ScaleType old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setScaleType(arg);
      }
    }
  }

  private static final class ScaleXFunce0893188 implements Anvil.AttrFunc<Float> {
    private static ScaleXFunce0893188 instance = null;

    public static ScaleXFunce0893188 getInstance() {
      if(instance == null) {
        instance = new ScaleXFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setScaleX(arg);
    }
  }

  private static final class ScaleYFunce0893188 implements Anvil.AttrFunc<Float> {
    private static ScaleYFunce0893188 instance = null;

    public static ScaleYFunce0893188 getInstance() {
      if(instance == null) {
        instance = new ScaleYFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setScaleY(arg);
    }
  }

  private static final class ScrollBarDefaultDelayBeforeFadeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ScrollBarDefaultDelayBeforeFadeFunc8567756a instance = null;

    public static ScrollBarDefaultDelayBeforeFadeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ScrollBarDefaultDelayBeforeFadeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarDefaultDelayBeforeFade(arg);
    }
  }

  private static final class ScrollBarFadeDurationFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ScrollBarFadeDurationFunc8567756a instance = null;

    public static ScrollBarFadeDurationFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ScrollBarFadeDurationFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarFadeDuration(arg);
    }
  }

  private static final class ScrollBarSizeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ScrollBarSizeFunc8567756a instance = null;

    public static ScrollBarSizeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ScrollBarSizeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarSize(arg);
    }
  }

  private static final class ScrollBarStyleFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ScrollBarStyleFunc8567756a instance = null;

    public static ScrollBarStyleFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ScrollBarStyleFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarStyle(arg);
    }
  }

  private static final class ScrollContainerFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ScrollContainerFunc148d6054 instance = null;

    public static ScrollContainerFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ScrollContainerFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setScrollContainer(arg);
    }
  }

  private static final class ScrollXFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ScrollXFunc8567756a instance = null;

    public static ScrollXFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ScrollXFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollX(arg);
    }
  }

  private static final class ScrollYFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ScrollYFunc8567756a instance = null;

    public static ScrollYFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ScrollYFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollY(arg);
    }
  }

  private static final class ScrollbarFadingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ScrollbarFadingEnabledFunc148d6054 instance = null;

    public static ScrollbarFadingEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ScrollbarFadingEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setScrollbarFadingEnabled(arg);
    }
  }

  private static final class ScrollerFunc7fa71345 implements Anvil.AttrFunc<Scroller> {
    private static ScrollerFunc7fa71345 instance = null;

    public static ScrollerFunc7fa71345 getInstance() {
      if(instance == null) {
        instance = new ScrollerFunc7fa71345();
      }
      return instance;
    }

    public void apply(View v, final Scroller arg, final Scroller old) {
      if (v instanceof TextView) {
        ((TextView) v).setScroller(arg);
      }
    }
  }

  private static final class ScrollingCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ScrollingCacheEnabledFunc148d6054 instance = null;

    public static ScrollingCacheEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ScrollingCacheEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setScrollingCacheEnabled(arg);
      }
    }
  }

  private static final class SearchableInfoFunc1f96c03c implements Anvil.AttrFunc<SearchableInfo> {
    private static SearchableInfoFunc1f96c03c instance = null;

    public static SearchableInfoFunc1f96c03c getInstance() {
      if(instance == null) {
        instance = new SearchableInfoFunc1f96c03c();
      }
      return instance;
    }

    public void apply(View v, final SearchableInfo arg, final SearchableInfo old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setSearchableInfo(arg);
      }
    }
  }

  private static final class SecondaryProgressFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SecondaryProgressFunc8567756a instance = null;

    public static SecondaryProgressFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SecondaryProgressFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setSecondaryProgress(arg);
      }
    }
  }

  private static final class SecondaryProgressTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static SecondaryProgressTintListFunc9e5e0e4e instance = null;

    public static SecondaryProgressTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new SecondaryProgressTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setSecondaryProgressTintList(arg);
      }
    }
  }

  private static final class SecondaryProgressTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static SecondaryProgressTintModeFuncabb7a84e instance = null;

    public static SecondaryProgressTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new SecondaryProgressTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setSecondaryProgressTintMode(arg);
      }
    }
  }

  private static final class SecureFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SecureFunc148d6054 instance = null;

    public static SecureFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SecureFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SurfaceView) {
        ((SurfaceView) v).setSecure(arg);
      }
    }
  }

  private static final class SelectAllOnFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SelectAllOnFocusFunc148d6054 instance = null;

    public static SelectAllOnFocusFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SelectAllOnFocusFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setSelectAllOnFocus(arg);
      }
    }
  }

  private static final class SelectedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SelectedFunc148d6054 instance = null;

    public static SelectedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SelectedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSelected(arg);
    }
  }

  private static final class SelectedDateVerticalBarFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static SelectedDateVerticalBarFuncfb47464a instance = null;

    public static SelectedDateVerticalBarFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new SelectedDateVerticalBarFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setSelectedDateVerticalBar(arg);
      }
    }
  }

  private static final class SelectedDateVerticalBarFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SelectedDateVerticalBarFunc8567756a instance = null;

    public static SelectedDateVerticalBarFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SelectedDateVerticalBarFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setSelectedDateVerticalBar(arg);
      }
    }
  }

  private static final class SelectedGroupFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SelectedGroupFunc8567756a instance = null;

    public static SelectedGroupFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SelectedGroupFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setSelectedGroup(arg);
      }
    }
  }

  private static final class SelectedWeekBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SelectedWeekBackgroundColorFunc8567756a instance = null;

    public static SelectedWeekBackgroundColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SelectedWeekBackgroundColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setSelectedWeekBackgroundColor(arg);
      }
    }
  }

  private static final class SelectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SelectionFunc8567756a instance = null;

    public static SelectionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SelectionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AdapterView) {
        ((AdapterView) v).setSelection(arg);
      }
      if (v instanceof EditText) {
        ((EditText) v).setSelection(arg);
      }
    }
  }

  private static final class SelectorFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static SelectorFuncfb47464a instance = null;

    public static SelectorFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new SelectorFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setSelector(arg);
      }
    }
  }

  private static final class SelectorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SelectorFunc8567756a instance = null;

    public static SelectorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SelectorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setSelector(arg);
      }
    }
  }

  private static final class ShiftedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ShiftedFunc148d6054 instance = null;

    public static ShiftedFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ShiftedFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setShifted(arg);
      }
    }
  }

  private static final class ShowDividersFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ShowDividersFunc8567756a instance = null;

    public static ShowDividersFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ShowDividersFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setShowDividers(arg);
      }
    }
  }

  private static final class ShowSoftInputOnFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ShowSoftInputOnFocusFunc148d6054 instance = null;

    public static ShowSoftInputOnFocusFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ShowSoftInputOnFocusFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setShowSoftInputOnFocus(arg);
      }
    }
  }

  private static final class ShowTextFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ShowTextFunc148d6054 instance = null;

    public static ShowTextFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ShowTextFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof Switch) {
        ((Switch) v).setShowText(arg);
      }
    }
  }

  private static final class ShowWeekNumberFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ShowWeekNumberFunc148d6054 instance = null;

    public static ShowWeekNumberFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ShowWeekNumberFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setShowWeekNumber(arg);
      }
    }
  }

  private static final class ShownWeekCountFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ShownWeekCountFunc8567756a instance = null;

    public static ShownWeekCountFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ShownWeekCountFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setShownWeekCount(arg);
      }
    }
  }

  private static final class ShrinkAllColumnsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ShrinkAllColumnsFunc148d6054 instance = null;

    public static ShrinkAllColumnsFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ShrinkAllColumnsFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TableLayout) {
        ((TableLayout) v).setShrinkAllColumns(arg);
      }
    }
  }

  private static final class SingleLineFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SingleLineFunc148d6054 instance = null;

    public static SingleLineFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SingleLineFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setSingleLine(arg);
      }
    }
  }

  private static final class SmoothScrollbarEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SmoothScrollbarEnabledFunc148d6054 instance = null;

    public static SmoothScrollbarEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SmoothScrollbarEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setSmoothScrollbarEnabled(arg);
      }
    }
  }

  private static final class SmoothScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SmoothScrollingEnabledFunc148d6054 instance = null;

    public static SmoothScrollingEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SmoothScrollingEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof HorizontalScrollView) {
        ((HorizontalScrollView) v).setSmoothScrollingEnabled(arg);
      }
      if (v instanceof ScrollView) {
        ((ScrollView) v).setSmoothScrollingEnabled(arg);
      }
    }
  }

  private static final class SoundEffectsEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SoundEffectsEnabledFunc148d6054 instance = null;

    public static SoundEffectsEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SoundEffectsEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSoundEffectsEnabled(arg);
    }
  }

  private static final class SpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SpacingFunc8567756a instance = null;

    public static SpacingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SpacingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setSpacing(arg);
      }
    }
  }

  private static final class SpannableFactoryFunc195c8c78 implements Anvil.AttrFunc<Spannable.Factory> {
    private static SpannableFactoryFunc195c8c78 instance = null;

    public static SpannableFactoryFunc195c8c78 getInstance() {
      if(instance == null) {
        instance = new SpannableFactoryFunc195c8c78();
      }
      return instance;
    }

    public void apply(View v, final Spannable.Factory arg, final Spannable.Factory old) {
      if (v instanceof TextView) {
        ((TextView) v).setSpannableFactory(arg);
      }
    }
  }

  private static final class SpinnersShownFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SpinnersShownFunc148d6054 instance = null;

    public static SpinnersShownFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SpinnersShownFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof DatePicker) {
        ((DatePicker) v).setSpinnersShown(arg);
      }
    }
  }

  private static final class SplitTrackFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SplitTrackFunc148d6054 instance = null;

    public static SplitTrackFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SplitTrackFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setSplitTrack(arg);
      }
      if (v instanceof Switch) {
        ((Switch) v).setSplitTrack(arg);
      }
    }
  }

  private static final class StackFromBottomFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static StackFromBottomFunc148d6054 instance = null;

    public static StackFromBottomFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new StackFromBottomFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setStackFromBottom(arg);
      }
    }
  }

  private static final class StateListAnimatorFunc24d8c9cd implements Anvil.AttrFunc<StateListAnimator> {
    private static StateListAnimatorFunc24d8c9cd instance = null;

    public static StateListAnimatorFunc24d8c9cd getInstance() {
      if(instance == null) {
        instance = new StateListAnimatorFunc24d8c9cd();
      }
      return instance;
    }

    public void apply(View v, final StateListAnimator arg, final StateListAnimator old) {
      v.setStateListAnimator(arg);
    }
  }

  private static final class StepSizeFunce0893188 implements Anvil.AttrFunc<Float> {
    private static StepSizeFunce0893188 instance = null;

    public static StepSizeFunce0893188 getInstance() {
      if(instance == null) {
        instance = new StepSizeFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setStepSize(arg);
      }
    }
  }

  private static final class StreamVolumeFunce0893188 implements Anvil.AttrFunc<Float> {
    private static StreamVolumeFunce0893188 instance = null;

    public static StreamVolumeFunce0893188 getInstance() {
      if(instance == null) {
        instance = new StreamVolumeFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof TvView) {
        ((TvView) v).setStreamVolume(arg);
      }
    }
  }

  private static final class StretchAllColumnsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static StretchAllColumnsFunc148d6054 instance = null;

    public static StretchAllColumnsFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new StretchAllColumnsFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TableLayout) {
        ((TableLayout) v).setStretchAllColumns(arg);
      }
    }
  }

  private static final class StretchModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static StretchModeFunc8567756a instance = null;

    public static StretchModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new StretchModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setStretchMode(arg);
      }
    }
  }

  private static final class StripEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static StripEnabledFunc148d6054 instance = null;

    public static StripEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new StripEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setStripEnabled(arg);
      }
    }
  }

  private static final class SubmitButtonEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static SubmitButtonEnabledFunc148d6054 instance = null;

    public static SubmitButtonEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new SubmitButtonEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setSubmitButtonEnabled(arg);
      }
    }
  }

  private static final class SubtitleFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SubtitleFunc8567756a instance = null;

    public static SubtitleFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SubtitleFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setSubtitle(arg);
      }
    }
  }

  private static final class SubtitleFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static SubtitleFuncc0af808b instance = null;

    public static SubtitleFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new SubtitleFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setSubtitle(arg);
      }
    }
  }

  private static final class SubtitleTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SubtitleTextColorFunc8567756a instance = null;

    public static SubtitleTextColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SubtitleTextColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setSubtitleTextColor(arg);
      }
    }
  }

  private static final class SuggestionsAdapterFunc2f59eaee implements Anvil.AttrFunc<CursorAdapter> {
    private static SuggestionsAdapterFunc2f59eaee instance = null;

    public static SuggestionsAdapterFunc2f59eaee getInstance() {
      if(instance == null) {
        instance = new SuggestionsAdapterFunc2f59eaee();
      }
      return instance;
    }

    public void apply(View v, final CursorAdapter arg, final CursorAdapter old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setSuggestionsAdapter(arg);
      }
    }
  }

  private static final class SurfaceTextureFuncc2f30b12 implements Anvil.AttrFunc<SurfaceTexture> {
    private static SurfaceTextureFuncc2f30b12 instance = null;

    public static SurfaceTextureFuncc2f30b12 getInstance() {
      if(instance == null) {
        instance = new SurfaceTextureFuncc2f30b12();
      }
      return instance;
    }

    public void apply(View v, final SurfaceTexture arg, final SurfaceTexture old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setSurfaceTexture(arg);
      }
    }
  }

  private static final class SurfaceTextureListenerFunc528d697a implements Anvil.AttrFunc<TextureView.SurfaceTextureListener> {
    private static SurfaceTextureListenerFunc528d697a instance = null;

    public static SurfaceTextureListenerFunc528d697a getInstance() {
      if(instance == null) {
        instance = new SurfaceTextureListenerFunc528d697a();
      }
      return instance;
    }

    public void apply(View v, final TextureView.SurfaceTextureListener arg, final TextureView.SurfaceTextureListener old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setSurfaceTextureListener(arg);
      }
    }
  }

  private static final class SwitchMinWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SwitchMinWidthFunc8567756a instance = null;

    public static SwitchMinWidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SwitchMinWidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setSwitchMinWidth(arg);
      }
    }
  }

  private static final class SwitchPaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SwitchPaddingFunc8567756a instance = null;

    public static SwitchPaddingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SwitchPaddingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setSwitchPadding(arg);
      }
    }
  }

  private static final class SwitchTypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    private static SwitchTypefaceFunc53b4afb instance = null;

    public static SwitchTypefaceFunc53b4afb getInstance() {
      if(instance == null) {
        instance = new SwitchTypefaceFunc53b4afb();
      }
      return instance;
    }

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof Switch) {
        ((Switch) v).setSwitchTypeface(arg);
      }
    }
  }

  private static final class SystemUiVisibilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static SystemUiVisibilityFunc8567756a instance = null;

    public static SystemUiVisibilityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new SystemUiVisibilityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setSystemUiVisibility(arg);
    }
  }

  private static final class TagFunc3f697993 implements Anvil.AttrFunc<Object> {
    private static TagFunc3f697993 instance = null;

    public static TagFunc3f697993 getInstance() {
      if(instance == null) {
        instance = new TagFunc3f697993();
      }
      return instance;
    }

    public void apply(View v, final Object arg, final Object old) {
      v.setTag(arg);
    }
  }

  private static final class TextFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TextFunc8567756a instance = null;

    public static TextFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TextFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setText(arg);
      }
    }
  }

  private static final class TextAlignmentFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TextAlignmentFunc8567756a instance = null;

    public static TextAlignmentFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TextAlignmentFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setTextAlignment(arg);
    }
  }

  private static final class TextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static TextColorFunc9e5e0e4e instance = null;

    public static TextColorFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new TextColorFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextColor(arg);
      }
    }
  }

  private static final class TextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TextColorFunc8567756a instance = null;

    public static TextColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TextColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextColor(arg);
      }
    }
  }

  private static final class TextDirectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TextDirectionFunc8567756a instance = null;

    public static TextDirectionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TextDirectionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setTextDirection(arg);
    }
  }

  private static final class TextFilterEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static TextFilterEnabledFunc148d6054 instance = null;

    public static TextFilterEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new TextFilterEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setTextFilterEnabled(arg);
      }
    }
  }

  private static final class TextIsSelectableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static TextIsSelectableFunc148d6054 instance = null;

    public static TextIsSelectableFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new TextIsSelectableFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextIsSelectable(arg);
      }
    }
  }

  private static final class TextKeepStateFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static TextKeepStateFuncc0af808b instance = null;

    public static TextKeepStateFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new TextKeepStateFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextKeepState(arg);
      }
    }
  }

  private static final class TextLocaleFuncba8c481a implements Anvil.AttrFunc<Locale> {
    private static TextLocaleFuncba8c481a instance = null;

    public static TextLocaleFuncba8c481a getInstance() {
      if(instance == null) {
        instance = new TextLocaleFuncba8c481a();
      }
      return instance;
    }

    public void apply(View v, final Locale arg, final Locale old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextLocale(arg);
      }
    }
  }

  private static final class TextOffFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static TextOffFuncc0af808b instance = null;

    public static TextOffFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new TextOffFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Switch) {
        ((Switch) v).setTextOff(arg);
      }
      if (v instanceof ToggleButton) {
        ((ToggleButton) v).setTextOff(arg);
      }
    }
  }

  private static final class TextOnFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static TextOnFuncc0af808b instance = null;

    public static TextOnFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new TextOnFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Switch) {
        ((Switch) v).setTextOn(arg);
      }
      if (v instanceof ToggleButton) {
        ((ToggleButton) v).setTextOn(arg);
      }
    }
  }

  private static final class TextScaleXFunce0893188 implements Anvil.AttrFunc<Float> {
    private static TextScaleXFunce0893188 instance = null;

    public static TextScaleXFunce0893188 getInstance() {
      if(instance == null) {
        instance = new TextScaleXFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextScaleX(arg);
      }
    }
  }

  private static final class ThresholdFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ThresholdFunc8567756a instance = null;

    public static ThresholdFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ThresholdFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setThreshold(arg);
      }
    }
  }

  private static final class ThumbFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ThumbFuncfb47464a instance = null;

    public static ThumbFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ThumbFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumb(arg);
      }
    }
  }

  private static final class ThumbDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static ThumbDrawableFuncfb47464a instance = null;

    public static ThumbDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new ThumbDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Switch) {
        ((Switch) v).setThumbDrawable(arg);
      }
    }
  }

  private static final class ThumbOffsetFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ThumbOffsetFunc8567756a instance = null;

    public static ThumbOffsetFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ThumbOffsetFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumbOffset(arg);
      }
    }
  }

  private static final class ThumbResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ThumbResourceFunc8567756a instance = null;

    public static ThumbResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ThumbResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setThumbResource(arg);
      }
    }
  }

  private static final class ThumbTextPaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ThumbTextPaddingFunc8567756a instance = null;

    public static ThumbTextPaddingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ThumbTextPaddingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setThumbTextPadding(arg);
      }
    }
  }

  private static final class ThumbTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    private static ThumbTintListFunc9e5e0e4e instance = null;

    public static ThumbTintListFunc9e5e0e4e getInstance() {
      if(instance == null) {
        instance = new ThumbTintListFunc9e5e0e4e();
      }
      return instance;
    }

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumbTintList(arg);
      }
    }
  }

  private static final class ThumbTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    private static ThumbTintModeFuncabb7a84e instance = null;

    public static ThumbTintModeFuncabb7a84e getInstance() {
      if(instance == null) {
        instance = new ThumbTintModeFuncabb7a84e();
      }
      return instance;
    }

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumbTintMode(arg);
      }
    }
  }

  private static final class TimeZoneFunc473e3665 implements Anvil.AttrFunc<String> {
    private static TimeZoneFunc473e3665 instance = null;

    public static TimeZoneFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new TimeZoneFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TextClock) {
        ((TextClock) v).setTimeZone(arg);
      }
    }
  }

  private static final class TitleFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TitleFunc8567756a instance = null;

    public static TitleFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TitleFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setTitle(arg);
      }
    }
  }

  private static final class TitleFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    private static TitleFuncc0af808b instance = null;

    public static TitleFuncc0af808b getInstance() {
      if(instance == null) {
        instance = new TitleFuncc0af808b();
      }
      return instance;
    }

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setTitle(arg);
      }
    }
  }

  private static final class TitleTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TitleTextColorFunc8567756a instance = null;

    public static TitleTextColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TitleTextColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setTitleTextColor(arg);
      }
    }
  }

  private static final class TokenizerFunc6ae2b151 implements Anvil.AttrFunc<MultiAutoCompleteTextView.Tokenizer> {
    private static TokenizerFunc6ae2b151 instance = null;

    public static TokenizerFunc6ae2b151 getInstance() {
      if(instance == null) {
        instance = new TokenizerFunc6ae2b151();
      }
      return instance;
    }

    public void apply(View v, final MultiAutoCompleteTextView.Tokenizer arg, final MultiAutoCompleteTextView.Tokenizer old) {
      if (v instanceof MultiAutoCompleteTextView) {
        ((MultiAutoCompleteTextView) v).setTokenizer(arg);
      }
    }
  }

  private static final class TopFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TopFunc8567756a instance = null;

    public static TopFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TopFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setTop(arg);
    }
  }

  private static final class TouchDelegateFunc8217a01a implements Anvil.AttrFunc<TouchDelegate> {
    private static TouchDelegateFunc8217a01a instance = null;

    public static TouchDelegateFunc8217a01a getInstance() {
      if(instance == null) {
        instance = new TouchDelegateFunc8217a01a();
      }
      return instance;
    }

    public void apply(View v, final TouchDelegate arg, final TouchDelegate old) {
      v.setTouchDelegate(arg);
    }
  }

  private static final class TouchscreenBlocksFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static TouchscreenBlocksFocusFunc148d6054 instance = null;

    public static TouchscreenBlocksFocusFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new TouchscreenBlocksFocusFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setTouchscreenBlocksFocus(arg);
      }
    }
  }

  private static final class TrackDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    private static TrackDrawableFuncfb47464a instance = null;

    public static TrackDrawableFuncfb47464a getInstance() {
      if(instance == null) {
        instance = new TrackDrawableFuncfb47464a();
      }
      return instance;
    }

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Switch) {
        ((Switch) v).setTrackDrawable(arg);
      }
    }
  }

  private static final class TrackResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TrackResourceFunc8567756a instance = null;

    public static TrackResourceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TrackResourceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setTrackResource(arg);
      }
    }
  }

  private static final class TranscriptModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static TranscriptModeFunc8567756a instance = null;

    public static TranscriptModeFunc8567756a getInstance() {
      if(instance == null) {
        instance = new TranscriptModeFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setTranscriptMode(arg);
      }
    }
  }

  private static final class TransformFunc6b9f325 implements Anvil.AttrFunc<Matrix> {
    private static TransformFunc6b9f325 instance = null;

    public static TransformFunc6b9f325 getInstance() {
      if(instance == null) {
        instance = new TransformFunc6b9f325();
      }
      return instance;
    }

    public void apply(View v, final Matrix arg, final Matrix old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setTransform(arg);
      }
    }
  }

  private static final class TransformationMethodFunc65bbcab5 implements Anvil.AttrFunc<TransformationMethod> {
    private static TransformationMethodFunc65bbcab5 instance = null;

    public static TransformationMethodFunc65bbcab5 getInstance() {
      if(instance == null) {
        instance = new TransformationMethodFunc65bbcab5();
      }
      return instance;
    }

    public void apply(View v, final TransformationMethod arg, final TransformationMethod old) {
      if (v instanceof TextView) {
        ((TextView) v).setTransformationMethod(arg);
      }
    }
  }

  private static final class TransitionGroupFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static TransitionGroupFunc148d6054 instance = null;

    public static TransitionGroupFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new TransitionGroupFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setTransitionGroup(arg);
      }
    }
  }

  private static final class TransitionNameFunc473e3665 implements Anvil.AttrFunc<String> {
    private static TransitionNameFunc473e3665 instance = null;

    public static TransitionNameFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new TransitionNameFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      v.setTransitionName(arg);
    }
  }

  private static final class TranslationXFunce0893188 implements Anvil.AttrFunc<Float> {
    private static TranslationXFunce0893188 instance = null;

    public static TranslationXFunce0893188 getInstance() {
      if(instance == null) {
        instance = new TranslationXFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setTranslationX(arg);
    }
  }

  private static final class TranslationYFunce0893188 implements Anvil.AttrFunc<Float> {
    private static TranslationYFunce0893188 instance = null;

    public static TranslationYFunce0893188 getInstance() {
      if(instance == null) {
        instance = new TranslationYFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setTranslationY(arg);
    }
  }

  private static final class TranslationZFunce0893188 implements Anvil.AttrFunc<Float> {
    private static TranslationZFunce0893188 instance = null;

    public static TranslationZFunce0893188 getInstance() {
      if(instance == null) {
        instance = new TranslationZFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setTranslationZ(arg);
    }
  }

  private static final class TypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    private static TypefaceFunc53b4afb instance = null;

    public static TypefaceFunc53b4afb getInstance() {
      if(instance == null) {
        instance = new TypefaceFunc53b4afb();
      }
      return instance;
    }

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof TextView) {
        ((TextView) v).setTypeface(arg);
      }
    }
  }

  private static final class UncertainGestureColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static UncertainGestureColorFunc8567756a instance = null;

    public static UncertainGestureColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new UncertainGestureColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setUncertainGestureColor(arg);
      }
    }
  }

  private static final class UnfocusedMonthDateColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static UnfocusedMonthDateColorFunc8567756a instance = null;

    public static UnfocusedMonthDateColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new UnfocusedMonthDateColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setUnfocusedMonthDateColor(arg);
      }
    }
  }

  private static final class UnselectedAlphaFunce0893188 implements Anvil.AttrFunc<Float> {
    private static UnselectedAlphaFunce0893188 instance = null;

    public static UnselectedAlphaFunce0893188 getInstance() {
      if(instance == null) {
        instance = new UnselectedAlphaFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setUnselectedAlpha(arg);
      }
    }
  }

  private static final class UpFunc7b013b1f implements Anvil.AttrFunc<LocalActivityManager> {
    private static UpFunc7b013b1f instance = null;

    public static UpFunc7b013b1f getInstance() {
      if(instance == null) {
        instance = new UpFunc7b013b1f();
      }
      return instance;
    }

    public void apply(View v, final LocalActivityManager arg, final LocalActivityManager old) {
      if (v instanceof TabHost) {
        ((TabHost) v).setup(arg);
      }
    }
  }

  private static final class UseDefaultMarginsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static UseDefaultMarginsFunc148d6054 instance = null;

    public static UseDefaultMarginsFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new UseDefaultMarginsFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setUseDefaultMargins(arg);
      }
    }
  }

  private static final class ValidatorFuncd6d080a9 implements Anvil.AttrFunc<AutoCompleteTextView.Validator> {
    private static ValidatorFuncd6d080a9 instance = null;

    public static ValidatorFuncd6d080a9 getInstance() {
      if(instance == null) {
        instance = new ValidatorFuncd6d080a9();
      }
      return instance;
    }

    public void apply(View v, final AutoCompleteTextView.Validator arg, final AutoCompleteTextView.Validator old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setValidator(arg);
      }
    }
  }

  private static final class ValueFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static ValueFunc8567756a instance = null;

    public static ValueFunc8567756a getInstance() {
      if(instance == null) {
        instance = new ValueFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setValue(arg);
      }
    }
  }

  private static final class VelocityScaleFunce0893188 implements Anvil.AttrFunc<Float> {
    private static VelocityScaleFunce0893188 instance = null;

    public static VelocityScaleFunce0893188 getInstance() {
      if(instance == null) {
        instance = new VelocityScaleFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setVelocityScale(arg);
      }
    }
  }

  private static final class VerticalCorrectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static VerticalCorrectionFunc8567756a instance = null;

    public static VerticalCorrectionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new VerticalCorrectionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setVerticalCorrection(arg);
      }
    }
  }

  private static final class VerticalFadingEdgeEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static VerticalFadingEdgeEnabledFunc148d6054 instance = null;

    public static VerticalFadingEdgeEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new VerticalFadingEdgeEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setVerticalFadingEdgeEnabled(arg);
    }
  }

  private static final class VerticalGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static VerticalGravityFunc8567756a instance = null;

    public static VerticalGravityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new VerticalGravityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setVerticalGravity(arg);
      }
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setVerticalGravity(arg);
      }
    }
  }

  private static final class VerticalScrollBarEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static VerticalScrollBarEnabledFunc148d6054 instance = null;

    public static VerticalScrollBarEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new VerticalScrollBarEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setVerticalScrollBarEnabled(arg);
    }
  }

  private static final class VerticalScrollbarOverlayFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static VerticalScrollbarOverlayFunc148d6054 instance = null;

    public static VerticalScrollbarOverlayFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new VerticalScrollbarOverlayFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setVerticalScrollbarOverlay(arg);
      }
    }
  }

  private static final class VerticalScrollbarPositionFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static VerticalScrollbarPositionFunc8567756a instance = null;

    public static VerticalScrollbarPositionFunc8567756a getInstance() {
      if(instance == null) {
        instance = new VerticalScrollbarPositionFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setVerticalScrollbarPosition(arg);
    }
  }

  private static final class VerticalSpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static VerticalSpacingFunc8567756a instance = null;

    public static VerticalSpacingFunc8567756a getInstance() {
      if(instance == null) {
        instance = new VerticalSpacingFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setVerticalSpacing(arg);
      }
    }
  }

  private static final class VideoPathFunc473e3665 implements Anvil.AttrFunc<String> {
    private static VideoPathFunc473e3665 instance = null;

    public static VideoPathFunc473e3665 getInstance() {
      if(instance == null) {
        instance = new VideoPathFunc473e3665();
      }
      return instance;
    }

    public void apply(View v, final String arg, final String old) {
      if (v instanceof VideoView) {
        ((VideoView) v).setVideoPath(arg);
      }
    }
  }

  private static final class VideoURIFunc75f430fc implements Anvil.AttrFunc<Uri> {
    private static VideoURIFunc75f430fc instance = null;

    public static VideoURIFunc75f430fc getInstance() {
      if(instance == null) {
        instance = new VideoURIFunc75f430fc();
      }
      return instance;
    }

    public void apply(View v, final Uri arg, final Uri old) {
      if (v instanceof VideoView) {
        ((VideoView) v).setVideoURI(arg);
      }
    }
  }

  private static final class VisibilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static VisibilityFunc8567756a instance = null;

    public static VisibilityFunc8567756a getInstance() {
      if(instance == null) {
        instance = new VisibilityFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      v.setVisibility(arg);
    }
  }

  private static final class WebChromeClientFunc54f22bac implements Anvil.AttrFunc<WebChromeClient> {
    private static WebChromeClientFunc54f22bac instance = null;

    public static WebChromeClientFunc54f22bac getInstance() {
      if(instance == null) {
        instance = new WebChromeClientFunc54f22bac();
      }
      return instance;
    }

    public void apply(View v, final WebChromeClient arg, final WebChromeClient old) {
      if (v instanceof WebView) {
        ((WebView) v).setWebChromeClient(arg);
      }
    }
  }

  private static final class WebContentsDebuggingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static WebContentsDebuggingEnabledFunc148d6054 instance = null;

    public static WebContentsDebuggingEnabledFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new WebContentsDebuggingEnabledFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setWebContentsDebuggingEnabled(arg);
      }
    }
  }

  private static final class WebViewClientFunc95cf0d57 implements Anvil.AttrFunc<WebViewClient> {
    private static WebViewClientFunc95cf0d57 instance = null;

    public static WebViewClientFunc95cf0d57 getInstance() {
      if(instance == null) {
        instance = new WebViewClientFunc95cf0d57();
      }
      return instance;
    }

    public void apply(View v, final WebViewClient arg, final WebViewClient old) {
      if (v instanceof WebView) {
        ((WebView) v).setWebViewClient(arg);
      }
    }
  }

  private static final class WeekDayTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static WeekDayTextAppearanceFunc8567756a instance = null;

    public static WeekDayTextAppearanceFunc8567756a getInstance() {
      if(instance == null) {
        instance = new WeekDayTextAppearanceFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setWeekDayTextAppearance(arg);
      }
    }
  }

  private static final class WeekNumberColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static WeekNumberColorFunc8567756a instance = null;

    public static WeekNumberColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new WeekNumberColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setWeekNumberColor(arg);
      }
    }
  }

  private static final class WeekSeparatorLineColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static WeekSeparatorLineColorFunc8567756a instance = null;

    public static WeekSeparatorLineColorFunc8567756a getInstance() {
      if(instance == null) {
        instance = new WeekSeparatorLineColorFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setWeekSeparatorLineColor(arg);
      }
    }
  }

  private static final class WeightSumFunce0893188 implements Anvil.AttrFunc<Float> {
    private static WeightSumFunce0893188 instance = null;

    public static WeightSumFunce0893188 getInstance() {
      if(instance == null) {
        instance = new WeightSumFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setWeightSum(arg);
      }
    }
  }

  private static final class WidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    private static WidthFunc8567756a instance = null;

    public static WidthFunc8567756a getInstance() {
      if(instance == null) {
        instance = new WidthFunc8567756a();
      }
      return instance;
    }

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setWidth(arg);
      }
    }
  }

  private static final class WillNotCacheDrawingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static WillNotCacheDrawingFunc148d6054 instance = null;

    public static WillNotCacheDrawingFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new WillNotCacheDrawingFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setWillNotCacheDrawing(arg);
    }
  }

  private static final class WillNotDrawFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static WillNotDrawFunc148d6054 instance = null;

    public static WillNotDrawFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new WillNotDrawFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setWillNotDraw(arg);
    }
  }

  private static final class WrapSelectorWheelFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static WrapSelectorWheelFunc148d6054 instance = null;

    public static WrapSelectorWheelFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new WrapSelectorWheelFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setWrapSelectorWheel(arg);
      }
    }
  }

  private static final class XFunce0893188 implements Anvil.AttrFunc<Float> {
    private static XFunce0893188 instance = null;

    public static XFunce0893188 getInstance() {
      if(instance == null) {
        instance = new XFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setX(arg);
    }
  }

  private static final class YFunce0893188 implements Anvil.AttrFunc<Float> {
    private static YFunce0893188 instance = null;

    public static YFunce0893188 getInstance() {
      if(instance == null) {
        instance = new YFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setY(arg);
    }
  }

  private static final class ZFunce0893188 implements Anvil.AttrFunc<Float> {
    private static ZFunce0893188 instance = null;

    public static ZFunce0893188 getInstance() {
      if(instance == null) {
        instance = new ZFunce0893188();
      }
      return instance;
    }

    public void apply(View v, final Float arg, final Float old) {
      v.setZ(arg);
    }
  }

  private static final class ZOrderMediaOverlayFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ZOrderMediaOverlayFunc148d6054 instance = null;

    public static ZOrderMediaOverlayFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ZOrderMediaOverlayFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SurfaceView) {
        ((SurfaceView) v).setZOrderMediaOverlay(arg);
      }
    }
  }

  private static final class ZOrderOnTopFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    private static ZOrderOnTopFunc148d6054 instance = null;

    public static ZOrderOnTopFunc148d6054 getInstance() {
      if(instance == null) {
        instance = new ZOrderOnTopFunc148d6054();
      }
      return instance;
    }

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SurfaceView) {
        ((SurfaceView) v).setZOrderOnTop(arg);
      }
    }
  }

  private static final class ZoomSpeedFunc17c521d0 implements Anvil.AttrFunc<Long> {
    private static ZoomSpeedFunc17c521d0 instance = null;

    public static ZoomSpeedFunc17c521d0 getInstance() {
      if(instance == null) {
        instance = new ZoomSpeedFunc17c521d0();
      }
      return instance;
    }

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof ZoomButton) {
        ((ZoomButton) v).setZoomSpeed(arg);
      }
      if (v instanceof ZoomControls) {
        ((ZoomControls) v).setZoomSpeed(arg);
      }
    }
  }
}
