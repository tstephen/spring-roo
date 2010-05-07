package __TOP_LEVEL_PACKAGE__.gwt.scaffold;

import com.google.gwt.app.place.PlacePickerView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import __TOP_LEVEL_PACKAGE__.gwt.scaffold.place.ApplicationListPlace;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The outermost UI of the application.
 */
public class ScaffoldShell extends Composite {
  interface Binder extends UiBinder<Widget, ScaffoldShell> {
  }
  private static final Binder BINDER = GWT.create(Binder.class);

  @UiField SimplePanel body;
  @UiField PlacePickerView<ApplicationListPlace> placesBox;
  @UiField DivElement error;

  public ScaffoldShell() {
    initWidget(BINDER.createAndBindUi(this));
  }

  /**
   * @return the body
   */
  public SimplePanel getBody() {
    return body;
  }

  /**
   * @return the navigator
   */
  public PlacePickerView<ApplicationListPlace> getPlacesBox() {
    return placesBox;
  }

  /**
   * @param string
   */
  public void setError(String string) {
    error.setInnerText(string);
  }
}

