
class LoginData(object):
    """用户登录测试数据"""

    login_success_data = [
        (
            "15319781701",
            "Hxl_19921106",
            "153****1701@163.com"
        )
    ]

    login_fail_data = [
        (
            "15319781701",
            "",
            "请输入密码"
        ),
        (
            "",
            "hxl_1106",
            "请输入帐号"
        ),
        (
            "15319781701",
            "xiaochao",
            "帐号或密码错误"
        )
    ]


if __name__ == '__main__':
    pass
