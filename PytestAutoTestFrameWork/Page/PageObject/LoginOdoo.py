from Page.BasePage import BasePage
from util.parseConFile import ParseConFile
class LoginOdoo(BasePage):
    # 配置文件读取元素
    do_conf = ParseConFile()
    # 用户名 http://ac-sit.bpit.aqara.com/web/login
    username = do_conf.get_locators_or_account('OdooLoginPageElements', 'username')
    #密码
    password = do_conf.get_locators_or_account('OdooLoginPageElements', 'password')
    #登录按钮
    loginBtn = do_conf.get_locators_or_account('OdooLoginPageElements', 'loginBtn')

    def login(self, username, password):
        """登录流程"""
        self.open_url()
        self.input_username(username)
        self.input_password(password)
        self.click_login_btn()

    def open_url(self):
        return self.load_url('http://ac-sit.bpit.aqara.com/web/login')

    def input_username(self, username):
        return self.send_keys(*LoginOdoo.username,username)

    def input_password(self, password):
        return self.send_keys(*LoginOdoo.password, password)

    def click_login_btn(self):
        return self.click(*LoginOdoo.loginBtn)

    # def get_error_text(self):
    #     return self.get_element_text(*LoginOdoo.error_head)
    #
    # def get_login_success_account(self):
    #     return self.get_element_text(*LoginOdoo.account)


if __name__ == "__main__":
    pass