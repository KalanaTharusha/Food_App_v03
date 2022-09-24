package com.example.food_app_v03;

import java.util.ArrayList;

public class Data {
    private ArrayList<Restaurant> restaurantList;
    private ArrayList<Food> foodList;

    public Data() {
        restaurantList = new ArrayList<>();
        foodList = new ArrayList<>();

    }

    public ArrayList<Restaurant> makeRestaurantList(){

        restaurantList.add(new Restaurant("001", "Feast Lounge", R.drawable.re01, "508 Cranford Rd \nSmithfield, Virginia."));
        restaurantList.add(new Restaurant("002", "Cuisine Wave", R.drawable.re02, "3853 N Mill Rd \nDryden, Michigan."));
        restaurantList.add(new Restaurant("003", "Eatery Hotspot", R.drawable.re03, "4 Birchwood Cir \nClinton, Connecticut."));
        restaurantList.add(new Restaurant("004", "McBistro", R.drawable.re04, "6155 9th Hwy \nSilverthorne, Colorado."));
        restaurantList.add(new Restaurant("005", "Deli Divine", R.drawable.re05, "28 Acorn Rd \nDennis, Massachusetts."));
        restaurantList.add(new Restaurant("006", "Grub Chef", R.drawable.re06, "612 Gardner St \nSouth Beloit, Illinois."));
        restaurantList.add(new Restaurant("007", "Kitchen Sensation", R.drawable.re07, "2379 Upper Trent Way \nVandalia, Ohio."));
        restaurantList.add(new Restaurant("008", "Munchies", R.drawable.re08, "497 Ridge Rd \nBowdoinham, Maine."));
        restaurantList.add(new Restaurant("009", "Freddy’s Stove", R.drawable.re09, "13603 SE Jamie Ct \nClackamas, Oregon."));
        restaurantList.add(new Restaurant("010", "Paterro’s Kitchen", R.drawable.re10, "25377 Virginia Smith Dr \nCalcium, New York."));
        return restaurantList;
    }

    public ArrayList<Food> makeFoodList(){

        foodList.add(new Food("f01","Arugula soufflé", "540.00", "This glazed arugula soufflé is rather smooth with a mushy texture. It is infused with cauliflower with crushed red pepper and has a great deal of santolina. It smells like lemon with a great deal of quinces. It is serious and critical. You can really feel how premium and how high in iron it is.", "001", R.drawable.f1));
        foodList.add(new Food("f02","Corn curry", "240.00", "This poached corn curry is altogether fizzy with a silky texture. It pairs with mushrooms with garlic and has a tiny bit of coriander-blair. It smells flat with a hint of oat bran. It is delicate and seductive. You can really feel how low fat and how unsweetened it is.", "001", R.drawable.f2));
        foodList.add(new Food("f03","Goji berries pizza", "320.00", "This breaded goji berries pizza is entirely dry with a thin texture. It has an undertone of rutabaga with black cumin and has just the right amount of curry powder. It smells like scorched rubber with butterbur. It is raw and green. You can really feel how whole superfood and how kosher certified it is.", "001", R.drawable.f3));
        foodList.add(new Food("f04","Marinated pudding", "250.00", "This marinated daikon pudding is absolutely electric with a crumbly texture. It bursts with the flavor of guava with cuban oregano and has a touch of crushed red pepper. It smells crisp with hyacinth-beans. It is distinctively strong. You can really feel how third party tested and how low calorie it is.", "001", R.drawable.f4));
        foodList.add(new Food("f05","Roasted bread", "700.00", "This roasted pistachios bread is entirely crispy with a fizzy texture. It embodies the essence of corn with black pepper and has nasturtium. It smells like freshly baked bread with a hint of apples. It is highly questionable. You can really feel how high in niacin and how high in healthy fats it is.", "001", R.drawable.f5));

        foodList.add(new Food("f06","Mandarin stew", "650.00", "This smoked mandarin stew is scarcely mushy with a sticky texture. It has a tinge of cassava (yuca root) with horseradish and has patchouli. It smells like spoor with rutabagas. It is creamy and caustic. You can really feel how low calorie and how high in protein it is.", "002", R.drawable.f6));
        foodList.add(new Food("f07","Orange breakfast", "340.00", "This whipped orange breakfast is absolutely creamy with a creamy texture. It is balanced with durian with paprika and has an overwhelming amount of bay. It smells balmy with a tiny bit of salsify. It is noticeably mystic. You can really feel how unsalted and how high in iron it is.", "002", R.drawable.f7));
        foodList.add(new Food("f08","Onions dumpling", "580.00", "This caramelized onions dumpling is utterly syrupy with an intoxicating texture. It parallels kiwifruit with onion powder and has hyssop. It smells fragrant with a touch of blueberries. It is agreeable and even delicious. You can really feel how non-GMO and how nutrient rich it is.", "002", R.drawable.f8));
        foodList.add(new Food("f09","Marinated sandwich", "240.00", "This marinated sorghum sandwich is wholly fluffy with a honeyed texture. It is redolent with teff with calendula and has a great deal of parsley. It smells like a cemetery with a bit of gourd. It is exquisitely delicious. You can really feel how high in healthy fats and how no artificial sweeteners it is.", "002", R.drawable.f9));
        foodList.add(new Food("f10","Blanched pudding", "450.00", "This blanched tamarind pudding is altogether chewy with a mushy texture. It resembles onion with yarrow and has turmeric. It smells gamey with a tiny bit of millet. It is certainly spicy. You can really feel how quality guaranteed and how high in magnesium it is.", "002", R.drawable.f10));

        foodList.add(new Food("f11","Seared sandwich", "300.00", "This seared figs sandwich is rather silky with a thin texture. It reeks of chia with coriander seed and has a hint of costmary. It smells like hand cream with an overwhelming amount of avocado. It is strongly aromatic. You can really feel how no preservatives and how certified organic it is.", "003", R.drawable.f11));
        foodList.add(new Food("f12","Lime pizza", "450.00", "This blanched lime pizza is totally blackened with a syrupy texture. It pairs with cassava (yuca root) with parsley and has just the right amount of thyme. It smells scentless with a touch of cranberries. It is racy and delicious. You can really feel how high in omega 3s and how unsweetened it is.", "003", R.drawable.f12));
        foodList.add(new Food("f13","Broiled muffin", "340.00", "This broiled persimmon muffin is totally doughy with a sticky texture. It is vaguely reminiscent of parsnip with tarragon and has a great deal of sweet grass. It smells fragrance-free with ginger root. It is genuine literary. You can really feel how low calorie and how locally sourced it is.", "003", R.drawable.f13));
        foodList.add(new Food("f14","Breaded pecans", "550.00", "This breaded pecans breakfast is reasonably sugary with a burned texture. It is faintly like corn with chamomile and has an overwhelming amount of cayenne. It smells acrid with an overwhelming amount of pineapple. It is pleasantly sweet. You can really feel how kosher certified and how no preservatives it is.", "003", R.drawable.f14));
        foodList.add(new Food("f15","Asian rice pilaf", "760.00", "This whipped Asian rice pilaf is sort of slimy with a juicy texture. It is vaguely reminiscent of kidney beans with calendula and has a large amount of bee balm. It smells distinctive with radishes. It is sweet and delicate. You can really feel how no artificial colors and how 0g of added sugar it is.", "003", R.drawable.f15));

        foodList.add(new Food("f16","Fried bisque", "340.00", "This fried little millet bisque is barely crunchy with a tender texture. It mirrors figs with caraway seed and has yarrow. It smells like the woods with a hint of lupins. It is curiously nutty. You can really feel how free trade and how wheat free it is.", "004", R.drawable.f16));
        foodList.add(new Food("f17","Swiss chard bread", "500.00", "This braised swiss chard bread is relatively grainy with a greasy texture. It embodies the essence of carambola with angelica and has a tiny bit of vitex. It smells like violets with a hint of spices. It is snappy and spicy. You can really feel how all natural and how plant-based it is.", "004", R.drawable.f17));
        foodList.add(new Food("f18","Sapodilla wrap", "250.00", "This baked sapodilla wrap is thoroughly honeyed with a dry texture. It is enhanced by broadbeans (fava beans) with arnika and has cuban oregano. It smells like maple sugar with yokan. It is quite mild and delicate. You can really feel how high in vitamin B and how whole food it is.", "004", R.drawable.f18));
        foodList.add(new Food("f19","Breadfruit drink", "350.00", "This fermented breadfruit drink is reasonably silky with a mushy texture. It is balanced with iceberg lettuce with aralia and has a large amount of hibiscus. It smells like lemon with a touch of plantains. It is strongly academic. You can really feel how high in potassium and how wheat free it is.", "004", R.drawable.f19));
        foodList.add(new Food("f20","Breaded sorrel", "600.00", "This breaded sorrel (dock) casserole is comparatively delicate with a stringy texture. It compares to cauliflower with bay and has saffron. It smells fragrant with mung beans. It is harsh and sooty. You can really feel how no fillers and how high in riboflavin it is.", "004", R.drawable.f20));

        foodList.add(new Food("f21","Arugula soufflé", "540.00", "This glazed arugula soufflé is rather smooth with a mushy texture. It is infused with cauliflower with crushed red pepper and has a great deal of santolina. It smells like lemon with a great deal of quinces. It is serious and critical. You can really feel how premium and how high in iron it is.", "005", R.drawable.f21));
        foodList.add(new Food("f22","Corn curry", "240.00", "This poached corn curry is altogether fizzy with a silky texture. It pairs with mushrooms with garlic and has a tiny bit of coriander-blair. It smells flat with a hint of oat bran. It is delicate and seductive. You can really feel how low fat and how unsweetened it is.", "005", R.drawable.f22));
        foodList.add(new Food("f23","Goji berries pizza", "320.00", "This breaded goji berries pizza is entirely dry with a thin texture. It has an undertone of rutabaga with black cumin and has just the right amount of curry powder. It smells like scorched rubber with butterbur. It is raw and green. You can really feel how whole superfood and how kosher certified it is.", "005", R.drawable.f23));
        foodList.add(new Food("f24","Marinated pudding", "250.00", "This marinated daikon pudding is absolutely electric with a crumbly texture. It bursts with the flavor of guava with cuban oregano and has a touch of crushed red pepper. It smells crisp with hyacinth-beans. It is distinctively strong. You can really feel how third party tested and how low calorie it is.", "005", R.drawable.f24));
        foodList.add(new Food("f25","Roasted bread", "700.00", "This roasted pistachios bread is entirely crispy with a fizzy texture. It embodies the essence of corn with black pepper and has nasturtium. It smells like freshly baked bread with a hint of apples. It is highly questionable. You can really feel how high in niacin and how high in healthy fats it is.", "005", R.drawable.f25));

        foodList.add(new Food("f26","Mandarin stew", "650.00", "This smoked mandarin stew is scarcely mushy with a sticky texture. It has a tinge of cassava (yuca root) with horseradish and has patchouli. It smells like spoor with rutabagas. It is creamy and caustic. You can really feel how low calorie and how high in protein it is.", "006", R.drawable.f26));
        foodList.add(new Food("f27","Orange breakfast", "340.00", "This whipped orange breakfast is absolutely creamy with a creamy texture. It is balanced with durian with paprika and has an overwhelming amount of bay. It smells balmy with a tiny bit of salsify. It is noticeably mystic. You can really feel how unsalted and how high in iron it is.", "006", R.drawable.f27));
        foodList.add(new Food("f28","Onions dumpling", "580.00", "This caramelized onions dumpling is utterly syrupy with an intoxicating texture. It parallels kiwifruit with onion powder and has hyssop. It smells fragrant with a touch of blueberries. It is agreeable and even delicious. You can really feel how non-GMO and how nutrient rich it is.", "006", R.drawable.f28));
        foodList.add(new Food("f29","Marinated sandwich", "240.00", "This marinated sorghum sandwich is wholly fluffy with a honeyed texture. It is redolent with teff with calendula and has a great deal of parsley. It smells like a cemetery with a bit of gourd. It is exquisitely delicious. You can really feel how high in healthy fats and how no artificial sweeteners it is.", "006", R.drawable.f29));
        foodList.add(new Food("f30","Blanched pudding", "450.00", "This blanched tamarind pudding is altogether chewy with a mushy texture. It resembles onion with yarrow and has turmeric. It smells gamey with a tiny bit of millet. It is certainly spicy. You can really feel how quality guaranteed and how high in magnesium it is.", "006", R.drawable.f30));

        foodList.add(new Food("f31","Seared sandwich", "300.00", "This seared figs sandwich is rather silky with a thin texture. It reeks of chia with coriander seed and has a hint of costmary. It smells like hand cream with an overwhelming amount of avocado. It is strongly aromatic. You can really feel how no preservatives and how certified organic it is.", "007", R.drawable.f31));
        foodList.add(new Food("f32","Lime pizza", "450.00", "This blanched lime pizza is totally blackened with a syrupy texture. It pairs with cassava (yuca root) with parsley and has just the right amount of thyme. It smells scentless with a touch of cranberries. It is racy and delicious. You can really feel how high in omega 3s and how unsweetened it is.", "007", R.drawable.f32));
        foodList.add(new Food("f33","Broiled muffin", "340.00", "This broiled persimmon muffin is totally doughy with a sticky texture. It is vaguely reminiscent of parsnip with tarragon and has a great deal of sweet grass. It smells fragrance-free with ginger root. It is genuine literary. You can really feel how low calorie and how locally sourced it is.", "007", R.drawable.f33));
        foodList.add(new Food("f34","Breaded pecans", "550.00", "This breaded pecans breakfast is reasonably sugary with a burned texture. It is faintly like corn with chamomile and has an overwhelming amount of cayenne. It smells acrid with an overwhelming amount of pineapple. It is pleasantly sweet. You can really feel how kosher certified and how no preservatives it is.", "007", R.drawable.f34));
        foodList.add(new Food("f35","Asian rice pilaf", "760.00", "This whipped Asian rice pilaf is sort of slimy with a juicy texture. It is vaguely reminiscent of kidney beans with calendula and has a large amount of bee balm. It smells distinctive with radishes. It is sweet and delicate. You can really feel how no artificial colors and how 0g of added sugar it is.", "007", R.drawable.f35));

        foodList.add(new Food("f36","Fried bisque", "340.00", "This fried little millet bisque is barely crunchy with a tender texture. It mirrors figs with caraway seed and has yarrow. It smells like the woods with a hint of lupins. It is curiously nutty. You can really feel how free trade and how wheat free it is.", "008", R.drawable.f36));
        foodList.add(new Food("f37","Swiss chard bread", "500.00", "This braised swiss chard bread is relatively grainy with a greasy texture. It embodies the essence of carambola with angelica and has a tiny bit of vitex. It smells like violets with a hint of spices. It is snappy and spicy. You can really feel how all natural and how plant-based it is.", "008", R.drawable.f37));
        foodList.add(new Food("f38","Sapodilla wrap", "250.00", "This baked sapodilla wrap is thoroughly honeyed with a dry texture. It is enhanced by broadbeans (fava beans) with arnika and has cuban oregano. It smells like maple sugar with yokan. It is quite mild and delicate. You can really feel how high in vitamin B and how whole food it is.", "008", R.drawable.f38));
        foodList.add(new Food("f39","Breadfruit drink", "350.00", "This fermented breadfruit drink is reasonably silky with a mushy texture. It is balanced with iceberg lettuce with aralia and has a large amount of hibiscus. It smells like lemon with a touch of plantains. It is strongly academic. You can really feel how high in potassium and how wheat free it is.", "008", R.drawable.f39));
        foodList.add(new Food("f40","Breaded sorrel", "600.00", "This breaded sorrel (dock) casserole is comparatively delicate with a stringy texture. It compares to cauliflower with bay and has saffron. It smells fragrant with mung beans. It is harsh and sooty. You can really feel how no fillers and how high in riboflavin it is.", "008", R.drawable.f40));

        foodList.add(new Food("f41","Arugula soufflé", "540.00", "This glazed arugula soufflé is rather smooth with a mushy texture. It is infused with cauliflower with crushed red pepper and has a great deal of santolina. It smells like lemon with a great deal of quinces. It is serious and critical. You can really feel how premium and how high in iron it is.", "009", R.drawable.f1));
        foodList.add(new Food("f42","Corn curry", "240.00", "This poached corn curry is altogether fizzy with a silky texture. It pairs with mushrooms with garlic and has a tiny bit of coriander-blair. It smells flat with a hint of oat bran. It is delicate and seductive. You can really feel how low fat and how unsweetened it is.", "009", R.drawable.f2));
        foodList.add(new Food("f43","Goji berries pizza", "320.00", "This breaded goji berries pizza is entirely dry with a thin texture. It has an undertone of rutabaga with black cumin and has just the right amount of curry powder. It smells like scorched rubber with butterbur. It is raw and green. You can really feel how whole superfood and how kosher certified it is.", "009", R.drawable.f3));
        foodList.add(new Food("f44","Marinated pudding", "250.00", "This marinated daikon pudding is absolutely electric with a crumbly texture. It bursts with the flavor of guava with cuban oregano and has a touch of crushed red pepper. It smells crisp with hyacinth-beans. It is distinctively strong. You can really feel how third party tested and how low calorie it is.", "009", R.drawable.f4));
        foodList.add(new Food("f45","Roasted bread", "700.00", "This roasted pistachios bread is entirely crispy with a fizzy texture. It embodies the essence of corn with black pepper and has nasturtium. It smells like freshly baked bread with a hint of apples. It is highly questionable. You can really feel how high in niacin and how high in healthy fats it is.", "009", R.drawable.f5));

        foodList.add(new Food("f46","Mandarin stew", "650.00", "This smoked mandarin stew is scarcely mushy with a sticky texture. It has a tinge of cassava (yuca root) with horseradish and has patchouli. It smells like spoor with rutabagas. It is creamy and caustic. You can really feel how low calorie and how high in protein it is.", "010", R.drawable.f6));
        foodList.add(new Food("f47","Orange breakfast", "340.00", "This whipped orange breakfast is absolutely creamy with a creamy texture. It is balanced with durian with paprika and has an overwhelming amount of bay. It smells balmy with a tiny bit of salsify. It is noticeably mystic. You can really feel how unsalted and how high in iron it is.", "010", R.drawable.f7));
        foodList.add(new Food("f48","Onions dumpling", "580.00", "This caramelized onions dumpling is utterly syrupy with an intoxicating texture. It parallels kiwifruit with onion powder and has hyssop. It smells fragrant with a touch of blueberries. It is agreeable and even delicious. You can really feel how non-GMO and how nutrient rich it is.", "010", R.drawable.f8));
        foodList.add(new Food("f49","Marinated sandwich", "240.00", "This marinated sorghum sandwich is wholly fluffy with a honeyed texture. It is redolent with teff with calendula and has a great deal of parsley. It smells like a cemetery with a bit of gourd. It is exquisitely delicious. You can really feel how high in healthy fats and how no artificial sweeteners it is.", "010", R.drawable.f9));
        foodList.add(new Food("f50","Blanched pudding", "450.00", "This blanched tamarind pudding is altogether chewy with a mushy texture. It resembles onion with yarrow and has turmeric. It smells gamey with a tiny bit of millet. It is certainly spicy. You can really feel how quality guaranteed and how high in magnesium it is.", "010", R.drawable.f10));


        return foodList;
    }
}
