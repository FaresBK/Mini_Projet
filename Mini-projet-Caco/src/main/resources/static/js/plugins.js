	$(document).ready(function(){

		$(".gear-check").click(function(){
			$(".color-option").fadeToggle();
		});

		var colorLi=$(".color-option ul li");

		colorLi
		.eq(0).css("backgroundColor","#E41B17").end()
		.eq(1).css("backgroundColor","#009AFF").end()
		.eq(2).css("backgroundColor","#E426D5").end()
		.eq(3).css("backgroundColor","#1b9a27").end()
		.eq(4).css("backgroundColor","#a59f20"); 

		colorLi.click(function(){
			$("#theme").attr("href",$(this).attr("data-value"));
		});

		
	    //Caching the scroll button
	    ScrollButton=$("#scroll-top");


	    $(window).scroll(function(){
	    	$(this).scrollTop() >= 700 ? ScrollButton.show():ScrollButton.hide();
	    });

	    //click on scroll button
	    ScrollButton.click(function(){
	    	$("html,body").animate({scrollTop:0},600);
	    });


	});

	$(window).load(function(){
		$(".loading-overlay").fadeOut(1000);
	});

		$(document).ready(function(){

			$(".gear-check").click(function(){
				$(".color-option").fadeToggle();
			});

			var colorLi=$(".color-option ul li");

			colorLi
			.eq(0).css("backgroundColor","#E41B17").end()
			.eq(1).css("backgroundColor","#009AFF").end()
			.eq(2).css("backgroundColor","#E426D5").end()
			.eq(3).css("backgroundColor","#1b9a27").end()
			.eq(4).css("backgroundColor","#a59f20"); 

			colorLi.click(function(){
				$("#theme").attr("href",$(this).attr("data-value"));
			});


		    //Caching the scroll button
		    ScrollButton=$("#scroll-top");
		    $(window).scroll(function(){
		    	$(this).scrollTop() >= 700 ? ScrollButton.show():ScrollButton.hide();
		    });


		    //click on scroll button
		    ScrollButton.click(function(){
		    	$("html,body").animate({scrollTop:0},600);
		    });


		});

		$(window).load(function(){
			$(".loading-overlay").fadeOut(1000);
		});

