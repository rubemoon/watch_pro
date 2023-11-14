package com.fag.watchpro;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GoodContentValidator implements ConstraintValidator<GoodContent, WatchlistItem>{

	@Override
	public boolean isValid(WatchlistItem value, ConstraintValidatorContext context) {
		
		return !(Double.valueOf(value.getRating()) >= 8 &&  "L".equals(value.getPriority()));
	}
}