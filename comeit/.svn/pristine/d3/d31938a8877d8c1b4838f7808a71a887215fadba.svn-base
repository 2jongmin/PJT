package comeit.framework.common.abstracts.vo;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BaseVO implements Serializable {
  private static final long serialVersionUID = -4361206404415369656L;
  
  private String registDtime;

  public String getRegistDtime() {
    return registDtime;
  }

  public void setRegistDtime(String registDtime) {
    this.registDtime = registDtime;
  }
  
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
}
