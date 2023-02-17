package net.purefunc.emoji

enum class Emoji0(
    private val intArray: IntArray,
) {
    // 😀 😀 😀
    GRINNING_FACE(intArrayOf(0x1F600)),
    // 😃 😃 😃
    GRINNING_FACE_WITH_BIG_EYES(intArrayOf(0x1F603)),
    // 😄 😄 😄
    GRINNING_FACE_WITH_SMILING_EYES(intArrayOf(0x1F604)),
    // 😁 😁 😁
    BEAMING_FACE_WITH_SMILING_EYES(intArrayOf(0x1F601)),
    // 😆 😆 😆
    GRINNING_SQUINTING_FACE(intArrayOf(0x1F606)),
    // 😅 😅 😅
    GRINNING_FACE_WITH_SWEAT(intArrayOf(0x1F605)),
    // 🤣 🤣 🤣
    ROLLING_ON_THE_FLOOR_LAUGHING(intArrayOf(0x1F923)),
    // 😂 😂 😂
    FACE_WITH_TEARS_OF_JOY(intArrayOf(0x1F602)),
    // 🙂 🙂 🙂
    SLIGHTLY_SMILING_FACE(intArrayOf(0x1F642)),
    // 🙃 🙃 🙃
    UPSIDE_DOWN_FACE(intArrayOf(0x1F643)),
    // 🫠 🫠 🫠
    MELTING_FACE(intArrayOf(0x1FAE0)),
    // 😉 😉 😉
    WINKING_FACE(intArrayOf(0x1F609)),
    // 😊 😊 😊
    SMILING_FACE_WITH_SMILING_EYES(intArrayOf(0x1F60A)),
    // 😇 😇 😇
    SMILING_FACE_WITH_HALO(intArrayOf(0x1F607)),
    // 🥰 🥰 🥰
    SMILING_FACE_WITH_HEARTS(intArrayOf(0x1F970)),
    // 😍 😍 😍
    SMILING_FACE_WITH_HEART_EYES(intArrayOf(0x1F60D)),
    // 🤩 🤩 🤩
    STAR_STRUCK(intArrayOf(0x1F929)),
    // 😘 😘 😘
    FACE_BLOWING_A_KISS(intArrayOf(0x1F618)),
    // 😗 😗 😗
    KISSING_FACE(intArrayOf(0x1F617)),
    // ☺️ ☺️ ☺️
    SMILING_FACE(intArrayOf(0x263A,0xFE0F)),
    // 😚 😚 😚
    KISSING_FACE_WITH_CLOSED_EYES(intArrayOf(0x1F61A)),
    // 😙 😙 😙
    KISSING_FACE_WITH_SMILING_EYES(intArrayOf(0x1F619)),
    // 🥲 🥲 🥲
    SMILING_FACE_WITH_TEAR(intArrayOf(0x1F972)),
    // 😋 😋 😋
    FACE_SAVORING_FOOD(intArrayOf(0x1F60B)),
    // 😛 😛 😛
    FACE_WITH_TONGUE(intArrayOf(0x1F61B)),
    // 😜 😜 😜
    WINKING_FACE_WITH_TONGUE(intArrayOf(0x1F61C)),
    // 🤪 🤪 🤪
    ZANY_FACE(intArrayOf(0x1F92A)),
    // 😝 😝 😝
    SQUINTING_FACE_WITH_TONGUE(intArrayOf(0x1F61D)),
    // 🤑 🤑 🤑
    MONEY_MOUTH_FACE(intArrayOf(0x1F911)),
    // 🤗 🤗 🤗
    SMILING_FACE_WITH_OPEN_HANDS(intArrayOf(0x1F917)),
    // 🤭 🤭 🤭
    FACE_WITH_HAND_OVER_MOUTH(intArrayOf(0x1F92D)),
    // 🫢 🫢 🫢
    FACE_WITH_OPEN_EYES_AND_HAND_OVER_MOUTH(intArrayOf(0x1FAE2)),
    // 🫣 🫣 🫣
    FACE_WITH_PEEKING_EYE(intArrayOf(0x1FAE3)),
    // 🤫 🤫 🤫
    SHUSHING_FACE(intArrayOf(0x1F92B)),
    // 🤔 🤔 🤔
    THINKING_FACE(intArrayOf(0x1F914)),
    // 🫡 🫡 🫡
    SALUTING_FACE(intArrayOf(0x1FAE1)),
    // 🤐 🤐 🤐
    ZIPPER_MOUTH_FACE(intArrayOf(0x1F910)),
    // 🤨 🤨 🤨
    FACE_WITH_RAISED_EYEBROW(intArrayOf(0x1F928)),
    // 😐 😐 😐
    NEUTRAL_FACE(intArrayOf(0x1F610)),
    // 😑 😑 😑
    EXPRESSIONLESS_FACE(intArrayOf(0x1F611)),
    // 😶 😶 😶
    FACE_WITHOUT_MOUTH(intArrayOf(0x1F636)),
    // 🫥 🫥 🫥
    DOTTED_LINE_FACE(intArrayOf(0x1FAE5)),
    // 😶‍🌫️ 😶‍🌫️ 😶‍🌫️
    FACE_IN_CLOUDS(intArrayOf(0x1F636,0x200D,0x1F32B,0xFE0F)),
    // 😏 😏 😏
    SMIRKING_FACE(intArrayOf(0x1F60F)),
    // 😒 😒 😒
    UNAMUSED_FACE(intArrayOf(0x1F612)),
    // 🙄 🙄 🙄
    FACE_WITH_ROLLING_EYES(intArrayOf(0x1F644)),
    // 😬 😬 😬
    GRIMACING_FACE(intArrayOf(0x1F62C)),
    // 😮‍💨 😮‍💨 😮‍💨
    FACE_EXHALING(intArrayOf(0x1F62E,0x200D,0x1F4A8)),
    // 🤥 🤥 🤥
    LYING_FACE(intArrayOf(0x1F925)),
    // 🫨 🫨 🫨
    SHAKING_FACE(intArrayOf(0x1FAE8)),
    // 😌 😌 😌
    RELIEVED_FACE(intArrayOf(0x1F60C)),
    // 😔 😔 😔
    PENSIVE_FACE(intArrayOf(0x1F614)),
    // 😪 😪 😪
    SLEEPY_FACE(intArrayOf(0x1F62A)),
    // 🤤 🤤 🤤
    DROOLING_FACE(intArrayOf(0x1F924)),
    // 😴 😴 😴
    SLEEPING_FACE(intArrayOf(0x1F634)),
    // 😷 😷 😷
    FACE_WITH_MEDICAL_MASK(intArrayOf(0x1F637)),
    // 🤒 🤒 🤒
    FACE_WITH_THERMOMETER(intArrayOf(0x1F912)),
    // 🤕 🤕 🤕
    FACE_WITH_HEAD_BANDAGE(intArrayOf(0x1F915)),
    // 🤢 🤢 🤢
    NAUSEATED_FACE(intArrayOf(0x1F922)),
    // 🤮 🤮 🤮
    FACE_VOMITING(intArrayOf(0x1F92E)),
    // 🤧 🤧 🤧
    SNEEZING_FACE(intArrayOf(0x1F927)),
    // 🥵 🥵 🥵
    HOT_FACE(intArrayOf(0x1F975)),
    // 🥶 🥶 🥶
    COLD_FACE(intArrayOf(0x1F976)),
    // 🥴 🥴 🥴
    WOOZY_FACE(intArrayOf(0x1F974)),
    // 😵 😵 😵
    FACE_WITH_CROSSED_OUT_EYES(intArrayOf(0x1F635)),
    // 😵‍💫 😵‍💫 😵‍💫
    FACE_WITH_SPIRAL_EYES(intArrayOf(0x1F635,0x200D,0x1F4AB)),
    // 🤯 🤯 🤯
    EXPLODING_HEAD(intArrayOf(0x1F92F)),
    // 🤠 🤠 🤠
    COWBOY_HAT_FACE(intArrayOf(0x1F920)),
    // 🥳 🥳 🥳
    PARTYING_FACE(intArrayOf(0x1F973)),
    // 🥸 🥸 🥸
    DISGUISED_FACE(intArrayOf(0x1F978)),
    // 😎 😎 😎
    SMILING_FACE_WITH_SUNGLASSES(intArrayOf(0x1F60E)),
    // 🤓 🤓 🤓
    NERD_FACE(intArrayOf(0x1F913)),
    // 🧐 🧐 🧐
    FACE_WITH_MONOCLE(intArrayOf(0x1F9D0)),
    // 😕 😕 😕
    CONFUSED_FACE(intArrayOf(0x1F615)),
    // 🫤 🫤 🫤
    FACE_WITH_DIAGONAL_MOUTH(intArrayOf(0x1FAE4)),
    // 😟 😟 😟
    WORRIED_FACE(intArrayOf(0x1F61F)),
    // 🙁 🙁 🙁
    SLIGHTLY_FROWNING_FACE(intArrayOf(0x1F641)),
    // ☹️ ☹️ ☹️
    FROWNING_FACE(intArrayOf(0x2639,0xFE0F)),
    // 😮 😮 😮
    FACE_WITH_OPEN_MOUTH(intArrayOf(0x1F62E)),
    // 😯 😯 😯
    HUSHED_FACE(intArrayOf(0x1F62F)),
    // 😲 😲 😲
    ASTONISHED_FACE(intArrayOf(0x1F632)),
    // 😳 😳 😳
    FLUSHED_FACE(intArrayOf(0x1F633)),
    // 🥺 🥺 🥺
    PLEADING_FACE(intArrayOf(0x1F97A)),
    // 🥹 🥹 🥹
    FACE_HOLDING_BACK_TEARS(intArrayOf(0x1F979)),
    // 😦 😦 😦
    FROWNING_FACE_WITH_OPEN_MOUTH(intArrayOf(0x1F626)),
    // 😧 😧 😧
    ANGUISHED_FACE(intArrayOf(0x1F627)),
    // 😨 😨 😨
    FEARFUL_FACE(intArrayOf(0x1F628)),
    // 😰 😰 😰
    ANXIOUS_FACE_WITH_SWEAT(intArrayOf(0x1F630)),
    // 😥 😥 😥
    SAD_BUT_RELIEVED_FACE(intArrayOf(0x1F625)),
    // 😢 😢 😢
    CRYING_FACE(intArrayOf(0x1F622)),
    // 😭 😭 😭
    LOUDLY_CRYING_FACE(intArrayOf(0x1F62D)),
    // 😱 😱 😱
    FACE_SCREAMING_IN_FEAR(intArrayOf(0x1F631)),
    // 😖 😖 😖
    CONFOUNDED_FACE(intArrayOf(0x1F616)),
    // 😣 😣 😣
    PERSEVERING_FACE(intArrayOf(0x1F623)),
    // 😞 😞 😞
    DISAPPOINTED_FACE(intArrayOf(0x1F61E)),
    // 😓 😓 😓
    DOWNCAST_FACE_WITH_SWEAT(intArrayOf(0x1F613)),
    // 😩 😩 😩
    WEARY_FACE(intArrayOf(0x1F629)),
    // 😫 😫 😫
    TIRED_FACE(intArrayOf(0x1F62B)),
    // 🥱 🥱 🥱
    YAWNING_FACE(intArrayOf(0x1F971)),
    // 😤 😤 😤
    FACE_WITH_STEAM_FROM_NOSE(intArrayOf(0x1F624)),
    // 😡 😡 😡
    ENRAGED_FACE(intArrayOf(0x1F621)),
    // 😠 😠 😠
    ANGRY_FACE(intArrayOf(0x1F620)),
    // 🤬 🤬 🤬
    FACE_WITH_SYMBOLS_ON_MOUTH(intArrayOf(0x1F92C)),
    // 😈 😈 😈
    SMILING_FACE_WITH_HORNS(intArrayOf(0x1F608)),
    // 👿 👿 👿
    ANGRY_FACE_WITH_HORNS(intArrayOf(0x1F47F)),
    // 💀 💀 💀
    SKULL(intArrayOf(0x1F480)),
    // ☠️ ☠️ ☠️
    SKULL_AND_CROSSBONES(intArrayOf(0x2620,0xFE0F)),
    // 💩 💩 💩
    PILE_OF_POO(intArrayOf(0x1F4A9)),
    // 🤡 🤡 🤡
    CLOWN_FACE(intArrayOf(0x1F921)),
    // 👹 👹 👹
    OGRE(intArrayOf(0x1F479)),
    // 👺 👺 👺
    GOBLIN(intArrayOf(0x1F47A)),
    // 👻 👻 👻
    GHOST(intArrayOf(0x1F47B)),
    // 👽 👽 👽
    ALIEN(intArrayOf(0x1F47D)),
    // 👾 👾 👾
    ALIEN_MONSTER(intArrayOf(0x1F47E)),
    // 🤖 🤖 🤖
    ROBOT(intArrayOf(0x1F916)),
    // 😺 😺 😺
    GRINNING_CAT(intArrayOf(0x1F63A)),
    // 😸 😸 😸
    GRINNING_CAT_WITH_SMILING_EYES(intArrayOf(0x1F638)),
    // 😹 😹 😹
    CAT_WITH_TEARS_OF_JOY(intArrayOf(0x1F639)),
    // 😻 😻 😻
    SMILING_CAT_WITH_HEART_EYES(intArrayOf(0x1F63B)),
    // 😼 😼 😼
    CAT_WITH_WRY_SMILE(intArrayOf(0x1F63C)),
    // 😽 😽 😽
    KISSING_CAT(intArrayOf(0x1F63D)),
    // 🙀 🙀 🙀
    WEARY_CAT(intArrayOf(0x1F640)),
    // 😿 😿 😿
    CRYING_CAT(intArrayOf(0x1F63F)),
    // 😾 😾 😾
    POUTING_CAT(intArrayOf(0x1F63E)),
    // 🙈 🙈 🙈
    SEE_NO_EVIL_MONKEY(intArrayOf(0x1F648)),
    // 🙉 🙉 🙉
    HEAR_NO_EVIL_MONKEY(intArrayOf(0x1F649)),
    // 🙊 🙊 🙊
    SPEAK_NO_EVIL_MONKEY(intArrayOf(0x1F64A)),
    // 💌 💌 💌
    LOVE_LETTER(intArrayOf(0x1F48C)),
    // 💘 💘 💘
    HEART_WITH_ARROW(intArrayOf(0x1F498)),
    // 💝 💝 💝
    HEART_WITH_RIBBON(intArrayOf(0x1F49D)),
    // 💖 💖 💖
    SPARKLING_HEART(intArrayOf(0x1F496)),
    // 💗 💗 💗
    GROWING_HEART(intArrayOf(0x1F497)),
    // 💓 💓 💓
    BEATING_HEART(intArrayOf(0x1F493)),
    // 💞 💞 💞
    REVOLVING_HEARTS(intArrayOf(0x1F49E)),
    // 💕 💕 💕
    TWO_HEARTS(intArrayOf(0x1F495)),
    // 💟 💟 💟
    HEART_DECORATION(intArrayOf(0x1F49F)),
    // ❣️ ❣️ ❣️
    HEART_EXCLAMATION(intArrayOf(0x2763,0xFE0F)),
    // 💔 💔 💔
    BROKEN_HEART(intArrayOf(0x1F494)),
    // ❤️‍🔥 ❤️‍🔥 ❤️‍🔥
    HEART_ON_FIRE(intArrayOf(0x2764,0xFE0F,0x200D,0x1F525)),
    // ❤️‍🩹 ❤️‍🩹 ❤️‍🩹
    MENDING_HEART(intArrayOf(0x2764,0xFE0F,0x200D,0x1FA79)),
    // ❤️ ❤️ ❤️
    RED_HEART(intArrayOf(0x2764,0xFE0F)),
    // 🩷 🩷 🩷
    PINK_HEART(intArrayOf(0x1FA77)),
    // 🧡 🧡 🧡
    ORANGE_HEART(intArrayOf(0x1F9E1)),
    // 💛 💛 💛
    YELLOW_HEART(intArrayOf(0x1F49B)),
    // 💚 💚 💚
    GREEN_HEART(intArrayOf(0x1F49A)),
    // 💙 💙 💙
    BLUE_HEART(intArrayOf(0x1F499)),
    // 🩵 🩵 🩵
    LIGHT_BLUE_HEART(intArrayOf(0x1FA75)),
    // 💜 💜 💜
    PURPLE_HEART(intArrayOf(0x1F49C)),
    // 🤎 🤎 🤎
    BROWN_HEART(intArrayOf(0x1F90E)),
    // 🖤 🖤 🖤
    BLACK_HEART(intArrayOf(0x1F5A4)),
    // 🩶 🩶 🩶
    GREY_HEART(intArrayOf(0x1FA76)),
    // 🤍 🤍 🤍
    WHITE_HEART(intArrayOf(0x1F90D)),
    // 💋 💋 💋
    KISS_MARK(intArrayOf(0x1F48B)),
    // 💯 💯 💯
    HUNDRED_POINTS(intArrayOf(0x1F4AF)),
    // 💢 💢 💢
    ANGER_SYMBOL(intArrayOf(0x1F4A2)),
    // 💥 💥 💥
    COLLISION(intArrayOf(0x1F4A5)),
    // 💫 💫 💫
    DIZZY(intArrayOf(0x1F4AB)),
    // 💦 💦 💦
    SWEAT_DROPLETS(intArrayOf(0x1F4A6)),
    // 💨 💨 💨
    DASHING_AWAY(intArrayOf(0x1F4A8)),
    // 🕳️ 🕳️ 🕳️
    HOLE(intArrayOf(0x1F573,0xFE0F)),
    // 💬 💬 💬
    SPEECH_BALLOON(intArrayOf(0x1F4AC)),
    // 👁️‍🗨️ 👁️‍🗨️ 👁️‍🗨️
    EYE_IN_SPEECH_BUBBLE(intArrayOf(0x1F441,0xFE0F,0x200D,0x1F5E8,0xFE0F)),
    // 🗨️ 🗨️ 🗨️
    LEFT_SPEECH_BUBBLE(intArrayOf(0x1F5E8,0xFE0F)),
    // 🗯️ 🗯️ 🗯️
    RIGHT_ANGER_BUBBLE(intArrayOf(0x1F5EF,0xFE0F)),
    // 💭 💭 💭
    THOUGHT_BALLOON(intArrayOf(0x1F4AD)),
    // 💤 💤 💤
    ZZZ(intArrayOf(0x1F4A4)),
    // 👋 👋 👋
    WAVING_HAND(intArrayOf(0x1F44B)),
    // 🤚 🤚 🤚
    RAISED_BACK_OF_HAND(intArrayOf(0x1F91A)),
    // 🖐️ 🖐️ 🖐️
    HAND_WITH_FINGERS_SPLAYED(intArrayOf(0x1F590,0xFE0F)),
    // ✋ ✋ ✋
    RAISED_HAND(intArrayOf(0x270B)),
    // 🖖 🖖 🖖
    VULCAN_SALUTE(intArrayOf(0x1F596)),
    // 🫱 🫱 🫱
    RIGHTWARDS_HAND(intArrayOf(0x1FAF1)),
    // 🫲 🫲 🫲
    LEFTWARDS_HAND(intArrayOf(0x1FAF2)),
    // 🫳 🫳 🫳
    PALM_DOWN_HAND(intArrayOf(0x1FAF3)),
    // 🫴 🫴 🫴
    PALM_UP_HAND(intArrayOf(0x1FAF4)),
    // 🫷 🫷 🫷
    LEFTWARDS_PUSHING_HAND(intArrayOf(0x1FAF7)),
    // 🫸 🫸 🫸
    RIGHTWARDS_PUSHING_HAND(intArrayOf(0x1FAF8)),
    // 👌 👌 👌
    OK_HAND(intArrayOf(0x1F44C)),
    // 🤌 🤌 🤌
    PINCHED_FINGERS(intArrayOf(0x1F90C)),
    // 🤏 🤏 🤏
    PINCHING_HAND(intArrayOf(0x1F90F)),
    // ✌️ ✌️ ✌️
    VICTORY_HAND(intArrayOf(0x270C,0xFE0F)),
    // 🤞 🤞 🤞
    CROSSED_FINGERS(intArrayOf(0x1F91E)),
    // 🫰 🫰 🫰
    HAND_WITH_INDEX_FINGER_AND_THUMB_CROSSED(intArrayOf(0x1FAF0)),
    // 🤟 🤟 🤟
    LOVE_YOU_GESTURE(intArrayOf(0x1F91F)),
    // 🤘 🤘 🤘
    SIGN_OF_THE_HORNS(intArrayOf(0x1F918)),
    // 🤙 🤙 🤙
    CALL_ME_HAND(intArrayOf(0x1F919)),
    // 👈 👈 👈
    BACKHAND_INDEX_POINTING_LEFT(intArrayOf(0x1F448)),
    // 👉 👉 👉
    BACKHAND_INDEX_POINTING_RIGHT(intArrayOf(0x1F449)),
    // 👆 👆 👆
    BACKHAND_INDEX_POINTING_UP(intArrayOf(0x1F446)),
    // 🖕 🖕 🖕
    MIDDLE_FINGER(intArrayOf(0x1F595)),
    // 👇 👇 👇
    BACKHAND_INDEX_POINTING_DOWN(intArrayOf(0x1F447)),
    // ☝️ ☝️ ☝️
    INDEX_POINTING_UP(intArrayOf(0x261D,0xFE0F)),
    // 🫵 🫵 🫵
    INDEX_POINTING_AT_THE_VIEWER(intArrayOf(0x1FAF5)),
    // 👍 👍 👍
    THUMBS_UP(intArrayOf(0x1F44D)),
    // 👎 👎 👎
    THUMBS_DOWN(intArrayOf(0x1F44E)),
    // ✊ ✊ ✊
    RAISED_FIST(intArrayOf(0x270A)),
    // 👊 👊 👊
    ONCOMING_FIST(intArrayOf(0x1F44A)),
    // 🤛 🤛 🤛
    LEFT_FACING_FIST(intArrayOf(0x1F91B)),
    // 🤜 🤜 🤜
    RIGHT_FACING_FIST(intArrayOf(0x1F91C)),
    // 👏 👏 👏
    CLAPPING_HANDS(intArrayOf(0x1F44F)),
    // 🙌 🙌 🙌
    RAISING_HANDS(intArrayOf(0x1F64C)),
    // 🫶 🫶 🫶
    HEART_HANDS(intArrayOf(0x1FAF6)),
    // 👐 👐 👐
    OPEN_HANDS(intArrayOf(0x1F450)),
    // 🤲 🤲 🤲
    PALMS_UP_TOGETHER(intArrayOf(0x1F932)),
    // 🤝 🤝 🤝
    HANDSHAKE(intArrayOf(0x1F91D)),
    // 🙏 🙏 🙏
    FOLDED_HANDS(intArrayOf(0x1F64F)),
    // ✍️ ✍️ ✍️
    WRITING_HAND(intArrayOf(0x270D,0xFE0F)),
    // 💅 💅 💅
    NAIL_POLISH(intArrayOf(0x1F485)),
    // 🤳 🤳 🤳
    SELFIE(intArrayOf(0x1F933)),
    // 💪 💪 💪
    FLEXED_BICEPS(intArrayOf(0x1F4AA)),
    // 🦾 🦾 🦾
    MECHANICAL_ARM(intArrayOf(0x1F9BE)),
    // 🦿 🦿 🦿
    MECHANICAL_LEG(intArrayOf(0x1F9BF)),
    // 🦵 🦵 🦵
    LEG(intArrayOf(0x1F9B5)),
    // 🦶 🦶 🦶
    FOOT(intArrayOf(0x1F9B6)),
    // 👂 👂 👂
    EAR(intArrayOf(0x1F442)),
    // 🦻 🦻 🦻
    EAR_WITH_HEARING_AID(intArrayOf(0x1F9BB)),
    // 👃 👃 👃
    NOSE(intArrayOf(0x1F443)),
    // 🧠 🧠 🧠
    BRAIN(intArrayOf(0x1F9E0)),
    // 🫀 🫀 🫀
    ANATOMICAL_HEART(intArrayOf(0x1FAC0)),
    // 🫁 🫁 🫁
    LUNGS(intArrayOf(0x1FAC1)),
    // 🦷 🦷 🦷
    TOOTH(intArrayOf(0x1F9B7)),
    // 🦴 🦴 🦴
    BONE(intArrayOf(0x1F9B4)),
    // 👀 👀 👀
    EYES(intArrayOf(0x1F440)),
    // 👁️ 👁️ 👁️
    EYE(intArrayOf(0x1F441,0xFE0F)),
    // 👅 👅 👅
    TONGUE(intArrayOf(0x1F445)),
    // 👄 👄 👄
    MOUTH(intArrayOf(0x1F444)),
    // 🫦 🫦 🫦
    BITING_LIP(intArrayOf(0x1FAE6)),
    // 👶 👶 👶
    BABY(intArrayOf(0x1F476)),
    // 🧒 🧒 🧒
    CHILD(intArrayOf(0x1F9D2)),
    // 👦 👦 👦
    BOY(intArrayOf(0x1F466)),
    // 👧 👧 👧
    GIRL(intArrayOf(0x1F467)),
    // 🧑 🧑 🧑
    PERSON(intArrayOf(0x1F9D1)),
    // 👱 👱 👱
    PERSON_BLOND_HAIR(intArrayOf(0x1F471)),
    // 👨 👨 👨
    MAN(intArrayOf(0x1F468)),
    // 🧔 🧔 🧔
    PERSON_BEARD(intArrayOf(0x1F9D4)),
    // 🧔‍♂️ 🧔‍♂️ 🧔‍♂️
    MAN_BEARD(intArrayOf(0x1F9D4,0x200D,0x2642,0xFE0F)),
    // 🧔‍♀️ 🧔‍♀️ 🧔‍♀️
    WOMAN_BEARD(intArrayOf(0x1F9D4,0x200D,0x2640,0xFE0F)),
    // 👨‍🦰 👨‍🦰 👨‍🦰
    MAN_RED_HAIR(intArrayOf(0x1F468,0x200D,0x1F9B0)),
    // 👨‍🦱 👨‍🦱 👨‍🦱
    MAN_CURLY_HAIR(intArrayOf(0x1F468,0x200D,0x1F9B1)),
    // 👨‍🦳 👨‍🦳 👨‍🦳
    MAN_WHITE_HAIR(intArrayOf(0x1F468,0x200D,0x1F9B3)),
    // 👨‍🦲 👨‍🦲 👨‍🦲
    MAN_BALD(intArrayOf(0x1F468,0x200D,0x1F9B2)),
    // 👩 👩 👩
    WOMAN(intArrayOf(0x1F469)),
    // 👩‍🦰 👩‍🦰 👩‍🦰
    WOMAN_RED_HAIR(intArrayOf(0x1F469,0x200D,0x1F9B0)),
    // 🧑‍🦰 🧑‍🦰 🧑‍🦰
    PERSON_RED_HAIR(intArrayOf(0x1F9D1,0x200D,0x1F9B0)),
    // 👩‍🦱 👩‍🦱 👩‍🦱
    WOMAN_CURLY_HAIR(intArrayOf(0x1F469,0x200D,0x1F9B1)),
    // 🧑‍🦱 🧑‍🦱 🧑‍🦱
    PERSON_CURLY_HAIR(intArrayOf(0x1F9D1,0x200D,0x1F9B1)),
    // 👩‍🦳 👩‍🦳 👩‍🦳
    WOMAN_WHITE_HAIR(intArrayOf(0x1F469,0x200D,0x1F9B3)),
    // 🧑‍🦳 🧑‍🦳 🧑‍🦳
    PERSON_WHITE_HAIR(intArrayOf(0x1F9D1,0x200D,0x1F9B3)),
    // 👩‍🦲 👩‍🦲 👩‍🦲
    WOMAN_BALD(intArrayOf(0x1F469,0x200D,0x1F9B2)),
    // 🧑‍🦲 🧑‍🦲 🧑‍🦲
    PERSON_BALD(intArrayOf(0x1F9D1,0x200D,0x1F9B2)),
    // 👱‍♀️ 👱‍♀️ 👱‍♀️
    WOMAN_BLOND_HAIR(intArrayOf(0x1F471,0x200D,0x2640,0xFE0F)),
    // 👱‍♂️ 👱‍♂️ 👱‍♂️
    MAN_BLOND_HAIR(intArrayOf(0x1F471,0x200D,0x2642,0xFE0F)),
    // 🧓 🧓 🧓
    OLDER_PERSON(intArrayOf(0x1F9D3)),
    // 👴 👴 👴
    OLD_MAN(intArrayOf(0x1F474)),
    // 👵 👵 👵
    OLD_WOMAN(intArrayOf(0x1F475)),
    // 🙍 🙍 🙍
    PERSON_FROWNING(intArrayOf(0x1F64D)),
    // 🙍‍♂️ 🙍‍♂️ 🙍‍♂️
    MAN_FROWNING(intArrayOf(0x1F64D,0x200D,0x2642,0xFE0F)),
    // 🙍‍♀️ 🙍‍♀️ 🙍‍♀️
    WOMAN_FROWNING(intArrayOf(0x1F64D,0x200D,0x2640,0xFE0F)),
    // 🙎 🙎 🙎
    PERSON_POUTING(intArrayOf(0x1F64E)),
    // 🙎‍♂️ 🙎‍♂️ 🙎‍♂️
    MAN_POUTING(intArrayOf(0x1F64E,0x200D,0x2642,0xFE0F)),
    // 🙎‍♀️ 🙎‍♀️ 🙎‍♀️
    WOMAN_POUTING(intArrayOf(0x1F64E,0x200D,0x2640,0xFE0F)),
    // 🙅 🙅 🙅
    PERSON_GESTURING_NO(intArrayOf(0x1F645)),
    // 🙅‍♂️ 🙅‍♂️ 🙅‍♂️
    MAN_GESTURING_NO(intArrayOf(0x1F645,0x200D,0x2642,0xFE0F)),
    // 🙅‍♀️ 🙅‍♀️ 🙅‍♀️
    WOMAN_GESTURING_NO(intArrayOf(0x1F645,0x200D,0x2640,0xFE0F)),
    // 🙆 🙆 🙆
    PERSON_GESTURING_OK(intArrayOf(0x1F646)),
    // 🙆‍♂️ 🙆‍♂️ 🙆‍♂️
    MAN_GESTURING_OK(intArrayOf(0x1F646,0x200D,0x2642,0xFE0F)),
    // 🙆‍♀️ 🙆‍♀️ 🙆‍♀️
    WOMAN_GESTURING_OK(intArrayOf(0x1F646,0x200D,0x2640,0xFE0F)),
    // 💁 💁 💁
    PERSON_TIPPING_HAND(intArrayOf(0x1F481)),
    // 💁‍♂️ 💁‍♂️ 💁‍♂️
    MAN_TIPPING_HAND(intArrayOf(0x1F481,0x200D,0x2642,0xFE0F)),
    // 💁‍♀️ 💁‍♀️ 💁‍♀️
    WOMAN_TIPPING_HAND(intArrayOf(0x1F481,0x200D,0x2640,0xFE0F)),
    // 🙋 🙋 🙋
    PERSON_RAISING_HAND(intArrayOf(0x1F64B)),
    // 🙋‍♂️ 🙋‍♂️ 🙋‍♂️
    MAN_RAISING_HAND(intArrayOf(0x1F64B,0x200D,0x2642,0xFE0F)),
    // 🙋‍♀️ 🙋‍♀️ 🙋‍♀️
    WOMAN_RAISING_HAND(intArrayOf(0x1F64B,0x200D,0x2640,0xFE0F)),
    // 🧏 🧏 🧏
    DEAF_PERSON(intArrayOf(0x1F9CF)),
    // 🧏‍♂️ 🧏‍♂️ 🧏‍♂️
    DEAF_MAN(intArrayOf(0x1F9CF,0x200D,0x2642,0xFE0F)),
    // 🧏‍♀️ 🧏‍♀️ 🧏‍♀️
    DEAF_WOMAN(intArrayOf(0x1F9CF,0x200D,0x2640,0xFE0F)),
    // 🙇 🙇 🙇
    PERSON_BOWING(intArrayOf(0x1F647)),
    // 🙇‍♂️ 🙇‍♂️ 🙇‍♂️
    MAN_BOWING(intArrayOf(0x1F647,0x200D,0x2642,0xFE0F)),
    // 🙇‍♀️ 🙇‍♀️ 🙇‍♀️
    WOMAN_BOWING(intArrayOf(0x1F647,0x200D,0x2640,0xFE0F)),
    // 🤦 🤦 🤦
    PERSON_FACEPALMING(intArrayOf(0x1F926)),
    // 🤦‍♂️ 🤦‍♂️ 🤦‍♂️
    MAN_FACEPALMING(intArrayOf(0x1F926,0x200D,0x2642,0xFE0F)),
    // 🤦‍♀️ 🤦‍♀️ 🤦‍♀️
    WOMAN_FACEPALMING(intArrayOf(0x1F926,0x200D,0x2640,0xFE0F)),
    // 🤷 🤷 🤷
    PERSON_SHRUGGING(intArrayOf(0x1F937)),
    // 🤷‍♂️ 🤷‍♂️ 🤷‍♂️
    MAN_SHRUGGING(intArrayOf(0x1F937,0x200D,0x2642,0xFE0F)),
    // 🤷‍♀️ 🤷‍♀️ 🤷‍♀️
    WOMAN_SHRUGGING(intArrayOf(0x1F937,0x200D,0x2640,0xFE0F)),
    // 🧑‍⚕️ 🧑‍⚕️ 🧑‍⚕️
    HEALTH_WORKER(intArrayOf(0x1F9D1,0x200D,0x2695,0xFE0F)),
    // 👨‍⚕️ 👨‍⚕️ 👨‍⚕️
    MAN_HEALTH_WORKER(intArrayOf(0x1F468,0x200D,0x2695,0xFE0F)),
    // 👩‍⚕️ 👩‍⚕️ 👩‍⚕️
    WOMAN_HEALTH_WORKER(intArrayOf(0x1F469,0x200D,0x2695,0xFE0F)),
    // 🧑‍🎓 🧑‍🎓 🧑‍🎓
    STUDENT(intArrayOf(0x1F9D1,0x200D,0x1F393)),
    // 👨‍🎓 👨‍🎓 👨‍🎓
    MAN_STUDENT(intArrayOf(0x1F468,0x200D,0x1F393)),
    // 👩‍🎓 👩‍🎓 👩‍🎓
    WOMAN_STUDENT(intArrayOf(0x1F469,0x200D,0x1F393)),
    // 🧑‍🏫 🧑‍🏫 🧑‍🏫
    TEACHER(intArrayOf(0x1F9D1,0x200D,0x1F3EB)),
    // 👨‍🏫 👨‍🏫 👨‍🏫
    MAN_TEACHER(intArrayOf(0x1F468,0x200D,0x1F3EB)),
    // 👩‍🏫 👩‍🏫 👩‍🏫
    WOMAN_TEACHER(intArrayOf(0x1F469,0x200D,0x1F3EB)),
    // 🧑‍⚖️ 🧑‍⚖️ 🧑‍⚖️
    JUDGE(intArrayOf(0x1F9D1,0x200D,0x2696,0xFE0F)),
    // 👨‍⚖️ 👨‍⚖️ 👨‍⚖️
    MAN_JUDGE(intArrayOf(0x1F468,0x200D,0x2696,0xFE0F)),
    // 👩‍⚖️ 👩‍⚖️ 👩‍⚖️
    WOMAN_JUDGE(intArrayOf(0x1F469,0x200D,0x2696,0xFE0F)),
    // 🧑‍🌾 🧑‍🌾 🧑‍🌾
    FARMER(intArrayOf(0x1F9D1,0x200D,0x1F33E)),
    // 👨‍🌾 👨‍🌾 👨‍🌾
    MAN_FARMER(intArrayOf(0x1F468,0x200D,0x1F33E)),
    // 👩‍🌾 👩‍🌾 👩‍🌾
    WOMAN_FARMER(intArrayOf(0x1F469,0x200D,0x1F33E)),
    // 🧑‍🍳 🧑‍🍳 🧑‍🍳
    COOK(intArrayOf(0x1F9D1,0x200D,0x1F373)),
    // 👨‍🍳 👨‍🍳 👨‍🍳
    MAN_COOK(intArrayOf(0x1F468,0x200D,0x1F373)),
    // 👩‍🍳 👩‍🍳 👩‍🍳
    WOMAN_COOK(intArrayOf(0x1F469,0x200D,0x1F373)),
    // 🧑‍🔧 🧑‍🔧 🧑‍🔧
    MECHANIC(intArrayOf(0x1F9D1,0x200D,0x1F527)),
    // 👨‍🔧 👨‍🔧 👨‍🔧
    MAN_MECHANIC(intArrayOf(0x1F468,0x200D,0x1F527)),
    // 👩‍🔧 👩‍🔧 👩‍🔧
    WOMAN_MECHANIC(intArrayOf(0x1F469,0x200D,0x1F527)),
    // 🧑‍🏭 🧑‍🏭 🧑‍🏭
    FACTORY_WORKER(intArrayOf(0x1F9D1,0x200D,0x1F3ED)),
    // 👨‍🏭 👨‍🏭 👨‍🏭
    MAN_FACTORY_WORKER(intArrayOf(0x1F468,0x200D,0x1F3ED)),
    // 👩‍🏭 👩‍🏭 👩‍🏭
    WOMAN_FACTORY_WORKER(intArrayOf(0x1F469,0x200D,0x1F3ED)),
    // 🧑‍💼 🧑‍💼 🧑‍💼
    OFFICE_WORKER(intArrayOf(0x1F9D1,0x200D,0x1F4BC)),
    // 👨‍💼 👨‍💼 👨‍💼
    MAN_OFFICE_WORKER(intArrayOf(0x1F468,0x200D,0x1F4BC)),
    // 👩‍💼 👩‍💼 👩‍💼
    WOMAN_OFFICE_WORKER(intArrayOf(0x1F469,0x200D,0x1F4BC)),
    // 🧑‍🔬 🧑‍🔬 🧑‍🔬
    SCIENTIST(intArrayOf(0x1F9D1,0x200D,0x1F52C)),
    // 👨‍🔬 👨‍🔬 👨‍🔬
    MAN_SCIENTIST(intArrayOf(0x1F468,0x200D,0x1F52C)),
    // 👩‍🔬 👩‍🔬 👩‍🔬
    WOMAN_SCIENTIST(intArrayOf(0x1F469,0x200D,0x1F52C)),
    // 🧑‍💻 🧑‍💻 🧑‍💻
    TECHNOLOGIST(intArrayOf(0x1F9D1,0x200D,0x1F4BB)),
    // 👨‍💻 👨‍💻 👨‍💻
    MAN_TECHNOLOGIST(intArrayOf(0x1F468,0x200D,0x1F4BB)),
    // 👩‍💻 👩‍💻 👩‍💻
    WOMAN_TECHNOLOGIST(intArrayOf(0x1F469,0x200D,0x1F4BB)),
    // 🧑‍🎤 🧑‍🎤 🧑‍🎤
    SINGER(intArrayOf(0x1F9D1,0x200D,0x1F3A4)),
    // 👨‍🎤 👨‍🎤 👨‍🎤
    MAN_SINGER(intArrayOf(0x1F468,0x200D,0x1F3A4)),
    // 👩‍🎤 👩‍🎤 👩‍🎤
    WOMAN_SINGER(intArrayOf(0x1F469,0x200D,0x1F3A4)),
    // 🧑‍🎨 🧑‍🎨 🧑‍🎨
    ARTIST(intArrayOf(0x1F9D1,0x200D,0x1F3A8)),
    // 👨‍🎨 👨‍🎨 👨‍🎨
    MAN_ARTIST(intArrayOf(0x1F468,0x200D,0x1F3A8)),
    // 👩‍🎨 👩‍🎨 👩‍🎨
    WOMAN_ARTIST(intArrayOf(0x1F469,0x200D,0x1F3A8)),
    // 🧑‍✈️ 🧑‍✈️ 🧑‍✈️
    PILOT(intArrayOf(0x1F9D1,0x200D,0x2708,0xFE0F)),
    // 👨‍✈️ 👨‍✈️ 👨‍✈️
    MAN_PILOT(intArrayOf(0x1F468,0x200D,0x2708,0xFE0F)),
    // 👩‍✈️ 👩‍✈️ 👩‍✈️
    WOMAN_PILOT(intArrayOf(0x1F469,0x200D,0x2708,0xFE0F)),
    // 🧑‍🚀 🧑‍🚀 🧑‍🚀
    ASTRONAUT(intArrayOf(0x1F9D1,0x200D,0x1F680)),
    // 👨‍🚀 👨‍🚀 👨‍🚀
    MAN_ASTRONAUT(intArrayOf(0x1F468,0x200D,0x1F680)),
    // 👩‍🚀 👩‍🚀 👩‍🚀
    WOMAN_ASTRONAUT(intArrayOf(0x1F469,0x200D,0x1F680)),
    // 🧑‍🚒 🧑‍🚒 🧑‍🚒
    FIREFIGHTER(intArrayOf(0x1F9D1,0x200D,0x1F692)),
    // 👨‍🚒 👨‍🚒 👨‍🚒
    MAN_FIREFIGHTER(intArrayOf(0x1F468,0x200D,0x1F692)),
    // 👩‍🚒 👩‍🚒 👩‍🚒
    WOMAN_FIREFIGHTER(intArrayOf(0x1F469,0x200D,0x1F692)),
    // 👮 👮 👮
    POLICE_OFFICER(intArrayOf(0x1F46E)),
    // 👮‍♂️ 👮‍♂️ 👮‍♂️
    MAN_POLICE_OFFICER(intArrayOf(0x1F46E,0x200D,0x2642,0xFE0F)),
    // 👮‍♀️ 👮‍♀️ 👮‍♀️
    WOMAN_POLICE_OFFICER(intArrayOf(0x1F46E,0x200D,0x2640,0xFE0F)),
    // 🕵️ 🕵️ 🕵️
    DETECTIVE(intArrayOf(0x1F575,0xFE0F)),
    // 🕵️‍♂️ 🕵️‍♂️ 🕵️‍♂️
    MAN_DETECTIVE(intArrayOf(0x1F575,0xFE0F,0x200D,0x2642,0xFE0F)),
    // 🕵️‍♀️ 🕵️‍♀️ 🕵️‍♀️
    WOMAN_DETECTIVE(intArrayOf(0x1F575,0xFE0F,0x200D,0x2640,0xFE0F)),
    // 💂 💂 💂
    GUARD(intArrayOf(0x1F482)),
    // 💂‍♂️ 💂‍♂️ 💂‍♂️
    MAN_GUARD(intArrayOf(0x1F482,0x200D,0x2642,0xFE0F)),
    // 💂‍♀️ 💂‍♀️ 💂‍♀️
    WOMAN_GUARD(intArrayOf(0x1F482,0x200D,0x2640,0xFE0F)),
    // 🥷 🥷 🥷
    NINJA(intArrayOf(0x1F977)),
    // 👷 👷 👷
    CONSTRUCTION_WORKER(intArrayOf(0x1F477)),
    // 👷‍♂️ 👷‍♂️ 👷‍♂️
    MAN_CONSTRUCTION_WORKER(intArrayOf(0x1F477,0x200D,0x2642,0xFE0F)),
    // 👷‍♀️ 👷‍♀️ 👷‍♀️
    WOMAN_CONSTRUCTION_WORKER(intArrayOf(0x1F477,0x200D,0x2640,0xFE0F)),
    // 🫅 🫅 🫅
    PERSON_WITH_CROWN(intArrayOf(0x1FAC5)),
    // 🤴 🤴 🤴
    PRINCE(intArrayOf(0x1F934)),
    // 👸 👸 👸
    PRINCESS(intArrayOf(0x1F478)),
    // 👳 👳 👳
    PERSON_WEARING_TURBAN(intArrayOf(0x1F473)),
    // 👳‍♂️ 👳‍♂️ 👳‍♂️
    MAN_WEARING_TURBAN(intArrayOf(0x1F473,0x200D,0x2642,0xFE0F)),
    // 👳‍♀️ 👳‍♀️ 👳‍♀️
    WOMAN_WEARING_TURBAN(intArrayOf(0x1F473,0x200D,0x2640,0xFE0F)),
    // 👲 👲 👲
    PERSON_WITH_SKULLCAP(intArrayOf(0x1F472)),
    // 🧕 🧕 🧕
    WOMAN_WITH_HEADSCARF(intArrayOf(0x1F9D5)),
    // 🤵 🤵 🤵
    PERSON_IN_TUXEDO(intArrayOf(0x1F935)),
    // 🤵‍♂️ 🤵‍♂️ 🤵‍♂️
    MAN_IN_TUXEDO(intArrayOf(0x1F935,0x200D,0x2642,0xFE0F)),
    // 🤵‍♀️ 🤵‍♀️ 🤵‍♀️
    WOMAN_IN_TUXEDO(intArrayOf(0x1F935,0x200D,0x2640,0xFE0F)),
    // 👰 👰 👰
    PERSON_WITH_VEIL(intArrayOf(0x1F470)),
    // 👰‍♂️ 👰‍♂️ 👰‍♂️
    MAN_WITH_VEIL(intArrayOf(0x1F470,0x200D,0x2642,0xFE0F)),
    // 👰‍♀️ 👰‍♀️ 👰‍♀️
    WOMAN_WITH_VEIL(intArrayOf(0x1F470,0x200D,0x2640,0xFE0F)),
    // 🤰 🤰 🤰
    PREGNANT_WOMAN(intArrayOf(0x1F930)),
    // 🫃 🫃 🫃
    PREGNANT_MAN(intArrayOf(0x1FAC3)),
    // 🫄 🫄 🫄
    PREGNANT_PERSON(intArrayOf(0x1FAC4)),
    // 🤱 🤱 🤱
    BREAST_FEEDING(intArrayOf(0x1F931)),
    // 👩‍🍼 👩‍🍼 👩‍🍼
    WOMAN_FEEDING_BABY(intArrayOf(0x1F469,0x200D,0x1F37C)),
    // 👨‍🍼 👨‍🍼 👨‍🍼
    MAN_FEEDING_BABY(intArrayOf(0x1F468,0x200D,0x1F37C)),
    // 🧑‍🍼 🧑‍🍼 🧑‍🍼
    PERSON_FEEDING_BABY(intArrayOf(0x1F9D1,0x200D,0x1F37C)),
    // 👼 👼 👼
    BABY_ANGEL(intArrayOf(0x1F47C)),
    // 🎅 🎅 🎅
    SANTA_CLAUS(intArrayOf(0x1F385)),
    // 🤶 🤶 🤶
    MRS_CLAUS(intArrayOf(0x1F936)),
    // 🧑‍🎄 🧑‍🎄 🧑‍🎄
    MX_CLAUS(intArrayOf(0x1F9D1,0x200D,0x1F384)),
    // 🦸 🦸 🦸
    SUPERHERO(intArrayOf(0x1F9B8)),
    // 🦸‍♂️ 🦸‍♂️ 🦸‍♂️
    MAN_SUPERHERO(intArrayOf(0x1F9B8,0x200D,0x2642,0xFE0F)),
    // 🦸‍♀️ 🦸‍♀️ 🦸‍♀️
    WOMAN_SUPERHERO(intArrayOf(0x1F9B8,0x200D,0x2640,0xFE0F)),
    // 🦹 🦹 🦹
    SUPERVILLAIN(intArrayOf(0x1F9B9)),
    // 🦹‍♂️ 🦹‍♂️ 🦹‍♂️
    MAN_SUPERVILLAIN(intArrayOf(0x1F9B9,0x200D,0x2642,0xFE0F)),
    // 🦹‍♀️ 🦹‍♀️ 🦹‍♀️
    WOMAN_SUPERVILLAIN(intArrayOf(0x1F9B9,0x200D,0x2640,0xFE0F)),
    // 🧙 🧙 🧙
    MAGE(intArrayOf(0x1F9D9)),
    // 🧙‍♂️ 🧙‍♂️ 🧙‍♂️
    MAN_MAGE(intArrayOf(0x1F9D9,0x200D,0x2642,0xFE0F)),
    // 🧙‍♀️ 🧙‍♀️ 🧙‍♀️
    WOMAN_MAGE(intArrayOf(0x1F9D9,0x200D,0x2640,0xFE0F)),
    // 🧚 🧚 🧚
    FAIRY(intArrayOf(0x1F9DA)),
    // 🧚‍♂️ 🧚‍♂️ 🧚‍♂️
    MAN_FAIRY(intArrayOf(0x1F9DA,0x200D,0x2642,0xFE0F)),
    // 🧚‍♀️ 🧚‍♀️ 🧚‍♀️
    WOMAN_FAIRY(intArrayOf(0x1F9DA,0x200D,0x2640,0xFE0F)),
    // 🧛 🧛 🧛
    VAMPIRE(intArrayOf(0x1F9DB)),
    // 🧛‍♂️ 🧛‍♂️ 🧛‍♂️
    MAN_VAMPIRE(intArrayOf(0x1F9DB,0x200D,0x2642,0xFE0F)),
    // 🧛‍♀️ 🧛‍♀️ 🧛‍♀️
    WOMAN_VAMPIRE(intArrayOf(0x1F9DB,0x200D,0x2640,0xFE0F)),
    // 🧜 🧜 🧜
    MERPERSON(intArrayOf(0x1F9DC)),
    // 🧜‍♂️ 🧜‍♂️ 🧜‍♂️
    MERMAN(intArrayOf(0x1F9DC,0x200D,0x2642,0xFE0F)),
    // 🧜‍♀️ 🧜‍♀️ 🧜‍♀️
    MERMAID(intArrayOf(0x1F9DC,0x200D,0x2640,0xFE0F)),
    // 🧝 🧝 🧝
    ELF(intArrayOf(0x1F9DD)),
    // 🧝‍♂️ 🧝‍♂️ 🧝‍♂️
    MAN_ELF(intArrayOf(0x1F9DD,0x200D,0x2642,0xFE0F)),
    // 🧝‍♀️ 🧝‍♀️ 🧝‍♀️
    WOMAN_ELF(intArrayOf(0x1F9DD,0x200D,0x2640,0xFE0F)),
    // 🧞 🧞 🧞
    GENIE(intArrayOf(0x1F9DE)),
    // 🧞‍♂️ 🧞‍♂️ 🧞‍♂️
    MAN_GENIE(intArrayOf(0x1F9DE,0x200D,0x2642,0xFE0F)),
    // 🧞‍♀️ 🧞‍♀️ 🧞‍♀️
    WOMAN_GENIE(intArrayOf(0x1F9DE,0x200D,0x2640,0xFE0F)),
    // 🧟 🧟 🧟
    ZOMBIE(intArrayOf(0x1F9DF)),
    // 🧟‍♂️ 🧟‍♂️ 🧟‍♂️
    MAN_ZOMBIE(intArrayOf(0x1F9DF,0x200D,0x2642,0xFE0F)),
    // 🧟‍♀️ 🧟‍♀️ 🧟‍♀️
    WOMAN_ZOMBIE(intArrayOf(0x1F9DF,0x200D,0x2640,0xFE0F)),
    // 🧌 🧌 🧌
    TROLL(intArrayOf(0x1F9CC)),
    // 💆 💆 💆
    PERSON_GETTING_MASSAGE(intArrayOf(0x1F486)),
    // 💆‍♂️ 💆‍♂️ 💆‍♂️
    MAN_GETTING_MASSAGE(intArrayOf(0x1F486,0x200D,0x2642,0xFE0F)),
    // 💆‍♀️ 💆‍♀️ 💆‍♀️
    WOMAN_GETTING_MASSAGE(intArrayOf(0x1F486,0x200D,0x2640,0xFE0F)),
    // 💇 💇 💇
    PERSON_GETTING_HAIRCUT(intArrayOf(0x1F487)),
    // 💇‍♂️ 💇‍♂️ 💇‍♂️
    MAN_GETTING_HAIRCUT(intArrayOf(0x1F487,0x200D,0x2642,0xFE0F)),
    // 💇‍♀️ 💇‍♀️ 💇‍♀️
    WOMAN_GETTING_HAIRCUT(intArrayOf(0x1F487,0x200D,0x2640,0xFE0F)),
    // 🚶 🚶 🚶
    PERSON_WALKING(intArrayOf(0x1F6B6)),
    // 🚶‍♂️ 🚶‍♂️ 🚶‍♂️
    MAN_WALKING(intArrayOf(0x1F6B6,0x200D,0x2642,0xFE0F)),
    // 🚶‍♀️ 🚶‍♀️ 🚶‍♀️
    WOMAN_WALKING(intArrayOf(0x1F6B6,0x200D,0x2640,0xFE0F)),
    // 🧍 🧍 🧍
    PERSON_STANDING(intArrayOf(0x1F9CD)),
    // 🧍‍♂️ 🧍‍♂️ 🧍‍♂️
    MAN_STANDING(intArrayOf(0x1F9CD,0x200D,0x2642,0xFE0F)),
    // 🧍‍♀️ 🧍‍♀️ 🧍‍♀️
    WOMAN_STANDING(intArrayOf(0x1F9CD,0x200D,0x2640,0xFE0F)),
    // 🧎 🧎 🧎
    PERSON_KNEELING(intArrayOf(0x1F9CE)),
    // 🧎‍♂️ 🧎‍♂️ 🧎‍♂️
    MAN_KNEELING(intArrayOf(0x1F9CE,0x200D,0x2642,0xFE0F)),
    // 🧎‍♀️ 🧎‍♀️ 🧎‍♀️
    WOMAN_KNEELING(intArrayOf(0x1F9CE,0x200D,0x2640,0xFE0F)),
    // 🧑‍🦯 🧑‍🦯 🧑‍🦯
    PERSON_WITH_WHITE_CANE(intArrayOf(0x1F9D1,0x200D,0x1F9AF)),
    // 👨‍🦯 👨‍🦯 👨‍🦯
    MAN_WITH_WHITE_CANE(intArrayOf(0x1F468,0x200D,0x1F9AF)),
    // 👩‍🦯 👩‍🦯 👩‍🦯
    WOMAN_WITH_WHITE_CANE(intArrayOf(0x1F469,0x200D,0x1F9AF)),
    // 🧑‍🦼 🧑‍🦼 🧑‍🦼
    PERSON_IN_MOTORIZED_WHEELCHAIR(intArrayOf(0x1F9D1,0x200D,0x1F9BC)),
    // 👨‍🦼 👨‍🦼 👨‍🦼
    MAN_IN_MOTORIZED_WHEELCHAIR(intArrayOf(0x1F468,0x200D,0x1F9BC)),
    // 👩‍🦼 👩‍🦼 👩‍🦼
    WOMAN_IN_MOTORIZED_WHEELCHAIR(intArrayOf(0x1F469,0x200D,0x1F9BC)),
    // 🧑‍🦽 🧑‍🦽 🧑‍🦽
    PERSON_IN_MANUAL_WHEELCHAIR(intArrayOf(0x1F9D1,0x200D,0x1F9BD)),
    // 👨‍🦽 👨‍🦽 👨‍🦽
    MAN_IN_MANUAL_WHEELCHAIR(intArrayOf(0x1F468,0x200D,0x1F9BD)),
    // 👩‍🦽 👩‍🦽 👩‍🦽
    WOMAN_IN_MANUAL_WHEELCHAIR(intArrayOf(0x1F469,0x200D,0x1F9BD)),
    // 🏃 🏃 🏃
    PERSON_RUNNING(intArrayOf(0x1F3C3)),
    // 🏃‍♂️ 🏃‍♂️ 🏃‍♂️
    MAN_RUNNING(intArrayOf(0x1F3C3,0x200D,0x2642,0xFE0F)),
    // 🏃‍♀️ 🏃‍♀️ 🏃‍♀️
    WOMAN_RUNNING(intArrayOf(0x1F3C3,0x200D,0x2640,0xFE0F)),
    // 💃 💃 💃
    WOMAN_DANCING(intArrayOf(0x1F483)),
    // 🕺 🕺 🕺
    MAN_DANCING(intArrayOf(0x1F57A)),
    // 🕴️ 🕴️ 🕴️
    PERSON_IN_SUIT_LEVITATING(intArrayOf(0x1F574,0xFE0F)),
    // 👯 👯 👯
    PEOPLE_WITH_BUNNY_EARS(intArrayOf(0x1F46F)),
    // 👯‍♂️ 👯‍♂️ 👯‍♂️
    MEN_WITH_BUNNY_EARS(intArrayOf(0x1F46F,0x200D,0x2642,0xFE0F)),
    // 👯‍♀️ 👯‍♀️ 👯‍♀️
    WOMEN_WITH_BUNNY_EARS(intArrayOf(0x1F46F,0x200D,0x2640,0xFE0F)),
    // 🧖 🧖 🧖
    PERSON_IN_STEAMY_ROOM(intArrayOf(0x1F9D6)),
    // 🧖‍♂️ 🧖‍♂️ 🧖‍♂️
    MAN_IN_STEAMY_ROOM(intArrayOf(0x1F9D6,0x200D,0x2642,0xFE0F)),
    // 🧖‍♀️ 🧖‍♀️ 🧖‍♀️
    WOMAN_IN_STEAMY_ROOM(intArrayOf(0x1F9D6,0x200D,0x2640,0xFE0F)),
    // 🧗 🧗 🧗
    PERSON_CLIMBING(intArrayOf(0x1F9D7)),
    // 🧗‍♂️ 🧗‍♂️ 🧗‍♂️
    MAN_CLIMBING(intArrayOf(0x1F9D7,0x200D,0x2642,0xFE0F)),
    // 🧗‍♀️ 🧗‍♀️ 🧗‍♀️
    WOMAN_CLIMBING(intArrayOf(0x1F9D7,0x200D,0x2640,0xFE0F)),
    // 🤺 🤺 🤺
    PERSON_FENCING(intArrayOf(0x1F93A)),
    // 🏇 🏇 🏇
    HORSE_RACING(intArrayOf(0x1F3C7)),
    // ⛷️ ⛷️ ⛷️
    SKIER(intArrayOf(0x26F7,0xFE0F)),
    // 🏂 🏂 🏂
    SNOWBOARDER(intArrayOf(0x1F3C2)),
    // 🏌️ 🏌️ 🏌️
    PERSON_GOLFING(intArrayOf(0x1F3CC,0xFE0F)),
    // 🏌️‍♂️ 🏌️‍♂️ 🏌️‍♂️
    MAN_GOLFING(intArrayOf(0x1F3CC,0xFE0F,0x200D,0x2642,0xFE0F)),
    // 🏌️‍♀️ 🏌️‍♀️ 🏌️‍♀️
    WOMAN_GOLFING(intArrayOf(0x1F3CC,0xFE0F,0x200D,0x2640,0xFE0F)),
    // 🏄 🏄 🏄
    PERSON_SURFING(intArrayOf(0x1F3C4)),
    // 🏄‍♂️ 🏄‍♂️ 🏄‍♂️
    MAN_SURFING(intArrayOf(0x1F3C4,0x200D,0x2642,0xFE0F)),
    // 🏄‍♀️ 🏄‍♀️ 🏄‍♀️
    WOMAN_SURFING(intArrayOf(0x1F3C4,0x200D,0x2640,0xFE0F)),
    // 🚣 🚣 🚣
    PERSON_ROWING_BOAT(intArrayOf(0x1F6A3)),
    // 🚣‍♂️ 🚣‍♂️ 🚣‍♂️
    MAN_ROWING_BOAT(intArrayOf(0x1F6A3,0x200D,0x2642,0xFE0F)),
    // 🚣‍♀️ 🚣‍♀️ 🚣‍♀️
    WOMAN_ROWING_BOAT(intArrayOf(0x1F6A3,0x200D,0x2640,0xFE0F)),
    // 🏊 🏊 🏊
    PERSON_SWIMMING(intArrayOf(0x1F3CA)),
    // 🏊‍♂️ 🏊‍♂️ 🏊‍♂️
    MAN_SWIMMING(intArrayOf(0x1F3CA,0x200D,0x2642,0xFE0F)),
    // 🏊‍♀️ 🏊‍♀️ 🏊‍♀️
    WOMAN_SWIMMING(intArrayOf(0x1F3CA,0x200D,0x2640,0xFE0F)),
    // ⛹️ ⛹️ ⛹️
    PERSON_BOUNCING_BALL(intArrayOf(0x26F9,0xFE0F)),
    // ⛹️‍♂️ ⛹️‍♂️ ⛹️‍♂️
    MAN_BOUNCING_BALL(intArrayOf(0x26F9,0xFE0F,0x200D,0x2642,0xFE0F)),
    // ⛹️‍♀️ ⛹️‍♀️ ⛹️‍♀️
    WOMAN_BOUNCING_BALL(intArrayOf(0x26F9,0xFE0F,0x200D,0x2640,0xFE0F)),
    // 🏋️ 🏋️ 🏋️
    PERSON_LIFTING_WEIGHTS(intArrayOf(0x1F3CB,0xFE0F)),
    // 🏋️‍♂️ 🏋️‍♂️ 🏋️‍♂️
    MAN_LIFTING_WEIGHTS(intArrayOf(0x1F3CB,0xFE0F,0x200D,0x2642,0xFE0F)),
    // 🏋️‍♀️ 🏋️‍♀️ 🏋️‍♀️
    WOMAN_LIFTING_WEIGHTS(intArrayOf(0x1F3CB,0xFE0F,0x200D,0x2640,0xFE0F)),
    // 🚴 🚴 🚴
    PERSON_BIKING(intArrayOf(0x1F6B4)),
    // 🚴‍♂️ 🚴‍♂️ 🚴‍♂️
    MAN_BIKING(intArrayOf(0x1F6B4,0x200D,0x2642,0xFE0F)),
    // 🚴‍♀️ 🚴‍♀️ 🚴‍♀️
    WOMAN_BIKING(intArrayOf(0x1F6B4,0x200D,0x2640,0xFE0F)),
    // 🚵 🚵 🚵
    PERSON_MOUNTAIN_BIKING(intArrayOf(0x1F6B5)),
    // 🚵‍♂️ 🚵‍♂️ 🚵‍♂️
    MAN_MOUNTAIN_BIKING(intArrayOf(0x1F6B5,0x200D,0x2642,0xFE0F)),
    // 🚵‍♀️ 🚵‍♀️ 🚵‍♀️
    WOMAN_MOUNTAIN_BIKING(intArrayOf(0x1F6B5,0x200D,0x2640,0xFE0F)),
    // 🤸 🤸 🤸
    PERSON_CARTWHEELING(intArrayOf(0x1F938)),
    // 🤸‍♂️ 🤸‍♂️ 🤸‍♂️
    MAN_CARTWHEELING(intArrayOf(0x1F938,0x200D,0x2642,0xFE0F)),
    // 🤸‍♀️ 🤸‍♀️ 🤸‍♀️
    WOMAN_CARTWHEELING(intArrayOf(0x1F938,0x200D,0x2640,0xFE0F)),
    // 🤼 🤼 🤼
    PEOPLE_WRESTLING(intArrayOf(0x1F93C)),
    // 🤼‍♂️ 🤼‍♂️ 🤼‍♂️
    MEN_WRESTLING(intArrayOf(0x1F93C,0x200D,0x2642,0xFE0F)),
    // 🤼‍♀️ 🤼‍♀️ 🤼‍♀️
    WOMEN_WRESTLING(intArrayOf(0x1F93C,0x200D,0x2640,0xFE0F)),
    // 🤽 🤽 🤽
    PERSON_PLAYING_WATER_POLO(intArrayOf(0x1F93D)),
    // 🤽‍♂️ 🤽‍♂️ 🤽‍♂️
    MAN_PLAYING_WATER_POLO(intArrayOf(0x1F93D,0x200D,0x2642,0xFE0F)),
    // 🤽‍♀️ 🤽‍♀️ 🤽‍♀️
    WOMAN_PLAYING_WATER_POLO(intArrayOf(0x1F93D,0x200D,0x2640,0xFE0F)),
    // 🤾 🤾 🤾
    PERSON_PLAYING_HANDBALL(intArrayOf(0x1F93E)),
    // 🤾‍♂️ 🤾‍♂️ 🤾‍♂️
    MAN_PLAYING_HANDBALL(intArrayOf(0x1F93E,0x200D,0x2642,0xFE0F)),
    // 🤾‍♀️ 🤾‍♀️ 🤾‍♀️
    WOMAN_PLAYING_HANDBALL(intArrayOf(0x1F93E,0x200D,0x2640,0xFE0F)),
    // 🤹 🤹 🤹
    PERSON_JUGGLING(intArrayOf(0x1F939)),
    // 🤹‍♂️ 🤹‍♂️ 🤹‍♂️
    MAN_JUGGLING(intArrayOf(0x1F939,0x200D,0x2642,0xFE0F)),
    // 🤹‍♀️ 🤹‍♀️ 🤹‍♀️
    WOMAN_JUGGLING(intArrayOf(0x1F939,0x200D,0x2640,0xFE0F)),
    // 🧘 🧘 🧘
    PERSON_IN_LOTUS_POSITION(intArrayOf(0x1F9D8)),
    // 🧘‍♂️ 🧘‍♂️ 🧘‍♂️
    MAN_IN_LOTUS_POSITION(intArrayOf(0x1F9D8,0x200D,0x2642,0xFE0F)),
    // 🧘‍♀️ 🧘‍♀️ 🧘‍♀️
    WOMAN_IN_LOTUS_POSITION(intArrayOf(0x1F9D8,0x200D,0x2640,0xFE0F)),
    // 🛀 🛀 🛀
    PERSON_TAKING_BATH(intArrayOf(0x1F6C0)),
    // 🛌 🛌 🛌
    PERSON_IN_BED(intArrayOf(0x1F6CC)),
    // 🧑‍🤝‍🧑 🧑‍🤝‍🧑 🧑‍🤝‍🧑
    PEOPLE_HOLDING_HANDS(intArrayOf(0x1F9D1,0x200D,0x1F91D,0x200D,0x1F9D1)),
    // 👭 👭 👭
    WOMEN_HOLDING_HANDS(intArrayOf(0x1F46D)),
    // 👫 👫 👫
    WOMAN_AND_MAN_HOLDING_HANDS(intArrayOf(0x1F46B)),
    // 👬 👬 👬
    MEN_HOLDING_HANDS(intArrayOf(0x1F46C)),
    // 💏 💏 💏
    KISS(intArrayOf(0x1F48F)),
    // 👩‍❤️‍💋‍👨 👩‍❤️‍💋‍👨 👩‍❤️‍💋‍👨
    KISS_WOMANCOMMA_MAN(intArrayOf(0x1F469,0x200D,0x2764,0xFE0F,0x200D,0x1F48B,0x200D,0x1F468)),
    // 👨‍❤️‍💋‍👨 👨‍❤️‍💋‍👨 👨‍❤️‍💋‍👨
    KISS_MANCOMMA_MAN(intArrayOf(0x1F468,0x200D,0x2764,0xFE0F,0x200D,0x1F48B,0x200D,0x1F468)),
    // 👩‍❤️‍💋‍👩 👩‍❤️‍💋‍👩 👩‍❤️‍💋‍👩
    KISS_WOMANCOMMA_WOMAN(intArrayOf(0x1F469,0x200D,0x2764,0xFE0F,0x200D,0x1F48B,0x200D,0x1F469)),
    // 💑 💑 💑
    COUPLE_WITH_HEART(intArrayOf(0x1F491)),
    // 👩‍❤️‍👨 👩‍❤️‍👨 👩‍❤️‍👨
    COUPLE_WITH_HEART_WOMANCOMMA_MAN(intArrayOf(0x1F469,0x200D,0x2764,0xFE0F,0x200D,0x1F468)),
    // 👨‍❤️‍👨 👨‍❤️‍👨 👨‍❤️‍👨
    COUPLE_WITH_HEART_MANCOMMA_MAN(intArrayOf(0x1F468,0x200D,0x2764,0xFE0F,0x200D,0x1F468)),
    // 👩‍❤️‍👩 👩‍❤️‍👩 👩‍❤️‍👩
    COUPLE_WITH_HEART_WOMANCOMMA_WOMAN(intArrayOf(0x1F469,0x200D,0x2764,0xFE0F,0x200D,0x1F469)),
    // 👪 👪 👪
    FAMILY(intArrayOf(0x1F46A)),
    // 👨‍👩‍👦 👨‍👩‍👦 👨‍👩‍👦
    FAMILY_MANCOMMA_WOMANCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F469,0x200D,0x1F466)),
    // 👨‍👩‍👧 👨‍👩‍👧 👨‍👩‍👧
    FAMILY_MANCOMMA_WOMANCOMMA_GIRL(intArrayOf(0x1F468,0x200D,0x1F469,0x200D,0x1F467)),
    // 👨‍👩‍👧‍👦 👨‍👩‍👧‍👦 👨‍👩‍👧‍👦
    FAMILY_MANCOMMA_WOMANCOMMA_GIRLCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F469,0x200D,0x1F467,0x200D,0x1F466)),
    // 👨‍👩‍👦‍👦 👨‍👩‍👦‍👦 👨‍👩‍👦‍👦
    FAMILY_MANCOMMA_WOMANCOMMA_BOYCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F469,0x200D,0x1F466,0x200D,0x1F466)),
    // 👨‍👩‍👧‍👧 👨‍👩‍👧‍👧 👨‍👩‍👧‍👧
    FAMILY_MANCOMMA_WOMANCOMMA_GIRLCOMMA_GIRL(intArrayOf(0x1F468,0x200D,0x1F469,0x200D,0x1F467,0x200D,0x1F467)),
    // 👨‍👨‍👦 👨‍👨‍👦 👨‍👨‍👦
    FAMILY_MANCOMMA_MANCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F468,0x200D,0x1F466)),
    // 👨‍👨‍👧 👨‍👨‍👧 👨‍👨‍👧
    FAMILY_MANCOMMA_MANCOMMA_GIRL(intArrayOf(0x1F468,0x200D,0x1F468,0x200D,0x1F467)),
    // 👨‍👨‍👧‍👦 👨‍👨‍👧‍👦 👨‍👨‍👧‍👦
    FAMILY_MANCOMMA_MANCOMMA_GIRLCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F468,0x200D,0x1F467,0x200D,0x1F466)),
    // 👨‍👨‍👦‍👦 👨‍👨‍👦‍👦 👨‍👨‍👦‍👦
    FAMILY_MANCOMMA_MANCOMMA_BOYCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F468,0x200D,0x1F466,0x200D,0x1F466)),
    // 👨‍👨‍👧‍👧 👨‍👨‍👧‍👧 👨‍👨‍👧‍👧
    FAMILY_MANCOMMA_MANCOMMA_GIRLCOMMA_GIRL(intArrayOf(0x1F468,0x200D,0x1F468,0x200D,0x1F467,0x200D,0x1F467)),
    // 👩‍👩‍👦 👩‍👩‍👦 👩‍👩‍👦
    FAMILY_WOMANCOMMA_WOMANCOMMA_BOY(intArrayOf(0x1F469,0x200D,0x1F469,0x200D,0x1F466)),
    // 👩‍👩‍👧 👩‍👩‍👧 👩‍👩‍👧
    FAMILY_WOMANCOMMA_WOMANCOMMA_GIRL(intArrayOf(0x1F469,0x200D,0x1F469,0x200D,0x1F467)),
    // 👩‍👩‍👧‍👦 👩‍👩‍👧‍👦 👩‍👩‍👧‍👦
    FAMILY_WOMANCOMMA_WOMANCOMMA_GIRLCOMMA_BOY(intArrayOf(0x1F469,0x200D,0x1F469,0x200D,0x1F467,0x200D,0x1F466)),
    // 👩‍👩‍👦‍👦 👩‍👩‍👦‍👦 👩‍👩‍👦‍👦
    FAMILY_WOMANCOMMA_WOMANCOMMA_BOYCOMMA_BOY(intArrayOf(0x1F469,0x200D,0x1F469,0x200D,0x1F466,0x200D,0x1F466)),
    // 👩‍👩‍👧‍👧 👩‍👩‍👧‍👧 👩‍👩‍👧‍👧
    FAMILY_WOMANCOMMA_WOMANCOMMA_GIRLCOMMA_GIRL(intArrayOf(0x1F469,0x200D,0x1F469,0x200D,0x1F467,0x200D,0x1F467)),
    // 👨‍👦 👨‍👦 👨‍👦
    FAMILY_MANCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F466)),
    // 👨‍👦‍👦 👨‍👦‍👦 👨‍👦‍👦
    FAMILY_MANCOMMA_BOYCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F466,0x200D,0x1F466)),
    // 👨‍👧 👨‍👧 👨‍👧
    FAMILY_MANCOMMA_GIRL(intArrayOf(0x1F468,0x200D,0x1F467)),
    // 👨‍👧‍👦 👨‍👧‍👦 👨‍👧‍👦
    FAMILY_MANCOMMA_GIRLCOMMA_BOY(intArrayOf(0x1F468,0x200D,0x1F467,0x200D,0x1F466)),
    // 👨‍👧‍👧 👨‍👧‍👧 👨‍👧‍👧
    FAMILY_MANCOMMA_GIRLCOMMA_GIRL(intArrayOf(0x1F468,0x200D,0x1F467,0x200D,0x1F467)),
    // 👩‍👦 👩‍👦 👩‍👦
    FAMILY_WOMANCOMMA_BOY(intArrayOf(0x1F469,0x200D,0x1F466)),
    // 👩‍👦‍👦 👩‍👦‍👦 👩‍👦‍👦
    FAMILY_WOMANCOMMA_BOYCOMMA_BOY(intArrayOf(0x1F469,0x200D,0x1F466,0x200D,0x1F466)),
    // 👩‍👧 👩‍👧 👩‍👧
    FAMILY_WOMANCOMMA_GIRL(intArrayOf(0x1F469,0x200D,0x1F467)),
    // 👩‍👧‍👦 👩‍👧‍👦 👩‍👧‍👦
    FAMILY_WOMANCOMMA_GIRLCOMMA_BOY(intArrayOf(0x1F469,0x200D,0x1F467,0x200D,0x1F466)),
    // 👩‍👧‍👧 👩‍👧‍👧 👩‍👧‍👧
    FAMILY_WOMANCOMMA_GIRLCOMMA_GIRL(intArrayOf(0x1F469,0x200D,0x1F467,0x200D,0x1F467)),
    // 🗣️ 🗣️ 🗣️
    SPEAKING_HEAD(intArrayOf(0x1F5E3,0xFE0F)),
    // 👤 👤 👤
    BUST_IN_SILHOUETTE(intArrayOf(0x1F464)),
    // 👥 👥 👥
    BUSTS_IN_SILHOUETTE(intArrayOf(0x1F465)),
    // 🫂 🫂 🫂
    PEOPLE_HUGGING(intArrayOf(0x1FAC2)),
    // 👣 👣 👣
    FOOTPRINTS(intArrayOf(0x1F463)),
    // 🐵 🐵 🐵
    MONKEY_FACE(intArrayOf(0x1F435)),
    // 🐒 🐒 🐒
    MONKEY(intArrayOf(0x1F412)),
    // 🦍 🦍 🦍
    GORILLA(intArrayOf(0x1F98D)),
    // 🦧 🦧 🦧
    ORANGUTAN(intArrayOf(0x1F9A7)),
    // 🐶 🐶 🐶
    DOG_FACE(intArrayOf(0x1F436)),
    // 🐕 🐕 🐕
    DOG(intArrayOf(0x1F415)),
    // 🦮 🦮 🦮
    GUIDE_DOG(intArrayOf(0x1F9AE)),
    // 🐕‍🦺 🐕‍🦺 🐕‍🦺
    SERVICE_DOG(intArrayOf(0x1F415,0x200D,0x1F9BA)),
    // 🐩 🐩 🐩
    POODLE(intArrayOf(0x1F429)),
    // 🐺 🐺 🐺
    WOLF(intArrayOf(0x1F43A)),
    // 🦊 🦊 🦊
    FOX(intArrayOf(0x1F98A)),
    // 🦝 🦝 🦝
    RACCOON(intArrayOf(0x1F99D)),
    // 🐱 🐱 🐱
    CAT_FACE(intArrayOf(0x1F431)),
    // 🐈 🐈 🐈
    CAT(intArrayOf(0x1F408)),
    // 🐈‍⬛ 🐈‍⬛ 🐈‍⬛
    BLACK_CAT(intArrayOf(0x1F408,0x200D,0x2B1B)),
    // 🦁 🦁 🦁
    LION(intArrayOf(0x1F981)),
    // 🐯 🐯 🐯
    TIGER_FACE(intArrayOf(0x1F42F)),
    // 🐅 🐅 🐅
    TIGER(intArrayOf(0x1F405)),
    // 🐆 🐆 🐆
    LEOPARD(intArrayOf(0x1F406)),
    // 🐴 🐴 🐴
    HORSE_FACE(intArrayOf(0x1F434)),
    // 🫎 🫎 🫎
    MOOSE(intArrayOf(0x1FACE)),
    // 🫏 🫏 🫏
    DONKEY(intArrayOf(0x1FACF)),
    // 🐎 🐎 🐎
    HORSE(intArrayOf(0x1F40E)),
    // 🦄 🦄 🦄
    UNICORN(intArrayOf(0x1F984)),
    // 🦓 🦓 🦓
    ZEBRA(intArrayOf(0x1F993)),
    // 🦌 🦌 🦌
    DEER(intArrayOf(0x1F98C)),
    // 🦬 🦬 🦬
    BISON(intArrayOf(0x1F9AC)),
    // 🐮 🐮 🐮
    COW_FACE(intArrayOf(0x1F42E)),
    // 🐂 🐂 🐂
    OX(intArrayOf(0x1F402)),
    // 🐃 🐃 🐃
    WATER_BUFFALO(intArrayOf(0x1F403)),
    // 🐄 🐄 🐄
    COW(intArrayOf(0x1F404)),
    // 🐷 🐷 🐷
    PIG_FACE(intArrayOf(0x1F437)),
    // 🐖 🐖 🐖
    PIG(intArrayOf(0x1F416)),
    // 🐗 🐗 🐗
    BOAR(intArrayOf(0x1F417)),
    // 🐽 🐽 🐽
    PIG_NOSE(intArrayOf(0x1F43D)),
    // 🐏 🐏 🐏
    RAM(intArrayOf(0x1F40F)),
    // 🐑 🐑 🐑
    EWE(intArrayOf(0x1F411)),
    // 🐐 🐐 🐐
    GOAT(intArrayOf(0x1F410)),
    // 🐪 🐪 🐪
    CAMEL(intArrayOf(0x1F42A)),
    // 🐫 🐫 🐫
    TWO_HUMP_CAMEL(intArrayOf(0x1F42B)),
    // 🦙 🦙 🦙
    LLAMA(intArrayOf(0x1F999)),
    // 🦒 🦒 🦒
    GIRAFFE(intArrayOf(0x1F992)),
    // 🐘 🐘 🐘
    ELEPHANT(intArrayOf(0x1F418)),
    // 🦣 🦣 🦣
    MAMMOTH(intArrayOf(0x1F9A3)),
    // 🦏 🦏 🦏
    RHINOCEROS(intArrayOf(0x1F98F)),
    // 🦛 🦛 🦛
    HIPPOPOTAMUS(intArrayOf(0x1F99B)),
    // 🐭 🐭 🐭
    MOUSE_FACE(intArrayOf(0x1F42D)),
    // 🐁 🐁 🐁
    MOUSE(intArrayOf(0x1F401)),
    // 🐀 🐀 🐀
    RAT(intArrayOf(0x1F400)),
    // 🐹 🐹 🐹
    HAMSTER(intArrayOf(0x1F439)),
    // 🐰 🐰 🐰
    RABBIT_FACE(intArrayOf(0x1F430)),
    // 🐇 🐇 🐇
    RABBIT(intArrayOf(0x1F407)),
    // 🐿️ 🐿️ 🐿️
    CHIPMUNK(intArrayOf(0x1F43F,0xFE0F)),
    // 🦫 🦫 🦫
    BEAVER(intArrayOf(0x1F9AB)),
    // 🦔 🦔 🦔
    HEDGEHOG(intArrayOf(0x1F994)),
    // 🦇 🦇 🦇
    BAT(intArrayOf(0x1F987)),
    // 🐻 🐻 🐻
    BEAR(intArrayOf(0x1F43B)),
    // 🐻‍❄️ 🐻‍❄️ 🐻‍❄️
    POLAR_BEAR(intArrayOf(0x1F43B,0x200D,0x2744,0xFE0F)),
    // 🐨 🐨 🐨
    KOALA(intArrayOf(0x1F428)),
    // 🐼 🐼 🐼
    PANDA(intArrayOf(0x1F43C)),
    // 🦥 🦥 🦥
    SLOTH(intArrayOf(0x1F9A5)),
    // 🦦 🦦 🦦
    OTTER(intArrayOf(0x1F9A6)),
    // 🦨 🦨 🦨
    SKUNK(intArrayOf(0x1F9A8)),
    // 🦘 🦘 🦘
    KANGAROO(intArrayOf(0x1F998)),
    // 🦡 🦡 🦡
    BADGER(intArrayOf(0x1F9A1)),
    // 🐾 🐾 🐾
    PAW_PRINTS(intArrayOf(0x1F43E)),
    // 🦃 🦃 🦃
    TURKEY(intArrayOf(0x1F983)),
    // 🐔 🐔 🐔
    CHICKEN(intArrayOf(0x1F414)),
    // 🐓 🐓 🐓
    ROOSTER(intArrayOf(0x1F413)),
    // 🐣 🐣 🐣
    HATCHING_CHICK(intArrayOf(0x1F423)),
    // 🐤 🐤 🐤
    BABY_CHICK(intArrayOf(0x1F424)),
    // 🐥 🐥 🐥
    FRONT_FACING_BABY_CHICK(intArrayOf(0x1F425)),
    // 🐦 🐦 🐦
    BIRD(intArrayOf(0x1F426)),
    // 🐧 🐧 🐧
    PENGUIN(intArrayOf(0x1F427)),
    // 🕊️ 🕊️ 🕊️
    DOVE(intArrayOf(0x1F54A,0xFE0F)),
    // 🦅 🦅 🦅
    EAGLE(intArrayOf(0x1F985)),
    // 🦆 🦆 🦆
    DUCK(intArrayOf(0x1F986)),
    // 🦢 🦢 🦢
    SWAN(intArrayOf(0x1F9A2)),
    // 🦉 🦉 🦉
    OWL(intArrayOf(0x1F989)),
    // 🦤 🦤 🦤
    DODO(intArrayOf(0x1F9A4)),
    // 🪶 🪶 🪶
    FEATHER(intArrayOf(0x1FAB6)),
    // 🦩 🦩 🦩
    FLAMINGO(intArrayOf(0x1F9A9)),
    // 🦚 🦚 🦚
    PEACOCK(intArrayOf(0x1F99A)),
    // 🦜 🦜 🦜
    PARROT(intArrayOf(0x1F99C)),
    // 🪽 🪽 🪽
    WING(intArrayOf(0x1FABD)),
    // 🐦‍⬛ 🐦‍⬛ 🐦‍⬛
    BLACK_BIRD(intArrayOf(0x1F426,0x200D,0x2B1B)),
    // 🪿 🪿 🪿
    GOOSE(intArrayOf(0x1FABF)),
    // 🐸 🐸 🐸
    FROG(intArrayOf(0x1F438)),
    // 🐊 🐊 🐊
    CROCODILE(intArrayOf(0x1F40A)),
    // 🐢 🐢 🐢
    TURTLE(intArrayOf(0x1F422)),
    // 🦎 🦎 🦎
    LIZARD(intArrayOf(0x1F98E)),
    // 🐍 🐍 🐍
    SNAKE(intArrayOf(0x1F40D)),
    // 🐲 🐲 🐲
    DRAGON_FACE(intArrayOf(0x1F432)),
    // 🐉 🐉 🐉
    DRAGON(intArrayOf(0x1F409)),
    // 🦕 🦕 🦕
    SAUROPOD(intArrayOf(0x1F995)),
    // 🦖 🦖 🦖
    T_REX(intArrayOf(0x1F996)),
    // 🐳 🐳 🐳
    SPOUTING_WHALE(intArrayOf(0x1F433)),
    // 🐋 🐋 🐋
    WHALE(intArrayOf(0x1F40B)),
    // 🐬 🐬 🐬
    DOLPHIN(intArrayOf(0x1F42C)),
    // 🦭 🦭 🦭
    SEAL(intArrayOf(0x1F9AD)),
    // 🐟 🐟 🐟
    FISH(intArrayOf(0x1F41F)),
    // 🐠 🐠 🐠
    TROPICAL_FISH(intArrayOf(0x1F420)),
    // 🐡 🐡 🐡
    BLOWFISH(intArrayOf(0x1F421)),
    // 🦈 🦈 🦈
    SHARK(intArrayOf(0x1F988)),
    // 🐙 🐙 🐙
    OCTOPUS(intArrayOf(0x1F419)),
    // 🐚 🐚 🐚
    SPIRAL_SHELL(intArrayOf(0x1F41A)),
    // 🪸 🪸 🪸
    CORAL(intArrayOf(0x1FAB8)),
    // 🪼 🪼 🪼
    JELLYFISH(intArrayOf(0x1FABC)),
    // 🐌 🐌 🐌
    SNAIL(intArrayOf(0x1F40C)),
    // 🦋 🦋 🦋
    BUTTERFLY(intArrayOf(0x1F98B)),
    // 🐛 🐛 🐛
    BUG(intArrayOf(0x1F41B)),
    // 🐜 🐜 🐜
    ANT(intArrayOf(0x1F41C)),
    // 🐝 🐝 🐝
    HONEYBEE(intArrayOf(0x1F41D)),
    // 🪲 🪲 🪲
    BEETLE(intArrayOf(0x1FAB2)),
    // 🐞 🐞 🐞
    LADY_BEETLE(intArrayOf(0x1F41E)),
    // 🦗 🦗 🦗
    CRICKET(intArrayOf(0x1F997)),
    // 🪳 🪳 🪳
    COCKROACH(intArrayOf(0x1FAB3)),
    // 🕷️ 🕷️ 🕷️
    SPIDER(intArrayOf(0x1F577,0xFE0F)),
    // 🕸️ 🕸️ 🕸️
    SPIDER_WEB(intArrayOf(0x1F578,0xFE0F)),
    // 🦂 🦂 🦂
    SCORPION(intArrayOf(0x1F982)),
    // 🦟 🦟 🦟
    MOSQUITO(intArrayOf(0x1F99F)),
    // 🪰 🪰 🪰
    FLY(intArrayOf(0x1FAB0)),
    // 🪱 🪱 🪱
    WORM(intArrayOf(0x1FAB1)),
    // 🦠 🦠 🦠
    MICROBE(intArrayOf(0x1F9A0)),
    // 💐 💐 💐
    BOUQUET(intArrayOf(0x1F490)),
    // 🌸 🌸 🌸
    CHERRY_BLOSSOM(intArrayOf(0x1F338)),
    // 💮 💮 💮
    WHITE_FLOWER(intArrayOf(0x1F4AE)),
    // 🪷 🪷 🪷
    LOTUS(intArrayOf(0x1FAB7)),
    // 🏵️ 🏵️ 🏵️
    ROSETTE(intArrayOf(0x1F3F5,0xFE0F)),
    // 🌹 🌹 🌹
    ROSE(intArrayOf(0x1F339)),
    // 🥀 🥀 🥀
    WILTED_FLOWER(intArrayOf(0x1F940)),
    // 🌺 🌺 🌺
    HIBISCUS(intArrayOf(0x1F33A)),
    // 🌻 🌻 🌻
    SUNFLOWER(intArrayOf(0x1F33B)),
    // 🌼 🌼 🌼
    BLOSSOM(intArrayOf(0x1F33C)),
    // 🌷 🌷 🌷
    TULIP(intArrayOf(0x1F337)),
    // 🪻 🪻 🪻
    HYACINTH(intArrayOf(0x1FABB)),
    // 🌱 🌱 🌱
    SEEDLING(intArrayOf(0x1F331)),
    // 🪴 🪴 🪴
    POTTED_PLANT(intArrayOf(0x1FAB4)),
    // 🌲 🌲 🌲
    EVERGREEN_TREE(intArrayOf(0x1F332)),
    // 🌳 🌳 🌳
    DECIDUOUS_TREE(intArrayOf(0x1F333)),
    // 🌴 🌴 🌴
    PALM_TREE(intArrayOf(0x1F334)),
    // 🌵 🌵 🌵
    CACTUS(intArrayOf(0x1F335)),
    // 🌾 🌾 🌾
    SHEAF_OF_RICE(intArrayOf(0x1F33E)),
    // 🌿 🌿 🌿
    HERB(intArrayOf(0x1F33F)),
    // ☘️ ☘️ ☘️
    SHAMROCK(intArrayOf(0x2618,0xFE0F)),
    // 🍀 🍀 🍀
    FOUR_LEAF_CLOVER(intArrayOf(0x1F340)),
    // 🍁 🍁 🍁
    MAPLE_LEAF(intArrayOf(0x1F341)),
    // 🍂 🍂 🍂
    FALLEN_LEAF(intArrayOf(0x1F342)),
    // 🍃 🍃 🍃
    LEAF_FLUTTERING_IN_WIND(intArrayOf(0x1F343)),
    // 🪹 🪹 🪹
    EMPTY_NEST(intArrayOf(0x1FAB9)),
    // 🪺 🪺 🪺
    NEST_WITH_EGGS(intArrayOf(0x1FABA)),
    // 🍄 🍄 🍄
    MUSHROOM(intArrayOf(0x1F344)),
    // 🍇 🍇 🍇
    GRAPES(intArrayOf(0x1F347)),
    // 🍈 🍈 🍈
    MELON(intArrayOf(0x1F348)),
    // 🍉 🍉 🍉
    WATERMELON(intArrayOf(0x1F349)),
    // 🍊 🍊 🍊
    TANGERINE(intArrayOf(0x1F34A)),
    // 🍋 🍋 🍋
    LEMON(intArrayOf(0x1F34B)),
    // 🍌 🍌 🍌
    BANANA(intArrayOf(0x1F34C)),
    // 🍍 🍍 🍍
    PINEAPPLE(intArrayOf(0x1F34D)),
    // 🥭 🥭 🥭
    MANGO(intArrayOf(0x1F96D)),
    // 🍎 🍎 🍎
    RED_APPLE(intArrayOf(0x1F34E)),
    // 🍏 🍏 🍏
    GREEN_APPLE(intArrayOf(0x1F34F)),
    // 🍐 🍐 🍐
    PEAR(intArrayOf(0x1F350)),
    // 🍑 🍑 🍑
    PEACH(intArrayOf(0x1F351)),
    // 🍒 🍒 🍒
    CHERRIES(intArrayOf(0x1F352)),
    // 🍓 🍓 🍓
    STRAWBERRY(intArrayOf(0x1F353)),
    // 🫐 🫐 🫐
    BLUEBERRIES(intArrayOf(0x1FAD0)),
    // 🥝 🥝 🥝
    KIWI_FRUIT(intArrayOf(0x1F95D)),
    // 🍅 🍅 🍅
    TOMATO(intArrayOf(0x1F345)),
    // 🫒 🫒 🫒
    OLIVE(intArrayOf(0x1FAD2)),
    // 🥥 🥥 🥥
    COCONUT(intArrayOf(0x1F965)),
    // 🥑 🥑 🥑
    AVOCADO(intArrayOf(0x1F951)),
    // 🍆 🍆 🍆
    EGGPLANT(intArrayOf(0x1F346)),
    // 🥔 🥔 🥔
    POTATO(intArrayOf(0x1F954)),
    // 🥕 🥕 🥕
    CARROT(intArrayOf(0x1F955)),
    // 🌽 🌽 🌽
    EAR_OF_CORN(intArrayOf(0x1F33D)),
    // 🌶️ 🌶️ 🌶️
    HOT_PEPPER(intArrayOf(0x1F336,0xFE0F)),
    // 🫑 🫑 🫑
    BELL_PEPPER(intArrayOf(0x1FAD1)),
    // 🥒 🥒 🥒
    CUCUMBER(intArrayOf(0x1F952)),
    // 🥬 🥬 🥬
    LEAFY_GREEN(intArrayOf(0x1F96C)),
    // 🥦 🥦 🥦
    BROCCOLI(intArrayOf(0x1F966)),
    // 🧄 🧄 🧄
    GARLIC(intArrayOf(0x1F9C4)),
    // 🧅 🧅 🧅
    ONION(intArrayOf(0x1F9C5)),
    // 🥜 🥜 🥜
    PEANUTS(intArrayOf(0x1F95C)),
    // 🫘 🫘 🫘
    BEANS(intArrayOf(0x1FAD8)),
    // 🌰 🌰 🌰
    CHESTNUT(intArrayOf(0x1F330)),
    // 🫚 🫚 🫚
    GINGER_ROOT(intArrayOf(0x1FADA)),
    // 🫛 🫛 🫛
    PEA_POD(intArrayOf(0x1FADB)),
    // 🍞 🍞 🍞
    BREAD(intArrayOf(0x1F35E)),
    // 🥐 🥐 🥐
    CROISSANT(intArrayOf(0x1F950)),
    // 🥖 🥖 🥖
    BAGUETTE_BREAD(intArrayOf(0x1F956)),
    // 🫓 🫓 🫓
    FLATBREAD(intArrayOf(0x1FAD3)),
    // 🥨 🥨 🥨
    PRETZEL(intArrayOf(0x1F968)),
    // 🥯 🥯 🥯
    BAGEL(intArrayOf(0x1F96F)),
    // 🥞 🥞 🥞
    PANCAKES(intArrayOf(0x1F95E)),
    // 🧇 🧇 🧇
    WAFFLE(intArrayOf(0x1F9C7)),
    // 🧀 🧀 🧀
    CHEESE_WEDGE(intArrayOf(0x1F9C0)),
    // 🍖 🍖 🍖
    MEAT_ON_BONE(intArrayOf(0x1F356)),
    // 🍗 🍗 🍗
    POULTRY_LEG(intArrayOf(0x1F357)),
    // 🥩 🥩 🥩
    CUT_OF_MEAT(intArrayOf(0x1F969)),
    // 🥓 🥓 🥓
    BACON(intArrayOf(0x1F953)),
    // 🍔 🍔 🍔
    HAMBURGER(intArrayOf(0x1F354)),
    // 🍟 🍟 🍟
    FRENCH_FRIES(intArrayOf(0x1F35F)),
    // 🍕 🍕 🍕
    PIZZA(intArrayOf(0x1F355)),
    // 🌭 🌭 🌭
    HOT_DOG(intArrayOf(0x1F32D)),
    // 🥪 🥪 🥪
    SANDWICH(intArrayOf(0x1F96A)),
    // 🌮 🌮 🌮
    TACO(intArrayOf(0x1F32E)),
    // 🌯 🌯 🌯
    BURRITO(intArrayOf(0x1F32F)),
    // 🫔 🫔 🫔
    TAMALE(intArrayOf(0x1FAD4)),
    // 🥙 🥙 🥙
    STUFFED_FLATBREAD(intArrayOf(0x1F959)),
    // 🧆 🧆 🧆
    FALAFEL(intArrayOf(0x1F9C6)),
    // 🥚 🥚 🥚
    EGG(intArrayOf(0x1F95A)),
    // 🍳 🍳 🍳
    COOKING(intArrayOf(0x1F373)),
    // 🥘 🥘 🥘
    SHALLOW_PAN_OF_FOOD(intArrayOf(0x1F958)),
    // 🍲 🍲 🍲
    POT_OF_FOOD(intArrayOf(0x1F372)),
    // 🫕 🫕 🫕
    FONDUE(intArrayOf(0x1FAD5)),
    // 🥣 🥣 🥣
    BOWL_WITH_SPOON(intArrayOf(0x1F963)),
    // 🥗 🥗 🥗
    GREEN_SALAD(intArrayOf(0x1F957)),
    // 🍿 🍿 🍿
    POPCORN(intArrayOf(0x1F37F)),
    // 🧈 🧈 🧈
    BUTTER(intArrayOf(0x1F9C8)),
    // 🧂 🧂 🧂
    SALT(intArrayOf(0x1F9C2)),
    // 🥫 🥫 🥫
    CANNED_FOOD(intArrayOf(0x1F96B)),
    // 🍱 🍱 🍱
    BENTO_BOX(intArrayOf(0x1F371)),
    // 🍘 🍘 🍘
    RICE_CRACKER(intArrayOf(0x1F358)),
    // 🍙 🍙 🍙
    RICE_BALL(intArrayOf(0x1F359)),
    // 🍚 🍚 🍚
    COOKED_RICE(intArrayOf(0x1F35A)),
    // 🍛 🍛 🍛
    CURRY_RICE(intArrayOf(0x1F35B)),
    // 🍜 🍜 🍜
    STEAMING_BOWL(intArrayOf(0x1F35C)),
    // 🍝 🍝 🍝
    SPAGHETTI(intArrayOf(0x1F35D)),
    // 🍠 🍠 🍠
    ROASTED_SWEET_POTATO(intArrayOf(0x1F360)),
    // 🍢 🍢 🍢
    ODEN(intArrayOf(0x1F362)),
    // 🍣 🍣 🍣
    SUSHI(intArrayOf(0x1F363)),
    // 🍤 🍤 🍤
    FRIED_SHRIMP(intArrayOf(0x1F364)),
    // 🍥 🍥 🍥
    FISH_CAKE_WITH_SWIRL(intArrayOf(0x1F365)),
    // 🥮 🥮 🥮
    MOON_CAKE(intArrayOf(0x1F96E)),
    // 🍡 🍡 🍡
    DANGO(intArrayOf(0x1F361)),
    // 🥟 🥟 🥟
    DUMPLING(intArrayOf(0x1F95F)),
    // 🥠 🥠 🥠
    FORTUNE_COOKIE(intArrayOf(0x1F960)),
    // 🥡 🥡 🥡
    TAKEOUT_BOX(intArrayOf(0x1F961)),
    // 🦀 🦀 🦀
    CRAB(intArrayOf(0x1F980)),
    // 🦞 🦞 🦞
    LOBSTER(intArrayOf(0x1F99E)),
    // 🦐 🦐 🦐
    SHRIMP(intArrayOf(0x1F990)),
    // 🦑 🦑 🦑
    SQUID(intArrayOf(0x1F991)),
    // 🦪 🦪 🦪
    OYSTER(intArrayOf(0x1F9AA)),
    // 🍦 🍦 🍦
    SOFT_ICE_CREAM(intArrayOf(0x1F366)),
    // 🍧 🍧 🍧
    SHAVED_ICE(intArrayOf(0x1F367)),
    // 🍨 🍨 🍨
    ICE_CREAM(intArrayOf(0x1F368)),
    // 🍩 🍩 🍩
    DOUGHNUT(intArrayOf(0x1F369)),
    // 🍪 🍪 🍪
    COOKIE(intArrayOf(0x1F36A)),
    // 🎂 🎂 🎂
    BIRTHDAY_CAKE(intArrayOf(0x1F382)),
    // 🍰 🍰 🍰
    SHORTCAKE(intArrayOf(0x1F370)),
    // 🧁 🧁 🧁
    CUPCAKE(intArrayOf(0x1F9C1)),
    // 🥧 🥧 🥧
    PIE(intArrayOf(0x1F967)),
    // 🍫 🍫 🍫
    CHOCOLATE_BAR(intArrayOf(0x1F36B)),
    // 🍬 🍬 🍬
    CANDY(intArrayOf(0x1F36C)),
    // 🍭 🍭 🍭
    LOLLIPOP(intArrayOf(0x1F36D)),
    // 🍮 🍮 🍮
    CUSTARD(intArrayOf(0x1F36E)),
    // 🍯 🍯 🍯
    HONEY_POT(intArrayOf(0x1F36F)),
    // 🍼 🍼 🍼
    BABY_BOTTLE(intArrayOf(0x1F37C)),
    // 🥛 🥛 🥛
    GLASS_OF_MILK(intArrayOf(0x1F95B)),
    // ☕ ☕ ☕
    HOT_BEVERAGE(intArrayOf(0x2615)),
    // 🫖 🫖 🫖
    TEAPOT(intArrayOf(0x1FAD6)),
    // 🍵 🍵 🍵
    TEACUP_WITHOUT_HANDLE(intArrayOf(0x1F375)),
    // 🍶 🍶 🍶
    SAKE(intArrayOf(0x1F376)),
    // 🍾 🍾 🍾
    BOTTLE_WITH_POPPING_CORK(intArrayOf(0x1F37E)),
    // 🍷 🍷 🍷
    WINE_GLASS(intArrayOf(0x1F377)),
    // 🍸 🍸 🍸
    COCKTAIL_GLASS(intArrayOf(0x1F378)),
    // 🍹 🍹 🍹
    TROPICAL_DRINK(intArrayOf(0x1F379)),
    // 🍺 🍺 🍺
    BEER_MUG(intArrayOf(0x1F37A)),
    // 🍻 🍻 🍻
    CLINKING_BEER_MUGS(intArrayOf(0x1F37B)),
    // 🥂 🥂 🥂
    CLINKING_GLASSES(intArrayOf(0x1F942)),
    // 🥃 🥃 🥃
    TUMBLER_GLASS(intArrayOf(0x1F943)),
    // 🫗 🫗 🫗
    POURING_LIQUID(intArrayOf(0x1FAD7)),
    // 🥤 🥤 🥤
    CUP_WITH_STRAW(intArrayOf(0x1F964)),
    // 🧋 🧋 🧋
    BUBBLE_TEA(intArrayOf(0x1F9CB)),
    // 🧃 🧃 🧃
    BEVERAGE_BOX(intArrayOf(0x1F9C3)),
    // 🧉 🧉 🧉
    MATE(intArrayOf(0x1F9C9)),
    // 🧊 🧊 🧊
    ICE(intArrayOf(0x1F9CA)),
    // 🥢 🥢 🥢
    CHOPSTICKS(intArrayOf(0x1F962)),
    // 🍽️ 🍽️ 🍽️
    FORK_AND_KNIFE_WITH_PLATE(intArrayOf(0x1F37D,0xFE0F)),
    // 🍴 🍴 🍴
    FORK_AND_KNIFE(intArrayOf(0x1F374)),
    // 🥄 🥄 🥄
    SPOON(intArrayOf(0x1F944)),
    // 🔪 🔪 🔪
    KITCHEN_KNIFE(intArrayOf(0x1F52A)),
    // 🫙 🫙 🫙
    JAR(intArrayOf(0x1FAD9)),
    // 🏺 🏺 🏺
    AMPHORA(intArrayOf(0x1F3FA)),
    // 🌍 🌍 🌍
    GLOBE_SHOWING_EUROPE_AFRICA(intArrayOf(0x1F30D)),
    // 🌎 🌎 🌎
    GLOBE_SHOWING_AMERICAS(intArrayOf(0x1F30E)),
    // 🌏 🌏 🌏
    GLOBE_SHOWING_ASIA_AUSTRALIA(intArrayOf(0x1F30F)),
    // 🌐 🌐 🌐
    GLOBE_WITH_MERIDIANS(intArrayOf(0x1F310)),
    // 🗺️ 🗺️ 🗺️
    WORLD_MAP(intArrayOf(0x1F5FA,0xFE0F)),
    // 🗾 🗾 🗾
    MAP_OF_JAPAN(intArrayOf(0x1F5FE)),
    // 🧭 🧭 🧭
    COMPASS(intArrayOf(0x1F9ED)),
    // 🏔️ 🏔️ 🏔️
    SNOW_CAPPED_MOUNTAIN(intArrayOf(0x1F3D4,0xFE0F)),
    // ⛰️ ⛰️ ⛰️
    MOUNTAIN(intArrayOf(0x26F0,0xFE0F)),
    // 🌋 🌋 🌋
    VOLCANO(intArrayOf(0x1F30B)),
    // 🗻 🗻 🗻
    MOUNT_FUJI(intArrayOf(0x1F5FB)),
    // 🏕️ 🏕️ 🏕️
    CAMPING(intArrayOf(0x1F3D5,0xFE0F)),
    // 🏖️ 🏖️ 🏖️
    BEACH_WITH_UMBRELLA(intArrayOf(0x1F3D6,0xFE0F)),
    // 🏜️ 🏜️ 🏜️
    DESERT(intArrayOf(0x1F3DC,0xFE0F)),
    // 🏝️ 🏝️ 🏝️
    DESERT_ISLAND(intArrayOf(0x1F3DD,0xFE0F)),
    // 🏞️ 🏞️ 🏞️
    NATIONAL_PARK(intArrayOf(0x1F3DE,0xFE0F)),
    // 🏟️ 🏟️ 🏟️
    STADIUM(intArrayOf(0x1F3DF,0xFE0F)),
    // 🏛️ 🏛️ 🏛️
    CLASSICAL_BUILDING(intArrayOf(0x1F3DB,0xFE0F)),
    // 🏗️ 🏗️ 🏗️
    BUILDING_CONSTRUCTION(intArrayOf(0x1F3D7,0xFE0F)),
    // 🧱 🧱 🧱
    BRICK(intArrayOf(0x1F9F1)),
    // 🪨 🪨 🪨
    ROCK(intArrayOf(0x1FAA8)),
    // 🪵 🪵 🪵
    WOOD(intArrayOf(0x1FAB5)),
    // 🛖 🛖 🛖
    HUT(intArrayOf(0x1F6D6)),
    // 🏘️ 🏘️ 🏘️
    HOUSES(intArrayOf(0x1F3D8,0xFE0F)),
    // 🏚️ 🏚️ 🏚️
    DERELICT_HOUSE(intArrayOf(0x1F3DA,0xFE0F)),
    // 🏠 🏠 🏠
    HOUSE(intArrayOf(0x1F3E0)),
    // 🏡 🏡 🏡
    HOUSE_WITH_GARDEN(intArrayOf(0x1F3E1)),
    // 🏢 🏢 🏢
    OFFICE_BUILDING(intArrayOf(0x1F3E2)),
    // 🏣 🏣 🏣
    JAPANESE_POST_OFFICE(intArrayOf(0x1F3E3)),
    // 🏤 🏤 🏤
    POST_OFFICE(intArrayOf(0x1F3E4)),
    // 🏥 🏥 🏥
    HOSPITAL(intArrayOf(0x1F3E5)),
    // 🏦 🏦 🏦
    BANK(intArrayOf(0x1F3E6)),
    // 🏨 🏨 🏨
    HOTEL(intArrayOf(0x1F3E8)),
    // 🏩 🏩 🏩
    LOVE_HOTEL(intArrayOf(0x1F3E9)),
    // 🏪 🏪 🏪
    CONVENIENCE_STORE(intArrayOf(0x1F3EA)),
    // 🏫 🏫 🏫
    SCHOOL(intArrayOf(0x1F3EB)),
    // 🏬 🏬 🏬
    DEPARTMENT_STORE(intArrayOf(0x1F3EC)),
    // 🏭 🏭 🏭
    FACTORY(intArrayOf(0x1F3ED)),
    // 🏯 🏯 🏯
    JAPANESE_CASTLE(intArrayOf(0x1F3EF)),
    // 🏰 🏰 🏰
    CASTLE(intArrayOf(0x1F3F0)),
    // 💒 💒 💒
    WEDDING(intArrayOf(0x1F492)),
    // 🗼 🗼 🗼
    TOKYO_TOWER(intArrayOf(0x1F5FC)),
    // 🗽 🗽 🗽
    STATUE_OF_LIBERTY(intArrayOf(0x1F5FD)),
    // ⛪ ⛪ ⛪
    CHURCH(intArrayOf(0x26EA)),
    // 🕌 🕌 🕌
    MOSQUE(intArrayOf(0x1F54C)),
    // 🛕 🛕 🛕
    HINDU_TEMPLE(intArrayOf(0x1F6D5)),
    // 🕍 🕍 🕍
    SYNAGOGUE(intArrayOf(0x1F54D)),
    // ⛩️ ⛩️ ⛩️
    SHINTO_SHRINE(intArrayOf(0x26E9,0xFE0F)),
    // 🕋 🕋 🕋
    KAABA(intArrayOf(0x1F54B)),
    // ⛲ ⛲ ⛲
    FOUNTAIN(intArrayOf(0x26F2)),
    // ⛺ ⛺ ⛺
    TENT(intArrayOf(0x26FA)),
    // 🌁 🌁 🌁
    FOGGY(intArrayOf(0x1F301)),
    // 🌃 🌃 🌃
    NIGHT_WITH_STARS(intArrayOf(0x1F303)),
    // 🏙️ 🏙️ 🏙️
    CITYSCAPE(intArrayOf(0x1F3D9,0xFE0F)),
    // 🌄 🌄 🌄
    SUNRISE_OVER_MOUNTAINS(intArrayOf(0x1F304)),
    // 🌅 🌅 🌅
    SUNRISE(intArrayOf(0x1F305)),
    // 🌆 🌆 🌆
    CITYSCAPE_AT_DUSK(intArrayOf(0x1F306)),
    // 🌇 🌇 🌇
    SUNSET(intArrayOf(0x1F307)),
    // 🌉 🌉 🌉
    BRIDGE_AT_NIGHT(intArrayOf(0x1F309)),
    // ♨️ ♨️ ♨️
    HOT_SPRINGS(intArrayOf(0x2668,0xFE0F)),
    // 🎠 🎠 🎠
    CAROUSEL_HORSE(intArrayOf(0x1F3A0)),
    // 🛝 🛝 🛝
    PLAYGROUND_SLIDE(intArrayOf(0x1F6DD)),
    // 🎡 🎡 🎡
    FERRIS_WHEEL(intArrayOf(0x1F3A1)),
    // 🎢 🎢 🎢
    ROLLER_COASTER(intArrayOf(0x1F3A2)),
    // 💈 💈 💈
    BARBER_POLE(intArrayOf(0x1F488)),
    // 🎪 🎪 🎪
    CIRCUS_TENT(intArrayOf(0x1F3AA)),
    // 🚂 🚂 🚂
    LOCOMOTIVE(intArrayOf(0x1F682)),
    // 🚃 🚃 🚃
    RAILWAY_CAR(intArrayOf(0x1F683)),
    // 🚄 🚄 🚄
    HIGH_SPEED_TRAIN(intArrayOf(0x1F684)),
    // 🚅 🚅 🚅
    BULLET_TRAIN(intArrayOf(0x1F685)),
    // 🚆 🚆 🚆
    TRAIN(intArrayOf(0x1F686)),
    // 🚇 🚇 🚇
    METRO(intArrayOf(0x1F687)),
    // 🚈 🚈 🚈
    LIGHT_RAIL(intArrayOf(0x1F688)),
    // 🚉 🚉 🚉
    STATION(intArrayOf(0x1F689)),
    // 🚊 🚊 🚊
    TRAM(intArrayOf(0x1F68A)),
    // 🚝 🚝 🚝
    MONORAIL(intArrayOf(0x1F69D)),
    // 🚞 🚞 🚞
    MOUNTAIN_RAILWAY(intArrayOf(0x1F69E)),
    // 🚋 🚋 🚋
    TRAM_CAR(intArrayOf(0x1F68B)),
    // 🚌 🚌 🚌
    BUS(intArrayOf(0x1F68C)),
    // 🚍 🚍 🚍
    ONCOMING_BUS(intArrayOf(0x1F68D)),
    // 🚎 🚎 🚎
    TROLLEYBUS(intArrayOf(0x1F68E)),
    // 🚐 🚐 🚐
    MINIBUS(intArrayOf(0x1F690)),
    // 🚑 🚑 🚑
    AMBULANCE(intArrayOf(0x1F691)),
    // 🚒 🚒 🚒
    FIRE_ENGINE(intArrayOf(0x1F692)),
    // 🚓 🚓 🚓
    POLICE_CAR(intArrayOf(0x1F693)),
    // 🚔 🚔 🚔
    ONCOMING_POLICE_CAR(intArrayOf(0x1F694)),
    // 🚕 🚕 🚕
    TAXI(intArrayOf(0x1F695)),
    // 🚖 🚖 🚖
    ONCOMING_TAXI(intArrayOf(0x1F696)),
    // 🚗 🚗 🚗
    AUTOMOBILE(intArrayOf(0x1F697)),
    // 🚘 🚘 🚘
    ONCOMING_AUTOMOBILE(intArrayOf(0x1F698)),
    // 🚙 🚙 🚙
    SPORT_UTILITY_VEHICLE(intArrayOf(0x1F699)),
    // 🛻 🛻 🛻
    PICKUP_TRUCK(intArrayOf(0x1F6FB)),
    // 🚚 🚚 🚚
    DELIVERY_TRUCK(intArrayOf(0x1F69A)),
    // 🚛 🚛 🚛
    ARTICULATED_LORRY(intArrayOf(0x1F69B)),
    // 🚜 🚜 🚜
    TRACTOR(intArrayOf(0x1F69C)),
    // 🏎️ 🏎️ 🏎️
    RACING_CAR(intArrayOf(0x1F3CE,0xFE0F)),
    // 🏍️ 🏍️ 🏍️
    MOTORCYCLE(intArrayOf(0x1F3CD,0xFE0F)),
    // 🛵 🛵 🛵
    MOTOR_SCOOTER(intArrayOf(0x1F6F5)),
    // 🦽 🦽 🦽
    MANUAL_WHEELCHAIR(intArrayOf(0x1F9BD)),
    // 🦼 🦼 🦼
    MOTORIZED_WHEELCHAIR(intArrayOf(0x1F9BC)),
    // 🛺 🛺 🛺
    AUTO_RICKSHAW(intArrayOf(0x1F6FA)),
    // 🚲 🚲 🚲
    BICYCLE(intArrayOf(0x1F6B2)),
    // 🛴 🛴 🛴
    KICK_SCOOTER(intArrayOf(0x1F6F4)),
    // 🛹 🛹 🛹
    SKATEBOARD(intArrayOf(0x1F6F9)),
    // 🛼 🛼 🛼
    ROLLER_SKATE(intArrayOf(0x1F6FC)),
    // 🚏 🚏 🚏
    BUS_STOP(intArrayOf(0x1F68F)),
    // 🛣️ 🛣️ 🛣️
    MOTORWAY(intArrayOf(0x1F6E3,0xFE0F)),
    // 🛤️ 🛤️ 🛤️
    RAILWAY_TRACK(intArrayOf(0x1F6E4,0xFE0F)),
    // 🛢️ 🛢️ 🛢️
    OIL_DRUM(intArrayOf(0x1F6E2,0xFE0F)),
    // ⛽ ⛽ ⛽
    FUEL_PUMP(intArrayOf(0x26FD)),
    // 🛞 🛞 🛞
    WHEEL(intArrayOf(0x1F6DE)),
    // 🚨 🚨 🚨
    POLICE_CAR_LIGHT(intArrayOf(0x1F6A8)),
    // 🚥 🚥 🚥
    HORIZONTAL_TRAFFIC_LIGHT(intArrayOf(0x1F6A5)),
    // 🚦 🚦 🚦
    VERTICAL_TRAFFIC_LIGHT(intArrayOf(0x1F6A6)),
    // 🛑 🛑 🛑
    STOP_SIGN(intArrayOf(0x1F6D1)),
    // 🚧 🚧 🚧
    CONSTRUCTION(intArrayOf(0x1F6A7)),
    // ⚓ ⚓ ⚓
    ANCHOR(intArrayOf(0x2693)),
    // 🛟 🛟 🛟
    RING_BUOY(intArrayOf(0x1F6DF)),
    // ⛵ ⛵ ⛵
    SAILBOAT(intArrayOf(0x26F5)),
    // 🛶 🛶 🛶
    CANOE(intArrayOf(0x1F6F6)),
    // 🚤 🚤 🚤
    SPEEDBOAT(intArrayOf(0x1F6A4)),
    // 🛳️ 🛳️ 🛳️
    PASSENGER_SHIP(intArrayOf(0x1F6F3,0xFE0F)),
    // ⛴️ ⛴️ ⛴️
    FERRY(intArrayOf(0x26F4,0xFE0F)),
    // 🛥️ 🛥️ 🛥️
    MOTOR_BOAT(intArrayOf(0x1F6E5,0xFE0F)),
    // 🚢 🚢 🚢
    SHIP(intArrayOf(0x1F6A2)),
    // ✈️ ✈️ ✈️
    AIRPLANE(intArrayOf(0x2708,0xFE0F)),
    // 🛩️ 🛩️ 🛩️
    SMALL_AIRPLANE(intArrayOf(0x1F6E9,0xFE0F)),
    // 🛫 🛫 🛫
    AIRPLANE_DEPARTURE(intArrayOf(0x1F6EB)),
    // 🛬 🛬 🛬
    AIRPLANE_ARRIVAL(intArrayOf(0x1F6EC)),
    // 🪂 🪂 🪂
    PARACHUTE(intArrayOf(0x1FA82)),
    // 💺 💺 💺
    SEAT(intArrayOf(0x1F4BA)),
    // 🚁 🚁 🚁
    HELICOPTER(intArrayOf(0x1F681)),
    // 🚟 🚟 🚟
    SUSPENSION_RAILWAY(intArrayOf(0x1F69F)),
    // 🚠 🚠 🚠
    MOUNTAIN_CABLEWAY(intArrayOf(0x1F6A0)),
    // 🚡 🚡 🚡
    AERIAL_TRAMWAY(intArrayOf(0x1F6A1)),
    // 🛰️ 🛰️ 🛰️
    SATELLITE(intArrayOf(0x1F6F0,0xFE0F)),
    // 🚀 🚀 🚀
    ROCKET(intArrayOf(0x1F680)),
    // 🛸 🛸 🛸
    FLYING_SAUCER(intArrayOf(0x1F6F8)),
    // 🛎️ 🛎️ 🛎️
    BELLHOP_BELL(intArrayOf(0x1F6CE,0xFE0F)),
    // 🧳 🧳 🧳
    LUGGAGE(intArrayOf(0x1F9F3)),
    // ⌛ ⌛ ⌛
    HOURGLASS_DONE(intArrayOf(0x231B)),
    // ⏳ ⏳ ⏳
    HOURGLASS_NOT_DONE(intArrayOf(0x23F3)),
    // ⌚ ⌚ ⌚
    WATCH(intArrayOf(0x231A)),
    // ⏰ ⏰ ⏰
    ALARM_CLOCK(intArrayOf(0x23F0)),
    // ⏱️ ⏱️ ⏱️
    STOPWATCH(intArrayOf(0x23F1,0xFE0F)),
    // ⏲️ ⏲️ ⏲️
    TIMER_CLOCK(intArrayOf(0x23F2,0xFE0F)),
    // 🕰️ 🕰️ 🕰️
    MANTELPIECE_CLOCK(intArrayOf(0x1F570,0xFE0F)),
    // 🕛 🕛 🕛
    TWELVE_OCLOCK(intArrayOf(0x1F55B)),
    // 🕧 🕧 🕧
    TWELVE_THIRTY(intArrayOf(0x1F567)),
    // 🕐 🕐 🕐
    ONE_OCLOCK(intArrayOf(0x1F550)),
    // 🕜 🕜 🕜
    ONE_THIRTY(intArrayOf(0x1F55C)),
    // 🕑 🕑 🕑
    TWO_OCLOCK(intArrayOf(0x1F551)),
    // 🕝 🕝 🕝
    TWO_THIRTY(intArrayOf(0x1F55D)),
    // 🕒 🕒 🕒
    THREE_OCLOCK(intArrayOf(0x1F552)),
    // 🕞 🕞 🕞
    THREE_THIRTY(intArrayOf(0x1F55E)),
    // 🕓 🕓 🕓
    FOUR_OCLOCK(intArrayOf(0x1F553)),
    // 🕟 🕟 🕟
    FOUR_THIRTY(intArrayOf(0x1F55F)),
    // 🕔 🕔 🕔
    FIVE_OCLOCK(intArrayOf(0x1F554)),
    // 🕠 🕠 🕠
    FIVE_THIRTY(intArrayOf(0x1F560)),
    // 🕕 🕕 🕕
    SIX_OCLOCK(intArrayOf(0x1F555)),
    // 🕡 🕡 🕡
    SIX_THIRTY(intArrayOf(0x1F561)),
    // 🕖 🕖 🕖
    SEVEN_OCLOCK(intArrayOf(0x1F556)),
    // 🕢 🕢 🕢
    SEVEN_THIRTY(intArrayOf(0x1F562)),
    // 🕗 🕗 🕗
    EIGHT_OCLOCK(intArrayOf(0x1F557)),
    // 🕣 🕣 🕣
    EIGHT_THIRTY(intArrayOf(0x1F563)),
    // 🕘 🕘 🕘
    NINE_OCLOCK(intArrayOf(0x1F558)),
    // 🕤 🕤 🕤
    NINE_THIRTY(intArrayOf(0x1F564)),
    // 🕙 🕙 🕙
    TEN_OCLOCK(intArrayOf(0x1F559)),
    // 🕥 🕥 🕥
    TEN_THIRTY(intArrayOf(0x1F565)),
    // 🕚 🕚 🕚
    ELEVEN_OCLOCK(intArrayOf(0x1F55A)),
    // 🕦 🕦 🕦
    ELEVEN_THIRTY(intArrayOf(0x1F566)),
    // 🌑 🌑 🌑
    NEW_MOON(intArrayOf(0x1F311)),
    // 🌒 🌒 🌒
    WAXING_CRESCENT_MOON(intArrayOf(0x1F312)),
    // 🌓 🌓 🌓
    FIRST_QUARTER_MOON(intArrayOf(0x1F313)),
    // 🌔 🌔 🌔
    WAXING_GIBBOUS_MOON(intArrayOf(0x1F314)),
    // 🌕 🌕 🌕
    FULL_MOON(intArrayOf(0x1F315)),
    // 🌖 🌖 🌖
    WANING_GIBBOUS_MOON(intArrayOf(0x1F316)),
    // 🌗 🌗 🌗
    LAST_QUARTER_MOON(intArrayOf(0x1F317)),
    // 🌘 🌘 🌘
    WANING_CRESCENT_MOON(intArrayOf(0x1F318)),
    // 🌙 🌙 🌙
    CRESCENT_MOON(intArrayOf(0x1F319)),
    // 🌚 🌚 🌚
    NEW_MOON_FACE(intArrayOf(0x1F31A)),
    // 🌛 🌛 🌛
    FIRST_QUARTER_MOON_FACE(intArrayOf(0x1F31B)),
    // 🌜 🌜 🌜
    LAST_QUARTER_MOON_FACE(intArrayOf(0x1F31C)),
    // 🌡️ 🌡️ 🌡️
    THERMOMETER(intArrayOf(0x1F321,0xFE0F)),
    // ☀️ ☀️ ☀️
    SUN(intArrayOf(0x2600,0xFE0F)),
    // 🌝 🌝 🌝
    FULL_MOON_FACE(intArrayOf(0x1F31D));

    override fun toString() = String(intArray, 0, intArray.size)
}
