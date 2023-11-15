package com.fag.watchpro.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.fag.watchpro.domain.WatchlistItem;

public class GoodContentValidator implements ConstraintValidator<GoodContent, WatchlistItem>{

	@Override
	public boolean isValid(WatchlistItem value, ConstraintValidatorContext context) {
		
		return !(Double.valueOf(value.getRating()) >= 8 &&  "L".equals(value.getPriority()));
	}
}